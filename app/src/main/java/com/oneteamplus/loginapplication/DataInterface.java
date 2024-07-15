package com.oneteamplus.loginapplication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface DataInterface {
    @POST("mfsreports/GetReport")
    public Call<ViewDataModel> displayReport(@Body ResModel response );


    @POST("mfsuserfunctions/ChannelLoginWLV")
    public Call<ResModel> Login( @Body  RequestModel request);
}
