package com.company;

public class Car {
    //instance
    private double price;
    Engine engine;
    Producer producer;

    //constructor

    public Car(Producer producer) {
        this.producer = producer;
        this.engine = engine;
    }

    //method



    //getter setter
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
