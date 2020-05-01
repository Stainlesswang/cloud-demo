package com.allen.baseapi.dto;

/**
 * @author AllenWong
 * @date 2019/10/11 9:07 PM
 */
public class User {
    private int id;
    private String name;
    private String password;
    private long money;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "name="+name+"age="+age;
    }
}
