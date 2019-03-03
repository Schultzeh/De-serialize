package com.company;

import java.io.Serializable;

public class Car implements Serializable {

    private String brand;
    private String model;
    private Engine engine;

    public Car(String brand, String model, int horsepower){
        this.brand = brand;
        this.model = model;
        this.engine = new Engine(horsepower);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString(){
        return "Brand: " + this.getBrand() + " Model: " + this.getModel() + this.engine.toString();
    }
}
