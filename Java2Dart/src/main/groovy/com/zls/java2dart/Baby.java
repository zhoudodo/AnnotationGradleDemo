package com.zls.java2dart;


public class Baby {


    public Baby(String name, String age, String man) {
        this.name = name;
        this.age = age;
        this.man = man;
    }

    public Baby() {

    }


    public String name;// "Json"
    public String age;// 30
    public String man;// true


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }


}