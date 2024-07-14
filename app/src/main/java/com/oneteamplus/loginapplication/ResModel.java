package com.oneteamplus.loginapplication;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class ResModel {

    @SerializedName("user_id")
    private String user_id;
    @SerializedName("full_name")
    private String full_name;

    public ResModel(String user_id, String full_name) {
        this.user_id = user_id;
        this.full_name = full_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    // Create ResModel object from JSON string using Gson
    public static ResModel fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, ResModel.class);
    }
}
