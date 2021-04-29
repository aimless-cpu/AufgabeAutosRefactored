package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Engine d1 = new DieselEngine(10);
        Producer p1 = new Producer();
        Car c1 = new Car(d1, p1);

//        Engine e = c1.getEngine();
//        if (e.getClass().equals(DieselEngine.class)){
//            DieselEngine de = (DieselEngine) e;
//            de.getFuelType();
//        }

        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();
        c1.getProducer().setBrand(userInput);
        userInput = sc.next();
        c1.getProducer().setName(userInput);


        System.out.println(c1.getProducer().getBrand());
        System.out.println(c1.getProducer().getName());
        System.out.println(c1.getEngine().getHorsePower());
        System.out.println(c1.habeDieselMotor().getFuelType());











        //c1.dieselEngine.getFuelType();










        //c1.dieselEngine.setFuelType(200);
        //System.out.println(c1.dieselEngine.getFuelType());







    }





}
