package com.example.mapstructtest.model;

public class Seat implements Cloneable {

    public String brandName;

    public Seat() {

    }

    public Seat(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
