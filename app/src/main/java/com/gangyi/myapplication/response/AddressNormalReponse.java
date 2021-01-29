package com.gangyi.myapplication.response;

import com.contrarywind.interfaces.IPickerViewData;
import com.gangyi.java2dart_library_annotation.Java2Dart;

import java.util.List;
@Java2Dart("AddressNormalReponse")
public class AddressNormalReponse {

    private List<AreaBean> area;
    private List<ProvinceBean> province;
    private List<CityBean> city;

    public List<AreaBean> getArea() {
        return area;
    }

    public void setArea(List<AreaBean> area) {
        this.area = area;
    }

    public List<ProvinceBean> getProvince() {
        return province;
    }

    public void setProvince(List<ProvinceBean> province) {
        this.province = province;
    }

    public List<CityBean> getCity() {
        return city;
    }

    public void setCity(List<CityBean> city) {
        this.city = city;
    }

    public static class AreaBean implements IPickerViewData {
        /**
         * oid : 46
         * regionCode : 130102
         * parentCode : 1301
         * cityName : 长安区
         * level : 2
         * pinyinCode : changanqu
         */

        private int oid;
        private String regionCode;
        private String parentCode;
        private String cityName;
        private String level;
        private String pinyinCode;

        public int getOid() {
            return oid;
        }

        public void setOid(int oid) {
            this.oid = oid;
        }

        public String getRegionCode() {
            return regionCode;
        }

        public void setRegionCode(String regionCode) {
            this.regionCode = regionCode;
        }

        public String getParentCode() {
            return parentCode;
        }

        public void setParentCode(String parentCode) {
            this.parentCode = parentCode;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getPinyinCode() {
            return pinyinCode;
        }

        public void setPinyinCode(String pinyinCode) {
            this.pinyinCode = pinyinCode;
        }

        @Override
        public String getPickerViewText() {
            return getCityName();
        }
    }

    public static class ProvinceBean implements IPickerViewData {
        /**
         * oid : 1
         * regionCode : 11
         * parentCode : 0
         * cityName : 北京
         * level : 0
         * pinyinCode : beijing
         */

        private int oid;
        private String regionCode;
        private String parentCode;
        private String cityName;
        private String level;
        private String pinyinCode;

        public int getOid() {
            return oid;
        }

        public void setOid(int oid) {
            this.oid = oid;
        }

        public String getRegionCode() {
            return regionCode;
        }

        public void setRegionCode(String regionCode) {
            this.regionCode = regionCode;
        }

        public String getParentCode() {
            return parentCode;
        }

        public void setParentCode(String parentCode) {
            this.parentCode = parentCode;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getPinyinCode() {
            return pinyinCode;
        }

        public void setPinyinCode(String pinyinCode) {
            this.pinyinCode = pinyinCode;
        }

        @Override
        public String getPickerViewText() {
            return getCityName();
        }
    }

    public static class CityBean implements IPickerViewData {
        /**
         * oid : 3
         * regionCode : 1101
         * parentCode : 11
         * cityName : 东城区
         * level : 1
         * pinyinCode : dongchengqu
         */

        private int oid;
        private String regionCode;
        private String parentCode;
        private String cityName;
        private String level;
        private String pinyinCode;

        public int getOid() {
            return oid;
        }

        public void setOid(int oid) {
            this.oid = oid;
        }

        public String getRegionCode() {
            return regionCode;
        }

        public void setRegionCode(String regionCode) {
            this.regionCode = regionCode;
        }

        public String getParentCode() {
            return parentCode;
        }

        public void setParentCode(String parentCode) {
            this.parentCode = parentCode;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getPinyinCode() {
            return pinyinCode;
        }

        public void setPinyinCode(String pinyinCode) {
            this.pinyinCode = pinyinCode;
        }

        @Override
        public String getPickerViewText() {
         return    getCityName();
        }
    }
}
