package com.geektech;

import java.util.Random;

public class Car1 extends Car {
    private Characteristic characteristic;
    private String model;

    public Car1(Characteristic characteristic, String model,Name name, int cost) {
        super(name,cost);
        this.characteristic = characteristic;
        this.model = model;
    }



    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nmodel = "+model+"\nmax speed = "
                +characteristic.getMaxSpeed()+"\nvolume = "+characteristic.getVolume();
    }
}
