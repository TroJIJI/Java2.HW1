package com.geektech;

public class Characteristic {
    private double volume;
    private int maxSpeed;

    public Characteristic(double volume, int maxSpeed) {
        this.volume = volume;
        this.maxSpeed = maxSpeed;
    }

    public double getVolume() {
        return volume;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
