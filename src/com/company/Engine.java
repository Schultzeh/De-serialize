package com.company;

import java.io.Serializable;

public class Engine implements Serializable {

    private int horsepower;

    public Engine(){
        this.horsepower = 500;
    }

    public Engine(int horsepower){
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString(){
        return " Horsepower: " + this.getHorsepower();
    }


}
