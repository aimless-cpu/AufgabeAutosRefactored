package com.company;

public class DieselEngine extends Engine{
    //instance
    private String FUELTYPE = "DIESEL";
    private int horsePower1 = 100;
    private int horsePower2 = 120;

    //constructor
    public DieselEngine(int horsePower) {
        super(horsePower);
    }

    //getter setter


    public String getFUELTYPE() {
        return FUELTYPE;
    }

    public void setFUELTYPE(String FUELTYPE) {
        this.FUELTYPE = FUELTYPE;
    }

    public int getHorsePower1() {
        return horsePower1;
    }

    public int getHorsePower2() {
        return horsePower2;
    }
}
