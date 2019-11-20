package com.company;

public class TempSensor extends Sensor {
    private int temperature;

    public TempSensor(String name)
    {
        super(name);
    }
    
    public int getTemperature(){
        return this.temperature;
    }
}
