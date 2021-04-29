package com.company;

public class Car {
    private Engine engine;
    private Producer producer;

    public Car(Engine engine, Producer producer) {
        this.engine = engine;
        this.producer = producer;
    }

    public Engine getEngine() {
        return engine;
    }

    public DieselEngine habeDieselMotor(){
        if (this.engine.getClass().equals(DieselEngine.class)){
            return (DieselEngine) this.engine;
        }
        return null;
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
