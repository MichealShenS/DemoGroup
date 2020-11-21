package com.example.qrscannermodule.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.qrscannermodule.base.BaseWebActivity;


/**
 * 网页 主页展示菜单的
 * <p>
 * Created by wanny-n1 on 2017/5/31.
 */
public class WebActivity extends BaseWebActivity {
    public static String URL = "url";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadUrl(getIntent().getStringExtra(URL));
    }
}
