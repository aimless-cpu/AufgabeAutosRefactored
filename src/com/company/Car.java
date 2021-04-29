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

    public String getEngineType() {
        if (this.engine.getClass().equals(DieselEngine.class)) {
            this.engine = (DieselEngine) this.engine;
            return ((DieselEngine) this.engine).getFuelType();
        } else if (this.engine.getClass().equals(GasEngine.class)) {
            return ((GasEngine) this.engine).getFuelType();
        }
        return null;
    }

//    public D getMotorType() {
//        if (this.engine.getClass().equals(DieselEngine.class)) {
//            this.engine = (DieselEngine) this.engine;
//            return this.engine;
//        } else if (this.engine.getClass().equals(GasEngine.class)) {
//            this.engine = (GasEngine) this.engine;
//            return this.engine;
//        }
//        return null;
//
//    }




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
