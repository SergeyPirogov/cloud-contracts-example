package com.example.consumer.dto;

public class BeerResponse {

    private int age;
    private boolean beerAllowed;

    public BeerResponse(int age, boolean beerAllowed) {
        this.age = age;
        this.beerAllowed = beerAllowed;
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
