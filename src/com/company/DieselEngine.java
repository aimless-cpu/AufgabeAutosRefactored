package com.company;

public class DieselEngine {
    //instance
    private String fuelType;

    //constructor
    public DieselEngine(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
