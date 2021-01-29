package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("VisitLogSummaryVo")
public class VisitLogSummaryVo {

    /**
     * 拜访者id
     */
    private Long visitorId;
    /**
     * 拜访者姓名
     */
    private String visitor;
    /**
     * 拜访统计数
     */
    private Long visitCount;

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

    public Long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
    }
}
