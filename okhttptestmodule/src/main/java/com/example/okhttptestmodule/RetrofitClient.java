package com.example.okhttptestmodule;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/9/4 10:19
 * Description:
 */
class RetrofitClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        if (retrofit == null) {
            OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder();
            OkHttpClient client = httpBuilder.readTimeout(3, TimeUnit.MINUTES)
                    .addInterceptor(new Interceptor() {
                        @NotNull
                        @Override
                        public Response intercept(@NotNull Chain chain) throws IOException {
                            Request request = chain.request()
                                    .newBuilder()
                                    .addHeader("Connection", "keep-alive")
                                    .addHeader("Accept", "*/*")
                                    .build();
                            return chain.proceed(request);
                        }
                    })
                    .connectTimeout(3, TimeUnit.MINUTES)
                    .writeTimeout(3, TimeUnit.MINUTES) //设置超时
                    .build();

            retrofit = new Retrofit.Builder().client(client).baseUrl(baseUrl)
                    .addConverterFactory(ScalarsConverterFactory.create())//请求结果转换为基本类型
                    .addConverterFactory(GsonConverterFactory.create())//请求的结果转为实体类
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//适配RxJava2.0, RxJava1.x则为RxJavaCallAdapterFactory.create()
                    .build();
        }

        return retrofit;

    }
}
