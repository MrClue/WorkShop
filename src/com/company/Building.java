package com.company;

import java.util.ArrayList;

public class Building {
    private String name;
    private int id;
    private ArrayList sensors;
    private ArrayList actuators;

    
    public Building(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public int getId()
    {
        return id;
    }
    
    public ArrayList getSensors() {
        return sensors;
    }

    public ArrayList getActuators() {
        return actuators;
    }
}
