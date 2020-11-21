package com.example.zhifbrecyclerviewmodule.utils

import com.example.zhifbrecyclerviewmodule.R
import com.example.zhifbrecyclerviewmodule.model.MenuBaseBean
import com.example.zhifbrecyclerviewmodule.model.MenuItemAppBean

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/2 16:09
 * Description:
 */
class DataManager {

    companion object {

        private val loveSocialList = listOf(
            MenuItemAppBean("同屏遥控", R.mipmap.app_daiban_ico),
            MenuItemAppBean("高清畅聊", R.mipmap.app_ggtz_ico),
            MenuItemAppBean("时光胶囊", R.mipmap.app_gsfw_ico),
            MenuItemAppBean("虚拟互动", R.mipmap.app_jhsp_ico),
            MenuItemAppBean("虚拟互动", R.mipmap.app_jhsp_ico),
            MenuItemAppBean("虚拟互动", R.mipmap.app_jhsp_ico),
            MenuItemAppBean("虚拟互动", R.mipmap.app_jhsp_ico)
        )

        private val loveHealthList = listOf(
            MenuItemAppBean("视频医生", R.mipmap.app_jxpd_ico)
        )

        private val loveGoodFoodList = listOf(
            MenuItemAppBean("美食天地", R.mipmap.app_lccgx_ico)
        )

        private val loveFashionList = listOf(
            MenuItemAppBean("穿衣镜", R.mipmap.app_lccy_ico),
            MenuItemAppBean("化妆镜", R.mipmap.app_lcsp_ico)
        )

        private val loveLearningList = listOf(
            MenuItemAppBean("智慧课堂", R.mipmap.app_rwsp_ico)
        )

        private val loveGamesList = listOf(
            MenuItemAppBean("社交扑克", R.mipmap.app_wdjh_ico)
        )

        private val loveElseList = listOf(
            MenuItemAppBean("智慧城", R.mipmap.app_wdlc_ico),
            MenuItemAppBean("聚好看", R.mipmap.app_wdrw_ico)
        )

        private val menuTypeList = listOf(
            "type_love_social",
            "type_love_health",
            "type_love_good_food",
            "type_love_fashion",
            "type_love_learning",
            "type_love_games",
            "type_else"
        )

        private val menuMap = mapOf(
            menuTypeList[0] to "爱社交",
            menuTypeList[1] to "爱健康",
            menuTypeList[2] to "爱美食",
            menuTypeList[3] to "爱时尚",
            menuTypeList[4] to "爱学习",
            menuTypeList[5] to "爱游戏",
            menuTypeList[6] to "其他"
        )

        private val menuItemMap = mapOf(
            menuTypeList[0] to loveSocialList,
            menuTypeList[1] to loveHealthList,
            menuTypeList[2] to loveGoodFoodList,
            menuTypeList[3] to loveFashionList,
            menuTypeList[4] to loveLearningList,
            menuTypeList[5] to loveGamesList,
            menuTypeList[6] to loveElseList
        )

        var myAppList = mutableListOf(
            MenuItemAppBean("智慧城", R.mipmap.app_wdlc_ico),
            MenuItemAppBean("聚好看", R.mipmap.app_wdrw_ico),
            MenuItemAppBean("同屏遥控", R.mipmap.app_daiban_ico),
            MenuItemAppBean("高清畅聊", R.mipmap.app_ggtz_ico),
            MenuItemAppBean("时光胶囊", R.mipmap.app_gsfw_ico),
            MenuItemAppBean("虚拟互动", R.mipmap.app_jhsp_ico),
            MenuItemAppBean("穿衣镜", R.mipmap.app_lccy_ico),
            MenuItemAppBean("化妆镜", R.mipmap.app_lcsp_ico),
            MenuItemAppBean("视频医生", R.mipmap.app_jxpd_ico),
            MenuItemAppBean("美食天地", R.mipmap.app_lccgx_ico)
        )

        var menuBaseList = mutableListOf(
            MenuBaseBean(
                menuMap[menuTypeList[0]] ?: "",
                menuItemMap[menuTypeList[0]] ?: emptyList()
            ),
            MenuBaseBean(
                menuMap[menuTypeList[1]] ?: "",
                menuItemMap[menuTypeList[1]] ?: emptyList()
            ),
            MenuBaseBean(
                menuMap[menuTypeList[2]] ?: "",
                menuItemMap[menuTypeList[2]] ?: emptyList()
            ),
            MenuBaseBean(
                menuMap[menuTypeList[3]] ?: "",
                menuItemMap[menuTypeList[3]] ?: emptyList()
            ),
            MenuBaseBean(
                menuMap[menuTypeList[4]] ?: "",
                menuItemMap[menuTypeList[4]] ?: emptyList()
            ),
            MenuBaseBean(
                menuMap[menuTypeList[5]] ?: "",
                menuItemMap[menuTypeList[5]] ?: emptyList()
            ),
            MenuBaseBean(
                menuMap[menuTypeList[6]] ?: "",
                menuItemMap[menuTypeList[6]] ?: emptyList()
            )
        )
    }


}