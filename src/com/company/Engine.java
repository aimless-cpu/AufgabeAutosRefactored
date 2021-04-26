package com.company;

public class Engine extends DieselEngine, GasEngine {

    //instance
    private int horsePower;

    //constructor
    public Engine(String FUELTYPE, int horsePower) {
        super(FUELTYPE);
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
