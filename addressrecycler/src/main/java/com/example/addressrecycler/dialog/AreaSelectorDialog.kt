package com.example.addressrecycler.dialog


import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.*
import androidx.core.app.ActivityCompat
import androidx.core.view.isVisible
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.addressrecycler.R
import com.example.addressrecycler.adapter.AreaBaseRecycleAdapter
import com.example.addressrecycler.model.AreaCommonBean
import com.example.addressrecycler.utils.JsonReadUtils
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_city_recycler.city_recycler_recycler
import kotlinx.android.synthetic.main.area_selector_dialog.*

class AreaSelectorDialog(
    private val mContext: Context/*,
    *//*private val previousProvinceBean: AreaCommonBean,
    private val previousCityBean: AreaCommonBean,
    private val previousDistinctBean: AreaCommonBean*//*
    private val previousProvinceName: String,
    private val previousCityName: String,
    private val previousDistinctName: String*/

) : DialogFragment() {

    private fun log(msg: String) {
        Log.e("shensq", msg)
    }

    private var onSelectCompleteListener: ((Triple<String, String, String>) -> Unit)? =
        null

    private val mProvinceList = mutableListOf<AreaCommonBean>()
    private val mCityList = mutableListOf<AreaCommonBean>()
    private val mDistinctList = mutableListOf<AreaCommonBean>()

    private var areaType = 0
    private var mSelectProvinceName = ""
    private var mSelectCityName = ""
    private var mSelectDistinctName = ""
//    private var mSelectProvinceBean = AreaCommonBean(
//        areaCode = "",
//        areaId = "",
//        areaLevel = "",
//        areaName = ""
//    )
//    private var mSelectCityBean = AreaCommonBean(
//        areaCode = "",
//        areaId = "",
//        areaLevel = "",
//        areaName = ""
//    )
//    private var mSelectDistinctBean = AreaCommonBean(
//        areaCode = "",
//        areaId = "",
//        areaLevel = "",
//        areaName = ""
//    )

    lateinit var mProvinceAdapter: AreaBaseRecycleAdapter

    fun setOnSelectCompleteListener(onSelectCompleteListener: ((Triple<String, String, String>) -> Unit)) {
        this.onSelectCompleteListener = onSelectCompleteListener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.area_selector_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        setListeners()
    }

    private fun initData() {
        getProvinceData()
        getCityData()
        getDistinctData()

        city_recycler_recycler.layoutManager = LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false)
        mProvinceAdapter = AreaBaseRecycleAdapter(mContext)
        mProvinceAdapter.initData(mProvinceList, areaType, "")
        city_recycler_recycler.adapter = mProvinceAdapter
//        initHasSelectedView()
        mProvinceAdapter.setOnSelectListener {
            when (areaType) {
                0 -> {
//                    mSelectProvinceBean = it
                    mSelectProvinceName = it.areaName
                    setProvinceSelectedCallBack()
                }
                1 -> {
//                    mSelectCityBean = it
                    mSelectCityName = it.areaName
                    setCitySelectedCallBack()
                }
                2 -> {
//                    mSelectDistinctBean = it
                    mSelectDistinctName = it.areaName
                    setDistinctSelectedCallBack()
                }
            }
        }
    }

    private fun setListeners() {
        iv_close.setOnClickListener {
            dismiss()
        }
        view_space.setOnClickListener {
            dismiss()
        }

        tv_select_province_name.setOnClickListener {
            areaType = 0
            setProvinceTextSelect()
        }
        tv_select_city_name.setOnClickListener {
            areaType = 1
            setCityTextSelect()
        }
        tv_select_distinct_name.setOnClickListener {
            areaType = 2
            setDistinctTextSelect()
        }
    }

