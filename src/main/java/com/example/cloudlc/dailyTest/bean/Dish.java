package com.example.cloudlc.dailyTest.bean;

public class Dish {
    String name;
    boolean is;
    Integer num;

    public Dish() {
    }

    public Dish(String name, boolean is, Integer num) {
        this.name = name;
        this.is = is;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs() {
        return is;
    }

    public void setIs(boolean is) {
        this.is = is;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", is=" + is +
                ", num=" + num +
                '}';
    }
}
