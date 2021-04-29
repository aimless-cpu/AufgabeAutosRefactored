package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Engine d1 = new DieselEngine(10);
        Car c1 = new Car(d1);

        System.out.println(c1.getEngine().getHorsePower());

//        Engine e = c1.getEngine();
//        if (e.getClass().equals(DieselEngine.class)){
//            DieselEngine de = (DieselEngine) e;
//            de.getFuelType();
//        }

        System.out.println(c1.habeDieselMotor().getFuelType());


        //c1.dieselEngine.getFuelType();










        //c1.dieselEngine.setFuelType(200);
        //System.out.println(c1.dieselEngine.getFuelType());







    }





}