//    private fun initHasSelectedView() {
//        if (!TextUtils.isEmpty(previousProvinceName)
//            && !TextUtils.isEmpty(previousCityName)
//            && !TextUtils.isEmpty(previousDistinctName)
//        ) {
//            areaType = 2
//            mSelectProvinceName = previousProvinceName
//            mSelectCityName = previousCityName
//            mSelectDistinctName = previousDistinctName
//            tv_select_province_name.text = mSelectProvinceName
//            tv_select_city_name.text = mSelectCityName
//            tv_select_distinct_name.text = mSelectDistinctName
//            if (!tv_select_city_name.isVisible) tv_select_city_name.isVisible = true
//            if (!tv_select_distinct_name.isVisible) tv_select_distinct_name.isVisible = true
//            setDistinctTextSelect()
//        }
//    }

    private fun setProvinceSelectedCallBack() {
        areaType = 1
        mSelectCityName = ""
        mSelectDistinctName = ""
//        mSelectCityBean = AreaCommonBean(
//            areaCode = "",
//            areaId = "",
//            areaLevel = "",
//            areaName = ""
//        )
//        mSelectDistinctBean = AreaCommonBean(
//            areaCode = "",
//            areaId = "",
//            areaLevel = "",
//            areaName = ""
//        )
        if (!tv_select_city_name.isVisible) tv_select_city_name.isVisible = true
        tv_select_city_name.text = "请选择"
        if (tv_select_distinct_name.isVisible) tv_select_distinct_name.isVisible = false
        tv_select_province_name.text = mSelectProvinceName
        setCityTextSelect()
    }

    private fun setCitySelectedCallBack() {
        areaType = 2
        mSelectDistinctName = ""
//        mSelectDistinctBean = AreaCommonBean(
//            areaCode = "",
//            areaId = "",
//            areaLevel = "",
//            areaName = ""
//        )
        if (!tv_select_distinct_name.isVisible) tv_select_distinct_name.isVisible = true
        tv_select_distinct_name.text = "请选择"
        tv_select_city_name.text = mSelectCityName
        setDistinctTextSelect()
    }

    private fun setDistinctSelectedCallBack() {
        tv_select_distinct_name.text = mSelectDistinctName
        onSelectCompleteListener?.invoke(
            Triple(
                mSelectProvinceName,
                mSelectCityName,
                mSelectDistinctName
            )
        )
        dismiss()
    }

    private fun setProvinceTextSelect() {
        tv_select_province_name.setTextColor(mContext.getColor(R.color.colorWarning))
        tv_select_city_name.setTextColor(mContext.getColor(R.color.color_text_31))
        tv_select_distinct_name.setTextColor(mContext.getColor(R.color.color_text_31))
        refreshAdapter(mProvinceList, areaType, mSelectProvinceName)
    }

    private fun setCityTextSelect() {
        tv_select_province_name.setTextColor(mContext.getColor(R.color.color_text_31))
        tv_select_city_name.setTextColor(mContext.getColor(R.color.colorWarning))
        tv_select_distinct_name.setTextColor(mContext.getColor(R.color.color_text_31))
        refreshAdapter(mCityList, areaType, mSelectCityName)
    }

    private fun setDistinctTextSelect() {
        tv_select_province_name.setTextColor(mContext.getColor(R.color.color_text_31))
        tv_select_city_name.setTextColor(mContext.getColor(R.color.color_text_31))
        tv_select_distinct_name.setTextColor(mContext.getColor(R.color.colorWarning))
        refreshAdapter(mDistinctList, areaType, mSelectDistinctName)
    }

    private fun refreshAdapter(data: List<AreaCommonBean>, areaType: Int, selectAreaName: String) {
        mProvinceAdapter.initData(data, areaType, selectAreaName)
        mProvinceAdapter.notifyDataSetChanged()
        city_recycler_recycler.scrollToPosition(getItemPosition(data, selectAreaName))
    }

    //省
    private fun getProvinceData() {
        val data = JsonReadUtils.getInstance().get(mContext, R.raw.area_province)
        val type = object : TypeToken<List<AreaCommonBean>>() {}.type
        val provinceList: List<AreaCommonBean> = Gson().fromJson(data, type)
        if (mProvinceList.isNotEmpty()) {
            mProvinceList.clear()
        }
        mProvinceList.addAll(provinceList)
    }

    //市
    private fun getCityData() {
        val data = JsonReadUtils.getInstance().get(mContext, R.raw.area_city)
        val type = object : TypeToken<List<AreaCommonBean>>() {}.type
        val cityList: List<AreaCommonBean> = Gson().fromJson(data, type)
        if (mCityList.isNotEmpty()) {
            mCityList.clear()
        }
        mCityList.addAll(cityList)
    }

    //区
    private fun getDistinctData() {
        val data = JsonReadUtils.getInstance().get(mContext, R.raw.area_district)
        val type = object : TypeToken<List<AreaCommonBean>>() {}.type
        val distinctList: List<AreaCommonBean> = Gson().fromJson(data, type)
        if (mDistinctList.isNotEmpty()) {
            mDistinctList.clear()
        }
        mDistinctList.addAll(distinctList)
    }

    /**
     * 获取当前item的位置
     */
    private fun getItemPosition(dataList: List<AreaCommonBean>, item: String): Int {
        var positon = 0
        dataList.forEachIndexed { index, areaCommonBean ->
            if (areaCommonBean.areaName == item) {
                positon = index
            }
        }
        return positon
    }

    override fun onStart() {
        super.onStart()

//        dialog!!.setCanceledOnTouchOutside(true)

        // 设置宽度为屏宽, 靠近屏幕底部。
        val window = dialog!!.window

        //设置dialog的 进出 动画
        window!!.setWindowAnimations(R.style.animate_bottom_dialog)
        val lp = window.attributes as WindowManager.LayoutParams
        lp.gravity = Gravity.BOTTOM // 紧贴底部
        lp.width = WindowManager.LayoutParams.MATCH_PARENT // 宽度持平
        window.attributes = lp
        window.setBackgroundDrawable(
            ColorDrawable(
                ActivityCompat.getColor(context!!, R.color.transparent)
            )
        )
    }
}