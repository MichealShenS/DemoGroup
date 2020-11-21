package com.example.broadcastreceivermodule

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var myReceiver: MyBRReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myReceiver = MyBRReceiver()
        val itFilter = IntentFilter()
        itFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE")
//        registerReceiver(myReceiver, itFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
//        unregisterReceiver(myReceiver)
    }

    fun sendBroad(view: View) {
        Log.e("shensq", "sendBroad")
        val intent = Intent("com.example.broadcastreceivermodule.MY_BROADCAST")
        intent.setPackage("com.example.broadcastreceivermodule")
        sendBroadcast(intent)
    }
}
