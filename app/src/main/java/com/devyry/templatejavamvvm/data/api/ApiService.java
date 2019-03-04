package com.devyry.templatejavamvvm.data.api;

import com.devyry.templatejavamvvm.model.response.LoginResponse;
import com.devyry.templatejavamvvm.model.response.SessionResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
public interface ApiService {

    @FormUrlEncoded
    @POST("/api/login")
    Call<LoginResponse> login(
            @Field("email")             String email,
            @Field("password")          String password
    );

    @GET("/api/sessioninfo")
    Call<SessionResponse> getSessionInfo(
            @Header("Authorization")    String authorization
    );

}
