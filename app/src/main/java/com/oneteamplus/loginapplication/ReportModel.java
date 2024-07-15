package com.oneteamplus.loginapplication;

import com.google.gson.annotations.SerializedName;

public class ReportModel {
    public ReportModel() {
         CALLER_USER_ID = "VLSA.DEF.SEG.20191201162651955.0000000000002377030";
    }

    public String getCALLER_USER_ID() {
        return CALLER_USER_ID = "VLSA.DEF.SEG.20191201162651955.0000000000002377030";
    }

    public void setCALLER_USER_ID(String CALLER_USER_ID) {
        this.CALLER_USER_ID = CALLER_USER_ID;
    }

    @SerializedName("CALLER_USER_ID")
private String  CALLER_USER_ID = "VLSA.DEF.SEG.20191201162651955.0000000000002377030";

}
