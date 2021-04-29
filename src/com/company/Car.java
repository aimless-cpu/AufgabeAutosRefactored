package com.company;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
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
}
