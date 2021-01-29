package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("ManageCompanySummaryVo")
public class ManageCompanySummaryVo {

    /**
     * 认证企业数
     */
    private Long checkedCount;
    /**
     * 未认证企业数
     */
    private Long unCheckedCount;


    public Long getCheckedCount() {
        return checkedCount;
    }

    public void setCheckedCount(Long checkedCount) {
        this.checkedCount = checkedCount;
    }

    public Long getUnCheckedCount() {
        return unCheckedCount;
    }

    public void setUnCheckedCount(Long unCheckedCount) {
        this.unCheckedCount = unCheckedCount;
    }
}
