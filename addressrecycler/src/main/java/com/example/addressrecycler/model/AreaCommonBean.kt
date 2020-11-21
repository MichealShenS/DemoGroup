package com.example.addressrecycler.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/16 15:00
 * Description:
 */
data class AreaCommonBean(
    val areaId: String,
    val areaCode: String,
    val areaName: String,
    val areaLevel: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(areaId)
        parcel.writeString(areaCode)
        parcel.writeString(areaName)
        parcel.writeString(areaLevel)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AreaCommonBean> {
        override fun createFromParcel(parcel: Parcel): AreaCommonBean {
            return AreaCommonBean(parcel)
        }

        override fun newArray(size: Int): Array<AreaCommonBean?> {
            return arrayOfNulls(size)
        }
    }

}