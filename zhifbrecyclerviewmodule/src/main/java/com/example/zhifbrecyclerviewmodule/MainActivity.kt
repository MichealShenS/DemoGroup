package com.example.zhifbrecyclerviewmodule

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("shensq", "===onCreate")
    }

    fun gotoMenuManager(view: View) {
//        Toast.makeText(this, "跳转应用管理！", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, MenuManagerActivity::class.java))
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("shensq", "===onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("shensq", "===onRestoreInstanceState")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.e("shensq", "===onConfigurationChanged")
    }

    override fun onStart() {
        super.onStart()
        Log.e("shensq", "===onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("shensq", "===onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("shensq", "===onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("shensq", "===onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("shensq", "===onDestroy")
    }
}

