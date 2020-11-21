package com.example.surfaceviewmodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/16 15:52
 * Description:
 */
class MainActivityKt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var spString: String by SPreference("spString", "") //get
        spString = "spString" //put保存
        var spInt: Int by SPreference("spInt", 0)
        var spBoolean: Boolean by SPreference("spBoolean", false)
        var spFloat: Float by SPreference("spFloat", 0f)
        spFloat = 12f

        println("spString: $spString, spInt: $spInt, spBoolean: $spBoolean, spFloat: $spFloat")
    }

    override fun onStart() {
        super.onStart()

        val singleton = Singleton

        singleton.instance.add()

        Singleton.instance.add()
        Singleton.instance.b
    }


}

data class User(
    val name: String,
    val age: Int,
    val phoneNum: String
){
    fun speak(){
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
    }
}

//fun ss(){
//    runBlocking {
//        delay(1000L)
//    }
//}

inline fun ss(){

}

fun main() {
    val user = User("Kotlin", 1, "1111111")
    val result = with(user) {
        speak()
        1000
    }

    println("result: $result")



//    GlobalScope.launch {
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,")
//    runBlocking {
//        delay(2000L)
//    }
//    runBlocking {
//        val job = GlobalScope.launch {
//            delay(1000L)
//            println("World!")
//        }
//        println("Hello,")
//        job.join()
//    }
//    runBlocking {
//        launch {
//            delay(1000L)
//            println("World!")
//        }
//        println("Hello,")
//    }

//    runBlocking {
//        launch {
//            ioCode1(1)
//            delay(200L)
//            println("Task from runBlocking")
//
//        }
//        coroutineScope {
//            launch {
//                ioCode1(2)
//                delay(500L)
//                println("Task from nested launch")
//            }
//            ioCode1(3)
//            delay(100L)
//            println("Task from coroutine scope")
//        }
//        ioCode1(4)
//        println("Coroutine scope is over")
//    }
//    runBlocking {
//        val job = launch {
//            repeat(1000) { i ->
//                println("job: I'm sleeping $i ...")
//                delay(500L)
//            }
//        }
//        delay(1300L) // 延迟一段时间
//        println("main: I'm tired of waiting!")
//        job.cancelAndJoin()
////        job.join()
//        println("main: Now I can quit.")
//    }
}

suspend fun ioCode1(index: Int) {
    withContext(Dispatchers.IO) {
        println("我是IO线程$index==${Thread.currentThread().name}")
    }
}

suspend fun ioCode2() {
    println("我是IO线程2==${Thread.currentThread().name}")
}

fun ioCode3() {
    println("我是IO线程3==${Thread.currentThread().name}")
}

fun uiCode1() {
    println("我是UI线程1==${Thread.currentThread().name}")
}

fun uiCode2() {
    println("我是UI线程2==${Thread.currentThread().name}")
}

fun uiCode3() {
    println("我是UI线程3==${Thread.currentThread().name}")
}
