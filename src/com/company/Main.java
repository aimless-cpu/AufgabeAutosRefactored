package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userInputString;


        Producer p1 = new Producer();
        Car c1 = new Car(p1);


        Scanner sc = new Scanner(System.in);
        userInputString = sc.next();

        c1.producer.setBrand(userInputString);
        c1.producer.setName(userInputString);

        System.out.println(c1.producer.getBrand());
        System.out.print(c1.producer.getName());







    }
}
