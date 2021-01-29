package com.gangyi.myapplication.response;

//返回List<CompanyNearbySearchVo>

import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("CompanyNearbySearchVo")
public class CompanyNearbySearchVo {
    /**
     * 企业全称
     */
    private String companyName;
    /**
     * 负责人id
     */
    private String manageId;
    /**
     * 负责人姓名
     */
    private String manager;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 状态认证
     * 1：已认证
     * 2：未认证
     */
    private Integer checkStatus;
    /**
     * 累计询价
     */
    private Long inquiryCount;
    /**
     * 累计报价
     */
    private Long offerCount;
    /**
     * 累计成交
     */
    private Long dealCount;

    private double lng;//	double	是	经度	-	-
    private double lat;//	double	是	纬度	-


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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getManageId() {
        return manageId;
    }

    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Long getInquiryCount() {
        return inquiryCount;
    }

    public void setInquiryCount(Long inquiryCount) {
        this.inquiryCount = inquiryCount;
    }

    public Long getOfferCount() {
        return offerCount;
    }

    public void setOfferCount(Long offerCount) {
        this.offerCount = offerCount;
    }

    public Long getDealCount() {
        return dealCount;
    }

    public void setDealCount(Long dealCount) {
        this.dealCount = dealCount;
    }
}