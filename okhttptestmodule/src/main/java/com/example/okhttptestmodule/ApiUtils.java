package com.example.okhttptestmodule;

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/9/4 10:14
 * Description:
 */
class ApiUtils {

    public static final String BASE_URL = "http://119.3.129.249:7000/";

    public static ApiService getApiService() {
        return RetrofitClient.getClient(BASE_URL).create(ApiService.class);
    }

}
