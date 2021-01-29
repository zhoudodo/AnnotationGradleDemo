package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

/**
 * Created by fly on 2018/6/5.
 * email:373947011@qq.com
 */
@Java2Dart("UploadBean")
public class UploadBean {

    /**
     * Oid : 913
     * Name : 1528170467811.jpg
     * Url : http://121.40.200.150:8089/s4m3files/201806/2018/06/05/201806051147510043.jpg
     */

    private long oid;
    private String name;
    private String url;

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
