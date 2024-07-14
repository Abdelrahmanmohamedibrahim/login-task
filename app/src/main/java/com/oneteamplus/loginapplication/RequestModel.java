package com.oneteamplus.loginapplication;

import com.google.gson.annotations.SerializedName;

public class RequestModel {
    @SerializedName("login_id")
    private String login_id;

    @SerializedName("password")
    private String password;

    @SerializedName("channel_code")
    private String channel_code = "ANDROID.MOBILE.SALES";

    @SerializedName("channel_key")
    private String channel_key = "ANDROID.MOBILE.SALES";

    @SerializedName("terminal_id")
    private String terminal_id = "";

    @SerializedName("client_version")
    private String client_version = "V1.5";

    // Default constructor
    public RequestModel() {
    }

    // Constructor with login_id and password parameters
    public RequestModel(String login_id, String password) {
        this.login_id = login_id;
        this.password = password;
    }

    // Getters and setters
    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChannel_code() {
        return channel_code;
    }

    public void setChannel_code(String channel_code) {
        this.channel_code = channel_code;
    }

    public String getChannel_key() {
        return channel_key;
    }

    public void setChannel_key(String channel_key) {
        this.channel_key = channel_key;
    }

    public String getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }

    public String getClient_version() {
        return client_version;
    }

    public void setClient_version(String client_version) {
        this.client_version = client_version;
    }
}
