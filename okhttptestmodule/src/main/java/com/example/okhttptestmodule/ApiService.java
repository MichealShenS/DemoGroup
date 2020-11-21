package com.example.okhttptestmodule;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/api/prison/list")
    Observable<Result1> getResult1();

    @GET("/api/prisoners")
    Observable<Result2> getResult2();
}