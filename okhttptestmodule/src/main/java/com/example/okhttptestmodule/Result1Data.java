package com.example.okhttptestmodule;

public class Result1Data {
    private int page_total;
    private int page_index;
    private Result1DataList[] list;
    private int page_count;
    private int page_size;

    public int getPage_total() {
        return this.page_total;
    }

    public void setPage_total(int page_total) {
        this.page_total = page_total;
    }

    public int getPage_index() {
        return this.page_index;
    }

    public void setPage_index(int page_index) {
        this.page_index = page_index;
    }

    public Result1DataList[] getList() {
        return this.list;
    }

    public void setList(Result1DataList[] list) {
        this.list = list;
    }

    public int getPage_count() {
        return this.page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    public int getPage_size() {
        return this.page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }
}
