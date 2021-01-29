package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("VisitLogDuringVo")
public class VisitLogDuringVo {
    private Long oid;
    /**
     * 拜访日期
     */
    private Long visitDate;
    /**
     * 企业名称
     */
    private String companyName;
    /**
     * 拜访者id
     */
    private Long visitorId;
    /**
     * 拜访者姓名
     */
    private String visitor;


    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Long visitDate) {
        this.visitDate = visitDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
}