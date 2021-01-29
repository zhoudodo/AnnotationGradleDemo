package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

import java.io.Serializable;
import java.util.List;

/**
 * shc
 * Created by shc on 2018/6/15.
 */
@Java2Dart("AddressBean")
public class AddressBean {

    /**
     * total : 4
     * list : [{"addressId":25,"recName":"赵明栋","areaStr":"浙江杭州西湖区","detailAdress":"联合大厦","postCode":null,"recPhone":"13616505447","province":"33","city":"3301","area":"330106","isDefault":"0"},{"addressId":74,"recName":"赵明栋","areaStr":"浙江杭州拱墅区","detailAdress":"塘河新村20-2-501","postCode":null,"recPhone":"13157188765","province":"33","city":"3301","area":"330105","isDefault":"1"},{"addressId":83,"recName":"ZMD","areaStr":"浙江杭州上城区","detailAdress":"瓶窑","postCode":null,"recPhone":"13157188735","province":"33","city":"3301","area":"330102","isDefault":"1"},{"addressId":86,"recName":"孙恒超","areaStr":"浙江杭州西湖区","detailAdress":"联合大厦","postCode":"000000","recPhone":"15515509683","province":"33","city":"3301","area":"330106","isDefault":"1"}]
     */

    private int total;
    private List<ListBean> list;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean implements Serializable {
        /**
         * addressId : 25
         * recName : 赵明栋
         * areaStr : 浙江杭州西湖区
         * detailAdress : 联合大厦
         * postCode : null
         * recPhone : 13616505447
         * province : 33
         * city : 3301
         * area : 330106
         * isDefault : 0
         */

        private int addressId;
        private String recName;
        private String areaStr;
        private String detailAdress;
        private Object postCode;
        private String recPhone;
        private String province;
        private String city;
        private String area;
        private String isDefault;

        public int getAddressId() {
            return addressId;
        }

        public void setAddressId(int addressId) {
            this.addressId = addressId;
        }

        public String getRecName() {
            return recName;
        }

        public void setRecName(String recName) {
            this.recName = recName;
        }

        public String getAreaStr() {
            return areaStr;
        }

        public void setAreaStr(String areaStr) {
            this.areaStr = areaStr;
        }

        public String getDetailAdress() {
            return detailAdress;
        }

        public void setDetailAdress(String detailAdress) {
            this.detailAdress = detailAdress;
        }

        public Object getPostCode() {
            return postCode;
        }

        public void setPostCode(Object postCode) {
            this.postCode = postCode;
        }

        public String getRecPhone() {
            return recPhone;
        }

        public void setRecPhone(String recPhone) {
            this.recPhone = recPhone;
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

        public String getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(String isDefault) {
            this.isDefault = isDefault;
        }
    }
}
