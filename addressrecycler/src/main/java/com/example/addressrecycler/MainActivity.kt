package com.example.addressrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import com.example.addressrecycler.dialog.AreaSelectorDialog
import com.example.addressrecycler.model.AreaCommonBean
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mSelectProvinceName = ""
    private var mSelectCityName = ""
    private var mSelectDistinctName = ""

//    private var provinceBean = AreaCommonBean(
//        areaCode = "",
//        areaId = "",
//        areaLevel = "",
//        areaName = ""
//    )
//    private var cityBean = AreaCommonBean(
//        areaCode = "",
//        areaId = "",
//        areaLevel = "",
//        areaName = ""
//    )
//    private var distinctBean = AreaCommonBean(
//        areaCode = "",
//        areaId = "",
//        areaLevel = "",
//        areaName = ""
//    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun selectArea(view: View) {
        showAreaSelectorDialog()
    }

    private fun showAreaSelectorDialog() {
        val dialog =
            AreaSelectorDialog(this/*, mSelectProvinceName, mSelectCityName, mSelectDistinctName*/)
        dialog.show(supportFragmentManager, "area_dialog")
        dialog.setOnSelectCompleteListener {
            if (null != it) {
                mSelectProvinceName = it.first
                mSelectCityName = it.second
                mSelectDistinctName = it.third
            }
            if (TextUtils.isEmpty(mSelectProvinceName)
                && TextUtils.isEmpty(mSelectCityName)
                && TextUtils.isEmpty(mSelectDistinctName)
            ) {
                tv_area_selector.text = "选择地区"
            } else {
                tv_area_selector.text =
                    "$mSelectProvinceName $mSelectCityName $mSelectDistinctName"
            }
        }
    }
}
