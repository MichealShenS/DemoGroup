package com.example.surfaceviewmodule

import android.app.Application

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/17 16:13
 * Description:
 */
class BaseApplication : Application() {
    companion object {
        lateinit var instance: BaseApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        SPreference.setContext(applicationContext)
    }
}