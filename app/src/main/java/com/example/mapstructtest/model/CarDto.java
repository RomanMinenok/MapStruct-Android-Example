package com.example.mapstructtest.model;

import java.util.List;

public class CarDto {
    private String make;
    private String modelName;
    private int seatCount;
    private String type;
    private Size size;
    private EngineDto engine;
    private String tireName;
    private float tireSize;
    private List<SeatDto> seats;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public EngineDto getEngine() {
        return engine;
    }

    public void setEngine(EngineDto engine) {
        this.engine = engine;
    }

    public String getTireName() {
        return tireName;
    }

    public void setTireName(String tireName) {
        this.tireName = tireName;
    }

    public float getTireSize() {
        return tireSize;
    }

    public void setTireSize(float tireSize) {
        this.tireSize = tireSize;
    }

    public List<SeatDto> getSeats() {
        return seats;
    }

    public void setSeats(List<SeatDto> seats) {
        this.seats = seats;
    }
}
