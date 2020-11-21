package com.example.addressselectormodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.addressselectormodule.adapter.CityAdapter
import com.example.addressselectormodule.model.AreaCommonBean
import com.example.addressselectormodule.model.ProvinceModel
import com.example.addressselectormodule.utils.JsonReadUtils
import com.example.addressselectormodule.utils.PinYinComparator
import com.example.addressselectormodule.utils.XmlParserHandler
import com.github.promeg.pinyinhelper.Pinyin


import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_city_recycler.*
import java.util.*
import javax.xml.parsers.SAXParserFactory

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/14 13:54
 * Description:
 */
class CityRecyclerActivity : AppCompatActivity() {

    //    private val mCityList = mutableListOf<PinYinComparator.CityBean>()
    private val mProvinceList = mutableListOf<PinYinComparator.ProvinceBean>()
    lateinit var mCityAdapter: CityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_recycler)

//        getCity()
        getProvinceData()
//        getCityData()
//        getDistinctData()

        city_recycler_recycler.layoutManager = LinearLayoutManager(this)
        Collections.sort(mProvinceList, PinYinComparator())
        mCityAdapter = CityAdapter(this, mProvinceList)
        city_recycler_recycler.adapter = mCityAdapter
        city_recycler_recycler.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                letterScroll()
            }
        })
        mCityAdapter.setOnSelectListener {
            tv_select_name.text = it.second
        }
    }


    /**
     * 监听滑动，使头字母停留
     */
    private fun letterScroll() {
        val letterView = city_recycler_recycler.findChildViewUnder(
            (city_recycler_letter_text.measuredWidth / 2).toFloat(),
            3.toFloat()
        )
        if (letterView != null && letterView.contentDescription != null) {
            city_recycler_letter_text.text = letterView.contentDescription.toString()
        }

        val recyclerItem = city_recycler_recycler.findChildViewUnder(
            (city_recycler_letter_text.measuredWidth / 2).toFloat(),
            (city_recycler_letter_text.measuredHeight + 1).toFloat()
        )

        if (recyclerItem != null && recyclerItem.tag != null) {
            val deltaY =
                recyclerItem.top - city_recycler_letter_text.measuredHeight
            when (recyclerItem.tag) {
                mCityAdapter.HAS_STICKY_VIEW -> {
                    if (recyclerItem.top > 0) {
                        city_recycler_letter_text.translationY = deltaY.toFloat()
                    } else {
                        city_recycler_letter_text.translationY = 0f
                    }
                }

                mCityAdapter.NONE_STICKY_VIEW -> city_recycler_letter_text.translationY = 0f
            }
        }
    }

    private fun getCity() {
        var provinceList: List<ProvinceModel>? = null
        val asset = assets
        try {
            val input = asset.open("province_data.xml")
            // 创建一个解析xml的工厂对象
            val spf = SAXParserFactory.newInstance()
            // 解析xml
            val parser = spf.newSAXParser()
            val handler = XmlParserHandler()
            parser.parse(input, handler)
            input.close()
            // 获取解析出来的数据 -- city
            provinceList = handler.dataList

//            for (i in provinceList.indices) {
//                // 遍历所有省的数据
//                val cityModels = provinceList[i].getCityList()
//                for (j in cityModels.indices) {
//                    // 遍历省下面的所有市的数据
//                    val name = cityModels[j].getName()
//                    val pinYin = PinYinComparator.getPinYin(name)
//                    if (pinYin.isNotEmpty()) {
//                        val sortLetter = pinYin.substring(0, 1).toUpperCase()
//                        val cityBean = PinYinComparator.ProvinceBean()
//                        cityBean.name = name
//                        cityBean.sortLetter = sortLetter
//                        mProviceList.add(cityBean)
//                    }
//                }
//            }

            // -- province
            provinceList.forEach {
                if (PinYinComparator.getPinYin(it.getName()).isNotEmpty()) {
                    val provinceBean = PinYinComparator.ProvinceBean()
                    with(provinceBean) {
                        areaName = it.getName()
                        sortLetter =
                            PinYinComparator.getPinYin(it.getName()).substring(0, 1).toUpperCase()
                    }
                    mProvinceList.add(provinceBean)
                }
            }

        } catch (e: Throwable) {
            e.printStackTrace()
        } finally {
        }
    }


    //省
    private fun getProvinceData() {
        val data = JsonReadUtils.getInstance().get(this, R.raw.area_province)
        val type = object : TypeToken<List<AreaCommonBean>>() {}.type
        val list: List<AreaCommonBean> = Gson().fromJson(data, type)

        list.forEach {
            if (PinYinComparator.getPinYin(it.areaName).isNotEmpty()) {
                val provinceBean = PinYinComparator.ProvinceBean()
                with(provinceBean) {
                    areaId = it.areaId
                    areaCode = it.areaCode
                    areaName = it.areaName
                    areaLevel = it.areaLevel
                    sortLetter = HanziToPinyinFirstLetter(it.areaName)
                }
                mProvinceList.add(provinceBean)
            }
        }
    }

    //市
    private fun getCityData() {
        val data = JsonReadUtils.getInstance().get(this, R.raw.area_city)
        val type = object : TypeToken<List<AreaCommonBean>>() {}.type
        val list: List<AreaCommonBean> = Gson().fromJson(data, type)
        list.forEach {
            if (PinYinComparator.getPinYin(it.areaName).isNotEmpty()) {
                val provinceBean = PinYinComparator.ProvinceBean()
                with(provinceBean) {
                    areaId = it.areaId
                    areaCode = it.areaCode
                    areaName = it.areaName
                    areaLevel = it.areaLevel
                    sortLetter =
                        PinYinComparator.getPinYin(it.areaName).substring(0, 1).toUpperCase()
                }
                mProvinceList.add(provinceBean)
            }
        }
    }

    //区
    private fun getDistinctData() {
        val data = JsonReadUtils.getInstance().get(this, R.raw.area_district)
        val type = object : TypeToken<List<AreaCommonBean>>() {}.type
        val list: List<AreaCommonBean> = Gson().fromJson(data, type)
        list.forEach {
            if (PinYinComparator.getPinYin(it.areaName).isNotEmpty()) {
                val provinceBean = PinYinComparator.ProvinceBean()
                with(provinceBean) {
                    areaId = it.areaId
                    areaCode = it.areaCode
                    areaName = it.areaName
                    areaLevel = it.areaLevel
                    sortLetter =
                        PinYinComparator.getPinYin(it.areaName).substring(0, 1).toUpperCase()
                }
                mProvinceList.add(provinceBean)
            }
        }
    }

    private fun HanziToPinyinFirstLetter(areaName: String): String {
        return if (areaName.contains("重庆")) {
            "C"
        } else {
            PinYinComparator.getPinYin(areaName).substring(0, 1).toUpperCase()
        }
    }

}