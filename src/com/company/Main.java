package com.company;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {



        DieselEngine d1 = new DieselEngine(10);
        //GasEngine g1 = new GasEngine(20);

        int i = 1;

        //AtomicReference<Object> t1 = new AtomicReference<>(getEngineType(i));
        Object t1 = getEngineType(i);

        Car c2 = new Car((GasEngine) t1);

        Scanner sc = new Scanner(System.in);


        int input = sc.nextInt();
        c2.gasEngine.setHorsePower(input);
        System.out.println(c2.gasEngine.getFUELTYPE());
        System.out.println(c2.gasEngine.getHorsePower());


    }

    private static Object getEngineType(int i) {
        if (i == 1) {
            DieselEngine t1 = new DieselEngine(0);
            return t1;
        } else {
            GasEngine t1 = new GasEngine(0);
            return t1;
        }
    }


}
