package com.example.consumer.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeerResponse {

    private int age;
    private boolean beerAllowed;
    private String sex;

    public BeerResponse(int age, String sex, boolean beerAllowed) {
        this.age = age;
        this.sex = sex;
        this.beerAllowed = beerAllowed;
    }
}
