package com.allen.baseapi.dto;

/**
 * @author AllenWong
 * @date 2019/10/11 9:07 PM
 */
public class User {
    private String name;
    private int age;

    public User(){}
    public User(String name, int age) {
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name="+name+"age="+age;
    }
}
