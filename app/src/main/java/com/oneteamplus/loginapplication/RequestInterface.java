package com.oneteamplus.loginapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {




   @POST("mfsuserfunctions/ChannelLoginWLV")
    public Call<ResModel> Login( @Body  RequestModel request);
}



