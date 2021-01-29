package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

//返回List<CompanyListVo>
@Java2Dart("CompanyListVo")
public class CompanyListVo {
    /**
     * 企业全称
     */
    private String companyName;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 状态认证
     * 1：已认证
     * 2：未认证
     */
    private Integer checkStatus;

    /**
     * 认领时间
     */
    private Long belongTime;


    private String remainTimeTxt;


    private long manageId = -1;

    public long getManageId() {
        return manageId;
    }

    public void setManageId(long manageId) {
        this.manageId = manageId;
    }

    public String getRemainTimeTxt() {
        return remainTimeTxt;
    }

    public void setRemainTimeTxt(String remainTimeTxt) {
        this.remainTimeTxt = remainTimeTxt;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Long getBelongTime() {
        return belongTime;
    }

    public void setBelongTime(Long belongTime) {
        this.belongTime = belongTime;
    }
}