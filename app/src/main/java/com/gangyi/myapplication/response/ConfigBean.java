package com.gangyi.myapplication.response;

import com.contrarywind.interfaces.IPickerViewData;
import com.gangyi.java2dart_library_annotation.Java2Dart;

import java.util.List;

@Java2Dart("ConfigBean")
public class ConfigBean {


    private List<CheckStatusBean> checkStatus; //认证状态值
    private List<ManagerBean> manager; // 用户权限
    private List<ManagerBean> realManager; // 用户权限2
    private List<DistBean> dist; //地图距离范围 km
    private List<BusinessStatusBean> businessStatus; //营业状态
    private List<DuringBean> timeDuring; //admin查看所有人员时间
    private List<DuringBean> adminTimeDuring; //admin在我的企业关联 时间
    private List<LinkWayBean> linkWay; //拜访方式
    private List<String> identityOptions; //职位
    private List<String> positionOptions; //身份

    public List<ManagerBean> getRealManager() {
        return realManager;
    }

    public void setRealManager(List<ManagerBean> realManager) {
        this.realManager = realManager;
    }

    public List<DuringBean> getAdminTimeDuring() {
        return adminTimeDuring;
    }

    public void setAdminTimeDuring(List<DuringBean> adminTimeDuring) {
        this.adminTimeDuring = adminTimeDuring;
    }

    public List<String> getIdentityOptions() {
        return identityOptions;
    }

    public void setIdentityOptions(List<String> identityOptions) {
        this.identityOptions = identityOptions;
    }

    public List<String> getPositionOptions() {
        return positionOptions;
    }

    public void setPositionOptions(List<String> positionOptions) {
        this.positionOptions = positionOptions;
    }

    public List<LinkWayBean> getLinkWay() {
        return linkWay;
    }

    public void setLinkWay(List<LinkWayBean> linkWay) {
        this.linkWay = linkWay;
    }

    public List<DuringBean> getTimeDuring() {
        return timeDuring;
    }

    public void setTimeDuring(List<DuringBean> timeDuring) {
        this.timeDuring = timeDuring;
    }

    public List<CheckStatusBean> getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(List<CheckStatusBean> checkStatus) {
        this.checkStatus = checkStatus;
    }

    public List<ManagerBean> getManager() {
        return manager;
    }

    public void setManager(List<ManagerBean> manager) {
        this.manager = manager;
    }

    public List<DistBean> getDist() {
        return dist;
    }

    public void setDist(List<DistBean> dist) {
        this.dist = dist;
    }

    public List<BusinessStatusBean> getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(List<BusinessStatusBean> businessStatus) {
        this.businessStatus = businessStatus;
    }

    public static class CheckStatusBean implements IPickerViewData {
        /**
         * val : 1
         * label : 已认证
         */

        private int val;
        private String label;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        @Override
        public String getPickerViewText() {
            return label;
        }
    }

    public static class ManagerBean  implements IPickerViewData {
        /**
         * val : 1
         * label : 超级管理员
         */

        private long val;
        private String label;

        public long getVal() {
            return val;
        }

        public void setVal(long val) {
            this.val = val;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        @Override
        public String getPickerViewText() {
            return label;
        }
    }

    public static class DistBean implements IPickerViewData {
        /**
         * val : 3
         * label : 3km
         */

        private int val;
        private String label;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        @Override
        public String getPickerViewText() {
            return label;
        }
    }

    public static class BusinessStatusBean implements IPickerViewData {
        /**
         * val : 1
         * label : 营业中
         */

        private int val;
        private String label;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        @Override
        public String getPickerViewText() {
            return label;
        }
    }

    public static class DuringBean implements IPickerViewData {
        /**
         * val : 1
         * label : 营业中
         */

        private int val;
        private String label;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        @Override
        public String getPickerViewText() {
            return label;
        }
    }
    public static class LinkWayBean implements IPickerViewData {
        /**
         * val : 1
         * label : 营业中
         */

        private int val;
        private String label;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        @Override
        public String getPickerViewText() {
            return label;
        }
    }


}
