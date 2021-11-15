package com.example.cloudlc.dailyTest.bean;

public class PersonOne {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public PersonOne(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    /**
     * 为什么重写equals方法一定要重写hashCode方法下面也会讲
     */
    @Override
    public int hashCode() {
        String result = name + age;
        return result.hashCode();
    }
    /**
     * 重写 equals 方法 根据name和age都相同那么对象就默认相同
     */
    @Override
    public boolean equals(Object obj) {
        PersonOne u = (PersonOne) obj;
        return this.getName().equals(u.getName()) && (this.age.equals(u.getAge()));
    }
    /**
     * 重写 toString 方法
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
