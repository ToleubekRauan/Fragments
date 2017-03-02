package com.example.rauan.fragments.network;

import retrofit2.Retrofit;

/**
 * Created by Rauan on 002 02.03.2017.
 */

public class RestClient {
    private static final String BASE_URL="https://jsonplaceholder.typicode.com/";
    private static Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).build();


    public static ApiService request(){
        return retrofit.create(ApiService.class);
    }
}
