package com.oneteamplus.loginapplication;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginView extends ViewModel {

    MutableLiveData <ResModel> postsMutableLiveData = new MutableLiveData<>(); //saving data
    public void login(RequestModel r){
        LoginClient.getINSTANCE().login(r).enqueue(new Callback<ResModel>() {


            @Override
            public void onResponse(Call<ResModel> call, @NonNull Response<ResModel> response) {
                Log.d("TAG", "onResponse: "+response.body());
                postsMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<ResModel> call, Throwable t) {

            }
        });
    }


}
