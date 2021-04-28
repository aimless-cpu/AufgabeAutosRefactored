package com.company;

public class GasEngine extends Engine {

    private String FUELTYPE = "BENZ";

    public GasEngine(int horsePower) {
        super(horsePower);
        //this.FUELTYPE = FUELTYPE;
    }

    public String getFUELTYPE() {
        return FUELTYPE;
    }

    public void setFUELTYPE(String FUELTYPE) {
        this.FUELTYPE = FUELTYPE;
    }
}
