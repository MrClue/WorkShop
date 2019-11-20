package com.company;

public abstract class Sensor {
    private String name;
    private double value;
    
    //Constructor
    public Sensor(String name)
    {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
