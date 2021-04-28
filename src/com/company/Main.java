package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DieselEngine d1 = new DieselEngine(0);

        Scanner sc = new Scanner(System.in);

        System.out.println("1 Diesel, 2 Benzin");
        int input = sc.nextInt();

        if (input == 1) {
            System.out.println("Wie viel PS");
            input = sc.nextInt();
            d1.setHorsePower(input);


        } else if (input == 2) {
            System.out.println("GAS");
        }








        System.out.println(d1.getHorsePower());
        System.out.println(d1.getFUELTYPE());


    }


}
