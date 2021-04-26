package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Car c1 = new Car()
        Producer p1 = new Producer();






        Scanner sc = new Scanner(System.in);

        p1.setBrand(sc.next());
        p1.setName(sc.next());

        System.out.println(p1.getBrand());
        System.out.println(p1.getName());

        Car c1 = new Car(p1);

        System.out.println(c1.getProducer().getBrand());
        System.out.println(c1.getProducer().getName());
        System.out.println(c1.g);




    }
}
