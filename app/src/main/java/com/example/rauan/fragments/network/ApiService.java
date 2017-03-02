package com.example.rauan.fragments.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Rauan on 002 02.03.2017.
 */

public interface ApiService {
    @GET("posts")
    Call<ResponseBody> getPostList();
}
