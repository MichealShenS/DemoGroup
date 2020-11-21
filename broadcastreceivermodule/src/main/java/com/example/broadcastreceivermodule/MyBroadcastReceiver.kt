package com.example.broadcastreceivermodule

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/9 16:47
 * Description:
 */
class MyBroadcastReceiver : BroadcastReceiver() {

    private val ACTION_BOOT = "com.example.broadcastreceivermodule.MY_BROADCAST"

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.e("shensq", intent?.action)
        if (ACTION_BOOT == intent?.action) {
            Toast.makeText(context, "收到告白啦~", Toast.LENGTH_SHORT).show()
        }
    }
}