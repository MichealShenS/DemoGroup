package com.example.surfaceviewmodule

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/18 16:44
 * Description:
 */


fun test() {
    t1()
}

var a = 1
var b = 2

inline fun t1(): Int {
    return a + b
}
