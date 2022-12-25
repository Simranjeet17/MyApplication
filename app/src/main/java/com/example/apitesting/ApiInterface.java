package com.example.apitesting;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("login")
    Call<Root> login_Api(
            @Field("phone") String phone);

    @FormUrlEncoded
    @POST("register")
    Call<Root> register_Api(
            @Field("name") String name,
            @Field("email") String email,
            @Field("phone") String phone
    );

    @Headers({
            "Accept:application/json",
            "Authorization:Bearer 6|GmfFSWDymDCeCWidndJgJp9dQ6zyWNfuJyGtvxkK"})
    @GET("home_data")
    Call<Modal> get_data();

}
