package com.gangyi.myapplication.request;

import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("EditCompany")
public class EditCompany extends AddNewCompany {
    private long oid;
    private long[] delImgIds;


    public long[] getDelImgIds() {
        return delImgIds;
    }

    public void setDelImgIds(long[] delImgIds) {
        this.delImgIds = delImgIds;
    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }
}
