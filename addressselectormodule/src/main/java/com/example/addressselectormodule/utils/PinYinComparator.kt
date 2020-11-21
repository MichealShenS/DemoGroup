package com.example.addressselectormodule.utils

import java.util.*
import kotlin.Comparator

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/14 14:04
 * Description: 比较器，比较拼音的首字母
 */
class PinYinComparator : Comparator<PinYinComparator.ProvinceBean> {

    companion object{
        fun getPinYin(input: String): String {
            val tokens: ArrayList<*> = HanziToPinyin.getInstance().get(input)
            val sb = StringBuilder()
            if (tokens != null && tokens.size > 0) {
                val iterator: Iterator<*> = tokens.iterator()
                while (iterator.hasNext()) {
                    val token: HanziToPinyin.Token = iterator.next() as HanziToPinyin.Token
                    if (2 == token.type) {
                        sb.append(token.target)
                    } else {
                        sb.append(token.source)
                    }
                }
            }
            return sb.toString().toUpperCase()
        }
    }

//    override fun compare(lhs: CityBean, rhs: CityBean): Int {
//        return lhs.sortLetter!!.compareTo(rhs.sortLetter!!)
//    }
//
//    class CityBean {
//        var name: String = ""
//        var sortLetter: String = ""
//
//    }

    override fun compare(lhs: ProvinceBean, rhs: ProvinceBean): Int {
        return lhs.sortLetter!!.compareTo(rhs.sortLetter!!)
    }

    class ProvinceBean {
        var areaId = ""
        var areaCode = ""
        var areaName = ""
        var areaLevel = ""
        var sortLetter = ""

    }


}