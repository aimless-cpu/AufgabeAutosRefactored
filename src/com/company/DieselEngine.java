package com.company;

public class DieselEngine {
    //instance
    private String FUELTYPE;

    //constructor
    public DieselEngine(String FUELTYPE) {
        this.FUELTYPE = FUELTYPE;
    }

    public String getFUELTYPE() {
        return FUELTYPE;
    }

    public void setFUELTYPE(String FUELTYPE) {
        this.FUELTYPE = FUELTYPE;
    }
}
