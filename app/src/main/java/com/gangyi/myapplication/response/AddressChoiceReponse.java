package com.gangyi.myapplication.response;

import com.contrarywind.interfaces.IPickerViewData;
import com.gangyi.java2dart_library_annotation.Java2Dart;

import java.util.List;


//筛选器筛选地区数据
@Java2Dart("AddressChoiceReponse")
public class AddressChoiceReponse {


    private List<RegionBean> region;

    public List<RegionBean> getRegion() {
        return region;
    }

    public void setRegion(List<RegionBean> region) {
        this.region = region;
    }

    public static class RegionBean implements IPickerViewData {
        /**
         * cityName : 北京
         * city : [{"oid":3,"regionCode":"1101","parentCode":"11","cityName":"东城区","level":"1","pinyinCode":"dongchengqu"},{"oid":4,"regionCode":"1102","parentCode":"11","cityName":"西城区","level":"1","pinyinCode":"xichengqu"},{"oid":5,"regionCode":"1103","parentCode":"11","cityName":"崇文区","level":"1","pinyinCode":"chongwenqu"},{"oid":6,"regionCode":"1104","parentCode":"11","cityName":"宣武区","level":"1","pinyinCode":"xuanwuqu"},{"oid":7,"regionCode":"1105","parentCode":"11","cityName":"朝阳区","level":"1","pinyinCode":"chaoyangqu"},{"oid":8,"regionCode":"1106","parentCode":"11","cityName":"丰台区","level":"1","pinyinCode":"fengtaiqu"},{"oid":9,"regionCode":"1107","parentCode":"11","cityName":"石景山区","level":"1","pinyinCode":"shijingshanqu"},{"oid":10,"regionCode":"1108","parentCode":"11","cityName":"海淀区","level":"1","pinyinCode":"haidianqu"},{"oid":11,"regionCode":"1109","parentCode":"11","cityName":"门头沟区","level":"1","pinyinCode":"mentougouqu"},{"oid":12,"regionCode":"1111","parentCode":"11","cityName":"房山区","level":"1","pinyinCode":"fangshanqu"},{"oid":13,"regionCode":"1112","parentCode":"11","cityName":"通州区","level":"1","pinyinCode":"tongzhouqu"},{"oid":14,"regionCode":"1113","parentCode":"11","cityName":"顺义区","level":"1","pinyinCode":"shunyiqu"},{"oid":15,"regionCode":"1114","parentCode":"11","cityName":"昌平区","level":"1","pinyinCode":"changpingqu"},{"oid":17,"regionCode":"1124","parentCode":"11","cityName":"大兴县","level":"1","pinyinCode":"daxingxian"},{"oid":18,"regionCode":"1126","parentCode":"11","cityName":"平谷县","level":"1","pinyinCode":"pingguxian"},{"oid":19,"regionCode":"1127","parentCode":"11","cityName":"怀柔县","level":"1","pinyinCode":"huairouxian"},{"oid":20,"regionCode":"1128","parentCode":"11","cityName":"密云县","level":"1","pinyinCode":"miyunxian"},{"oid":21,"regionCode":"1129","parentCode":"11","cityName":"延庆县","level":"1","pinyinCode":"yanqingxian"}]
         */

        private String cityName;
        private List<CityBean> city;
        //额外添加本地属性
        private boolean hasCheck;//是否选中

        public boolean isHasCheck() {
            return hasCheck;
        }

        public void setHasCheck(boolean hasCheck) {
            this.hasCheck = hasCheck;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public List<CityBean> getCity() {
            return city;
        }

        public void setCity(List<CityBean> city) {
            this.city = city;
        }

        @Override
        public String getPickerViewText() {
            return cityName;
        }

        public static class CityBean {
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
            //额外添加本地属性
            private boolean hasCheck;//是否选中

            public boolean isHasCheck() {
                return hasCheck;
            }

            public void setHasCheck(boolean hasCheck) {
                this.hasCheck = hasCheck;
            }

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
        }
    }
}

