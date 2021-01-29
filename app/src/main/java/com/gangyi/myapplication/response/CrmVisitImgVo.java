package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("CrmVisitImgVo")
public class CrmVisitImgVo {
    /**
     * 图片id
     */
    private Long imgId;
    /**
     * 图片地址
     */
    private String url;

    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long imgId) {
        this.imgId = imgId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
