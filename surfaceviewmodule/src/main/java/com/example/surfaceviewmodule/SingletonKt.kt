package com.example.surfaceviewmodule

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/18 16:24
 * Description:
 */
class SingletonKt private constructor() {

    private var a = 1
    val b = 2
    fun add() = a + b

    companion object {
        val INSTANCE by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonKt()
        }
    }


}