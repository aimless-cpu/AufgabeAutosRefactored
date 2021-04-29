package com.company;

public class DieselEngine extends Engine{
    private String fuelType = "Diesel";

    public DieselEngine(int horsePower) {
        super(horsePower);
    }


    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

}
