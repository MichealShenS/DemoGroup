package com.example.addressselectormodule.model

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/14 14:36
 * Description:
 */
class DistrictModel {
    private var name: String = ""
    private var zipcode: String = ""

    constructor() : super() {}
    constructor(name: String, zipcode: String) : super() {
        this.name = name
        this.zipcode = zipcode
    }

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getZipcode(): String? {
        return zipcode
    }

    fun setZipcode(zipcode: String) {
        this.zipcode = zipcode
    }

    override fun toString(): String {
        return "DistrictModel [name=$name, zipcode=$zipcode]"
    }
}
