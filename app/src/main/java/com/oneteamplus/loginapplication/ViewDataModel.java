package com.oneteamplus.loginapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ViewDataModel {
    @SerializedName("columns")
    private List<String> columns;
    @SerializedName("data")
    private List<String> data;
    @SerializedName("recordsTotal")
    private int recordsTotal;
    @SerializedName("status_code")
    private String status_code;

    public ViewDataModel(List<String> columns, List<String> data, int recordsTotal, String status_code, String status_description, String status_msg) {
        this.columns = columns;
        this.data = data;
        this.recordsTotal = recordsTotal;
        this.status_code = status_code;
        this.status_description = status_description;
        this.status_msg = status_msg;

    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getStatus_description() {
        return status_description;
    }

    public void setStatus_description(String status_description) {
        this.status_description = status_description;
    }

    public String getStatus_msg() {
        return status_msg;
    }

    public void setStatus_msg(String status_msg) {
        this.status_msg = status_msg;
    }

    @SerializedName("status_description")
    private String status_description;
    @SerializedName("status_msg")
    private String status_msg;
}
