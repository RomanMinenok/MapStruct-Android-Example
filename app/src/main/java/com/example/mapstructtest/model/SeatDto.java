package com.example.mapstructtest.model;

public class SeatDto {

    public String brandName;

    public SeatDto() {

    }

    public SeatDto(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
