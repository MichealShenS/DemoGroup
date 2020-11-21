package com.example.surfaceviewmodule

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/18 14:26
 * Description:
 */
class Singleton private constructor() {

    private constructor(name: String) : this() {

    }

    constructor(name: String, age: Int) : this() {

    }


    private var a = 1
    val b = 2
    fun add() = a + b

    companion object {

        val instance by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            Singleton()
        }
    }
//        private var mInstance: Singleton? = null
//        val instance: Singleton
//            get() {
//                if (null == mInstance) {
//                    synchronized(Singleton::class.java) {
//                        if (null == mInstance) {
//                            mInstance = Singleton()
//                        }
//                    }
//                }
//                return mInstance!!
//            }
//    }
}