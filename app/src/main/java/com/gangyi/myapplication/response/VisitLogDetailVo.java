package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("VisitLogDetailVo")
public class VisitLogDetailVo {
    private long oid;
    /**
     * 拜访者id
     */
    private Long visitorId;

    /**
     * 拜访者姓名
     */
    private String visitor;

    /**
     * 联系人名称
     */
    private String linkName;

    /**
     * 联系人身份
     */
    private String linkIdentity;

    /**
     * 联系人职位
     */
    private String linkPosition;

    /**
     * 拜访方式
     */
    private String linkWay;
    private String linkWayLabel;

    private String visitAddress;//经纬度 中文地址描述

    public String getVisitAddress() {
        return visitAddress;
    }

    public void setVisitAddress(String visitAddress) {
        this.visitAddress = visitAddress;
    }

    public String getLinkWayLabel() {
        return linkWayLabel;
    }

    public void setLinkWayLabel(String linkWayLabel) {
        this.linkWayLabel = linkWayLabel;
    }

    /**
     * 拜访日期
     */
    private Long visitDate;

    /**
     * 拜访结果
     */
    private String result;

    /**
     * 拜访内容
     */
    private String content;

    /**
     * 联系人电话
     */
    private String linkPhone;

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public Long getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Long visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
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

    public Long getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Long visitDate) {
        this.visitDate = visitDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }
}

