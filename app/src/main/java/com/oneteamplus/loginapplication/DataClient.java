package com.oneteamplus.loginapplication;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataClient {
    private static final String BASE_URL = "https://test.geidea.net:9090/";
    private DataInterface dataInterface;
    private static DataClient INSTANCE;

    public DataClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        dataInterface = retrofit.create(DataInterface.class); //connecting to interface and fill it with https
    }

    public static DataClient getINSTANCE() {
        if (null == INSTANCE){
            INSTANCE = new DataClient();
        }
        return INSTANCE;
    }
    public Call<ViewDataModel> displayReport(ResModel r){
        return  dataInterface.displayReport(r);
    }

    public Call<ResModel> login(RequestModel r){
        return  dataInterface.Login(r);
    }
}
