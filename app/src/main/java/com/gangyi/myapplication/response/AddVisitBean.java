package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("AddVisitBean")
public class AddVisitBean {
   private String companyName;//	string	是	企业全称	-	-
   private String linkName;//	string	是	联系人姓名	-	-
    private String linkIdentity;//	string	是	联系人身份	-	-
    private String linkPosition;//	string	是	联系人职位	-	-
    private String linkWay	;//string	是	拜访方式	-	-
    private long  visitDate;//	long	是	拜访日期	-	-
    private String content	;//string	是	拜访内容	-	-
    private String result;//	string	是	拜访结果	-	-
    private long[] imgIds;//图片ids

    private double lng;//当前定位经度
    private double lat;//当前定位纬度

    private String linkPhone;//联系人电话

    private String visitAddress;//拜访经纬度 地址描述

    public String getVisitAddress() {
        return visitAddress;
    }

    public void setVisitAddress(String visitAddress) {
        this.visitAddress = visitAddress;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public long[] getImgIds() {
        return imgIds;
    }

    public void setImgIds(long[] imgIds) {
        this.imgIds = imgIds;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkIdentity() {
        return linkIdentity;
    }

    public void setLinkIdentity(String linkIdentity) {
        this.linkIdentity = linkIdentity;
    }

    public String getLinkPosition() {
        return linkPosition;
    }

    public void setLinkPosition(String linkPosition) {
        this.linkPosition = linkPosition;
    }

    public String getLinkWay() {
        return linkWay;
    }

    public void setLinkWay(String linkWay) {
        this.linkWay = linkWay;
    }

    public long getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(long visitDate) {
        this.visitDate = visitDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
