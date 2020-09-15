package com.example.producer.dto;

public class AgeDto {

    private int age;
    private String sex;

    public AgeDto(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
