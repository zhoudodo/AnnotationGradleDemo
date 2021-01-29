package com.gangyi.buildsrc;

import com.google.gson.Gson;

public class Person {


    public Person(String name, String age, String man) {
        this.name = name;
        this.age = age;
        this.man = man;
    }

    public Person() {

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

    @Override
    public String toString() {
        Gson gson = new Gson();
        Person clone = new Person();
        clone.age = this.age;
        clone.name = this.name;
        clone.man = this.man;

        String json = gson.toJson(clone);
        return json;
    }
}