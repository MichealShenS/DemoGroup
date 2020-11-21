package com.example.newqrcodemodule

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main.*
import pub.devrel.easypermissions.AfterPermissionGranted
import pub.devrel.easypermissions.AppSettingsDialog
import pub.devrel.easypermissions.EasyPermissions
import pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks

class MainActivity : AppCompatActivity(), PermissionCallbacks {

    private val RC_CAMERA_PERM = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        scan.setOnClickListener {
            cameraTask()
        }
    }

    @AfterPermissionGranted(123)
    private fun cameraTask() {
        if (EasyPermissions.hasPermissions(this, Manifest.permission.CAMERA)) {
            // Have permission, do the thing!
            Log.i("444", "有相机")
            startActivity(Intent(this@MainActivity, CaptureActivity::class.java))
        } else {
            Log.i("444", "无相机")
            // 禁止过（没设以后都禁止）
            EasyPermissions.requestPermissions(
                this,
                "小浣熊需要相机权限才能扫码哦~",
                RC_CAMERA_PERM,
                Manifest.permission.CAMERA
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
    }

    override fun onPermissionsDenied(requestCode: Int, perms: MutableList<String>?) {
        Log.i("444", "Denied:" + "拒绝")
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms!!)) {
            Log.i("444", "Denied:" + "选了一直禁止该权限")
            AppSettingsDialog.Builder(this, "您禁用了小浣熊的相机权限，需要打开才能使用相关功能，需要去手机设置中打开吗？")
                .setTitle("提示")
                .setPositiveButton("打开")
                .setNegativeButton(
                    "取消"
                    /* click listener */
                ) { dialog, which -> }
                .setRequestCode(RC_CAMERA_PERM)
                .build()
                .show()
        }
    }

    override fun onPermissionsGranted(requestCode: Int, perms: MutableList<String>?) {
        Log.i("444", "Granted")
    }


}
