package com.example.addressselectormodule.model

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/14 14:46
 * Description:
 */
class ProvinceModel {
    private var name: String = ""
    private var cityList: List<CityModel> = emptyList()

    constructor() : super() {}
    constructor(name: String, cityList: List<CityModel>) : super() {
        this.name = name
        this.cityList = cityList
    }

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getCityList(): List<CityModel> {
        return cityList
    }

    fun setCityList(cityList: List<CityModel>) {
        this.cityList = cityList
    }

    override fun toString(): String {
        return "ProvinceModel [name=$name, cityList=$cityList]"
    }
}
