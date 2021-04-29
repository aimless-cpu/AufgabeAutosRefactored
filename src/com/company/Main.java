package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Engine d1 = new Engine(10);
        DieselEngine de = new DieselEngine(0);
        GasEngine ge = new GasEngine(0);
        Producer p1 = new Producer();
        Car c1 = new Car(d1, p1);

//        Engine e = c1.getEngine();
//        if (e.getClass().equals(DieselEngine.class)){
//            DieselEngine de = (DieselEngine) e;
//            de.getFuelType();
//        }

        Scanner sc = new Scanner(System.in);

        String userInputString = sc.next();
        c1.getProducer().setBrand(userInputString);
        userInputString = sc.next();
        c1.getProducer().setName(userInputString);

        System.out.println("1 DIESEL, 2 BENZIN");
        int userInputInt = sc.nextInt();

        if (userInputInt == 1) {
            c1.setEngine(de);
        } else if (userInputInt == 2) {
            c1.setEngine(ge);
        }


        userInputInt = sc.nextInt();
        c1.getEngine().setHorsePower(userInputInt);




        System.out.println(c1.getProducer().getBrand());
        System.out.println(c1.getProducer().getName());
        System.out.println(c1.getEngine().getHorsePower());

        System.out.println(c1.getEngineType());

        //System.out.println(c1.habeDieselMotor().getFuelType());











        //c1.dieselEngine.getFuelType();










        //c1.dieselEngine.setFuelType(200);
        //System.out.println(c1.dieselEngine.getFuelType());







    }





}
