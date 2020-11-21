package com.example.broadcastreceivermodule

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/9 16:22
 * Description:
 */
class MyBRReceiver : BroadcastReceiver() {


    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "网络状态发生改变~", Toast.LENGTH_SHORT).show()
    }
}