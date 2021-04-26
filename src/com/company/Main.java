package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Car c1 = new Car()
        Producer p1 = new Producer("test","s3");
        System.out.println(p1.getBrand());

        Scanner sc = new Scanner(System.in);

        p1.setBrand(sc.next());
        p1.setName(sc.next());

        System.out.println(p1.getBrand());
        System.out.println(p1.getName());






    }
}
