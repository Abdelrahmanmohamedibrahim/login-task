package com.oneteamplus.loginapplication;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataView extends ViewModel {
    MutableLiveData<ViewDataModel> reportModelMutableLiveData = new MutableLiveData<>(); //saving data
    public void displayReport(ResModel r){
        DataClient.getINSTANCE().displayReport(r).enqueue(new Callback<ViewDataModel>() {


            @Override
            public void onResponse(Call<ViewDataModel> call, Response<ViewDataModel> response) {
                reportModelMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<ViewDataModel> call, Throwable throwable) {

            }
        });
    }
}
