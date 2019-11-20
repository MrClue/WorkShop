package com.company;

public class CO2Sensor extends Sensor {
    private int CO2;

    public CO2Sensor(String name)
    {
        super(name);
    }
    
    public int getCO2(){
        return this.CO2;
    }
}
