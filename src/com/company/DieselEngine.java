package com.company;

public class DieselEngine extends Engine{

    //instance
    private String FUELTYPE = "DIESEL";


    //constructor

    public DieselEngine(int horsePower) {
        super(horsePower);
        //this.FUELTYPE = FUELTYPE;
    }


    //getter setter


    public String getFUELTYPE() {
        return FUELTYPE;
    }

    public void setFUELTYPE(String FUELTYPE) {
        this.FUELTYPE = FUELTYPE;
    }

}
