package com.example.newqrcodemodule.decode;

import android.os.Handler;
import android.os.Looper;


import com.example.newqrcodemodule.CaptureActivity;

import java.util.concurrent.CountDownLatch;

/**
* 解码线程
*@author TLJ
*created at 2016/9/19 14:49
*QQ:172864659
*/
final class DecodeThread extends Thread {

	CaptureActivity activity;
	private Handler handler;
	private final CountDownLatch handlerInitLatch;

	DecodeThread(CaptureActivity activity) {
		this.activity = activity;
		handlerInitLatch = new CountDownLatch(1);
	}

	Handler getHandler() {
		try {
			handlerInitLatch.await();
		} catch (InterruptedException ie) {
			// continue?
		}
		return handler;
	}

	@Override
	public void run() {
		Looper.prepare();
		handler = new DecodeHandler(activity);
		handlerInitLatch.countDown();
		Looper.loop();
	}

}
