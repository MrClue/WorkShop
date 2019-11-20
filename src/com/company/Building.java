package com.company;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList sensors;
    private ArrayList actuators;

    public String getName() {
        return this.name;
    }

    public ArrayList getSensors() {
        return this.sensors;
    }

    public ArrayList getActuators() {
        return this.actuators;
    }
}
