package com.oneteamplus.loginapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginClient {

    private static final String BASE_URL = "https://test.geidea.net:9090/";
    private RequestInterface requestInterface;
    private static LoginClient INSTANCE;

    public LoginClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
       requestInterface = retrofit.create(RequestInterface.class); //connecting to interface
    }

    public static LoginClient getINSTANCE() {
        if (null == INSTANCE){
            INSTANCE = new LoginClient();
        }
        return INSTANCE;
    }
    public Call<ResModel> login(RequestModel r){
        return  requestInterface.Login(r);
    }
}



