package com.company;

public class Car {
    //instance
    //private int price;
    DieselEngine dieselEngine;
    GasEngine gasEngine;

    //constructor

    public Car(DieselEngine dieselEngine) {
        this.dieselEngine = dieselEngine;

    }

    public Car(GasEngine gasEngine) {
        this.gasEngine = gasEngine;
    }


    //getter setter



    public DieselEngine getDieselEngine() {
        return dieselEngine;
    }

    public void setDieselEngine(DieselEngine dieselEngine) {
        this.dieselEngine = dieselEngine;
    }

    public GasEngine getGasEngine() {
        return gasEngine;
    }

    public void setGasEngine(GasEngine gasEngine) {
        this.gasEngine = gasEngine;
    }
}
