package com.example.laptoptcc.session4.networks.services;

import com.example.laptoptcc.session4.networks.jsonmodels.LoginResponseJson;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by laptopTCC on 2/6/2017.
 */

public interface LoginServices {
    //gui len login dang https
    @POST("login")
    //chuyen ve json dang String de server co the doc va tra ve gia tri loginResponseJson
    Call<LoginResponseJson> login(@Body RequestBody body);
}
