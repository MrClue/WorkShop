package com.company;

public class Actuators {

    private String name;
    public ActuatorType type = ActuatorType.Ventilator;
    private double setPoint;


    public String getName() {
        return name;
    }

    public enum ActuatorType {
        Ventilator
    }

    public double getPoint() {
        return setPoint;
    }

    public void setPoint(double point) {
        this.setPoint = point;
    }

}

