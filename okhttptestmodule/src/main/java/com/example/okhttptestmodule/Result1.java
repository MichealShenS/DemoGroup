package com.example.okhttptestmodule;

public class Result1 {
    private String msg;
    private Result1Data data;
    private int error_code;

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Result1Data getData() {
        return this.data;
    }

    public void setData(Result1Data data) {
        this.data = data;
    }

    public int getError_code() {
        return this.error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
}
