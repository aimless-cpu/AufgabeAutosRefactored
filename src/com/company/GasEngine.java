package com.company;

public class GasEngine extends Engine {
    private String fuelType = "Benzin";

    public GasEngine(int horsePower) {
        super(horsePower);
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
