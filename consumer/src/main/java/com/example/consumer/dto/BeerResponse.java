package com.example.consumer.dto;

public class BeerResponse {

    private int age;
    private boolean beerAllowed;
    private String sex;

    public BeerResponse(int age, String sex, boolean beerAllowed) {
        this.age = age;
        this.sex = sex;
        this.beerAllowed = beerAllowed;
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

    public boolean isBeerAllowed() {
        return beerAllowed;
    }

    public void setBeerAllowed(boolean beerAllowed) {
        this.beerAllowed = beerAllowed;
    }
}
