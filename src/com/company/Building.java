package com.company;

import java.util.ArrayList;

public class Building {
    private String name;
    private int id;
    private ArrayList<Sensor> sensors = new ArrayList<>();
    private ArrayList<Actuators> actuators = new ArrayList<>();

    
    public Building(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }

    public int getId()
    {
        return id;
    }
    
    public void addSensor(TempSensor temp)
    {
        sensors.add(temp);
    }
    public void addSensor(CO2Sensor co2)
    {
        sensors.add(co2);
    }
    
    public void removeAllSensors()
    {
        for (int i = 0; i < sensors.size(); i++)
        {
            sensors.remove(i);
            i--;
        }
    }
    public void removeSensor(String name)
    {
        for (int i = 0; i < sensors.size(); i++)
        {
            if(sensors.get(i).getName().equals(name))
            {
                sensors.remove(i);
                return; //Stop metode
            }
        }
    }
    
    public void addActuator(Actuators actuator)
    {
        actuators.add(actuator);
    }
    public void removeActuator(String name)
    {
        for (int i = 0; i < actuators.size(); i++)
        {
            if(actuators.get(i).getName().equals(name))
            {
                actuators.remove(i);
                return; //Stop metode
            }
        }
    }
    public void removeAllActuators()
    {
        for (int i = 0; i < actuators.size(); i++)
        {
            actuators.remove(i);
            i--;
        }
    }
    
    public ArrayList getSensors() {
        return this.sensors;
    }
    public String sensorToString()
    {
        String returnString = "Sensors:";
        for (int i = 0; i < sensors.size(); i++)
        {
            returnString += "\n" + sensors.get(i).getName();
        }
        
        return returnString;
    }

    public ArrayList<Actuators> getActuators() {
        return this.actuators;
    }
    public String actuatorToString()
    {
        String returnString = "Actuators:";
        for (int i = 0; i < actuators.size(); i++)
        {
            returnString += "\n" + actuators.get(i).getName();
        }
        
        return returnString;
    }
}
