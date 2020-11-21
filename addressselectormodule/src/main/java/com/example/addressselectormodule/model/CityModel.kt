package com.example.addressselectormodule.model

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/14 14:46
 * Description:
 */
class CityModel {
    private var name: String = ""
    private var districtList: List<DistrictModel> = emptyList()

    constructor() : super() {}
    constructor(
        name: String,
        districtList: List<DistrictModel>
    ) : super() {
        this.name = name
        this.districtList = districtList
    }

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getDistrictList(): List<DistrictModel> {
        return districtList
    }

    fun setDistrictList(districtList: List<DistrictModel>) {
        this.districtList = districtList
    }

    override fun toString(): String {
        return ("""CityModel [name=$name, districtList=$districtList]""")
    }
}