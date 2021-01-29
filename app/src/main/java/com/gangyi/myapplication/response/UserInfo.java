package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("UserInfo")
public class UserInfo {
    /**
     * 主键
     */
    private Long oid;
    /**
     * 用户名
     */
    private String username;
    /**
     * 姓名
     */
    private String realName;
    /**
     * 手机号
     */
    private String mobileTel;
    /**
     * 邮箱
     */
    private String email;



    /**
     * 用户类型
     * 0：管理员
     * 1：普通用户
     */
    private Integer userType;


    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobileTel() {
        return mobileTel;
    }

    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}