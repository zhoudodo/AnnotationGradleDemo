package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("TokenBean")
public class TokenBean {


    /**
     * access_token : eyJhbG
     * refresh_token : eyJhbGciOiJIUzI1
     */

    private String access_token;
    private String refresh_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }
}
