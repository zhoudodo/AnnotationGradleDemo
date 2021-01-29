package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("CompanyDetailBean")
public class CompanyDetailBean {

    private String companyName;//	String	是	企业全称	-	-
    private String province;//	string	是	省	-	-
    private String city;//	string	是	市	-	-
    private String area;//	string	是	区	-	-
    private double lng;//	double	是	经度	-	-
    private  double lat;//	double	是	纬度	-	-
    private String address;//	string	是	详细地址	-	-
    private int  businessStatus;//	int	是	营业状态。1：营业中，2：非营业	-	-
    private String phone;//	string	否	手机
    private long oid;//企业唯一标识

    private String linkname;//	string	是	联系人	-	-
    private String staffScale;//	string	否	人员规模	-	-
    private String remark;//	string	否	备注

    /**
     * 企业注册手机号
     */
    private String regPhone;

    /**
     * 负责人id
     */
    private Long manageId;

    /**
     * 负责人姓名
     */
    private String manager;

    /**
     * 状态认证
     * 1：已认证
     * 2：未认证
     */
    private Integer checkStatus;

    /**
     * 剩余时间
     */
    private String remainTimeTxt;


    public String getRegPhone() {
        return regPhone;
    }

    public void setRegPhone(String regPhone) {
        this.regPhone = regPhone;
    }

    public Long getManageId() {
        return manageId;
    }

    public void setManageId(Long manageId) {
        this.manageId = manageId;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getRemainTimeTxt() {
        return remainTimeTxt;
    }

    public void setRemainTimeTxt(String remainTimeTxt) {
        this.remainTimeTxt = remainTimeTxt;
    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(int businessStatus) {
        this.businessStatus = businessStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname;
    }

    public String getStaffScale() {
        return staffScale;
    }

    public void setStaffScale(String staffScale) {
        this.staffScale = staffScale;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
