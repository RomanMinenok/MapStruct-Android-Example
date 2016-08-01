package com.example.mapstructtest.model;

import java.util.Iterator;
import java.util.List;

public class Car {
    private String make;
    private String model;
    private Engine engine;
    private int numberOfSeats;
    private CarType type;
    private float width;
    private float length;
    private Tire tire;
    private List<Seat> seats;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        String format = "Car make:%s,\nmodel:%s,\ntype:%s,\nengine:%s,\nnumber of seats:%d,\nsize:%.2fx%.2f," +
                "\ntire:%s, %s";
        return String.format(format, make, model, type, engine, numberOfSeats, width, length, tire, getSeatsDescription());
    }

    private String getSeatsDescription() {
        if (seats == null || seats.isEmpty()) {
            return "Seats: no seats";
        }
        StringBuilder sb = new StringBuilder();
        for (Iterator<Seat> it = seats.iterator(); it.hasNext(); ) {
            Seat seat = it.next();
            sb.append("Seat " + seat.brandName);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}