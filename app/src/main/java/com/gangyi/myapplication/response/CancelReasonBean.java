package com.gangyi.myapplication.response;

import com.contrarywind.interfaces.IPickerViewData;
import com.gangyi.java2dart_library_annotation.Java2Dart;

@Java2Dart("CancelReasonBean")
public class CancelReasonBean implements IPickerViewData {

    /**
     * content : 与卖家协商一致
     * id : 0.0
     */

    private String content;
    private long id;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getPickerViewText() {
        return content;
    }
}
