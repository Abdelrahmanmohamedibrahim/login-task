package com.oneteamplus.loginapplication;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class ResModel {

    @SerializedName("user_id")
    private String user_id;
    @SerializedName("full_name")
    private String full_name;
    @SerializedName("session_id")
    private String session_id;

    public String getPayment_network_code() {
        return payment_network_code;
    }

    public void setPayment_network_code(String payment_network_code) {
        this.payment_network_code = payment_network_code;
    }

    @SerializedName("payment_network_code")
    private String payment_network_code = "CACPN";


    public ResModel(String user_id, String session_id, String skey) {
        this.user_id = user_id;
        this.session_id = session_id;
        this.skey = skey;
        this.report_parameters = report_parameters != null ? report_parameters: new ReportModel();
    }

    @SerializedName("skey")
    private String skey;

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getSkey() {
        return skey;
    }

    public void setSkey(String skey) {
        this.skey = skey;
    }

    @SerializedName("report_code")
    private String report_code = "LAST_N_TRANSACTION";

    public String getReport_code() {
        return report_code;
    }

    public void setReport_code(String report_code) {
        this.report_code = report_code;
    }

    public ReportModel getReport_paramter() {
        return report_parameters;
    }

    public void setReport_paramter(ReportModel report_paramters) {
        this.report_parameters = report_paramters;
    }

    @SerializedName("report_parameters")
    private ReportModel report_parameters;

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
