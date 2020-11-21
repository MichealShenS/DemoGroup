package com.example.okhttptestmodule

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    private val TAG = "111111"
    private var result1: Result1? = null
    private var result2: Result2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun syncClick(view: View) {
        getDataFromNetByOrder()
    }

    fun asyncClick(view: View) {
        getDataFromNetSameTime()
    }

    /**
     * 串行执行网络请求操作
     */
    private fun getDataFromNetByOrder() {
        val apiService = ApiUtils.getApiService()
        apiService.result1
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
            .flatMap { result1 ->
                Log.e(
                    TAG,
                    "onNext: SSSSS== result1: $result1"
                )
                if (result1 == null) {
                    null
                } else apiService.result2
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Result2?> {
                override fun onSubscribe(d: Disposable) {
                    Log.e(TAG, "onSubscribe: ")
                }

                override fun onNext(result2: Result2) {
                    Log.e(
                        TAG,
                        "onNext: SSSSS== result2: $result2"
                    )
                }

                override fun onError(e: Throwable) {
                    e.printStackTrace()
                    Log.e(TAG, "onError: ")
                }

                override fun onComplete() {
                    Log.e(TAG, "onComplete: ")
                }
            })
    }

    /**
     * 并行实现多个网络请求
     */
    private fun getDataFromNetSameTime() {
        val apiService = ApiUtils.getApiService()
        val result1Observable = apiService.result1
        val result2Observable = apiService.result2
        val merge = Observable.merge(result1Observable, result2Observable)
        merge.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Any> {
                override fun onComplete() {
                    Log.e(TAG, "onComplete: ")
                }

                override fun onSubscribe(d: Disposable) {
                    Log.e(TAG, "onSubscribe: ")
                }

                override fun onNext(t: Any) {
                    if (t is Result1) {
                        result1 = t
                        Log.e(TAG, "onNext: TTTTTT== result1: $result1")
                    } else if (t is Result2) {
                        result2 = t
                        Log.e(TAG, "onNext: SSSSS== result2: $result2")
                    }
                }

                override fun onError(e: Throwable) {
                    e.printStackTrace()
                    Log.e(TAG, "onError: ")
                }

            })
    }
}
