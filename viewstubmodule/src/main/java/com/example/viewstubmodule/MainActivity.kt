package com.example.viewstubmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.viewstub_demo_image_layout.*
import kotlinx.android.synthetic.main.viewstub_demo_text_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewstub_demo_text.inflate()
        viewstub_demo_textview.text = "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"

        viewstub_demo_image.inflate()
        viewstub_demo_imageview.setImageResource(R.mipmap.ic_launcher)
        image_layout.visibility = View.GONE

    }
}
