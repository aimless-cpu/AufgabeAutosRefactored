package com.company;

public class Engine extends DieselEngine {

    //instance
    private int horsePower;

    //constructor
    public Engine(String fuelType, int horsePower) {
        super(fuelType);
        this.horsePower = horsePower;
    }

    //method


    //getter setter


    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
