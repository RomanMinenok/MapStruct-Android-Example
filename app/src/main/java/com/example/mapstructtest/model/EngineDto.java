package com.example.mapstructtest.model;

public class EngineDto {
    private int volume; // cc
    private int strokes;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getStrokes() {
        return strokes;
    }

    public void setStrokes(int strokes) {
        this.strokes = strokes;
    }

    @Override
    public String toString() {
        return String.format("%dcc and %d strokes", volume, strokes);
    }
}
