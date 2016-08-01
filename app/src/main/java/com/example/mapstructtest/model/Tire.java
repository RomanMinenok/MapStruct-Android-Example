package com.example.mapstructtest.model;

public class Tire {
    private String name;
    private float diameter;

    public Tire(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return String.format("Tire %s with diameter %.2f", name, diameter);
    }
}
