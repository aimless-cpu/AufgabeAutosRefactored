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

        System.out.print(c1.getProducer().getBrand() + ";");
        System.out.print(c1.getProducer().getName() + ";");
        System.out.print(c1.getEngineType() + ";");
        System.out.print(c1.getEngine().getHorsePower() + ";");

        System.out.println(getPrice(de, ge, c1));

    }

    private static double getPrice(DieselEngine de, GasEngine ge, Car c1) {
        double price = 20000;
        if (c1.getEngine().equals(de)) {
            price = (price + 20000) + c1.getEngine().getHorsePower();
        } else if (c1.getEngine().equals(ge)) {
            price = (price + 10000) + c1.getEngine().getHorsePower();
        }
        return price;
    }


}
