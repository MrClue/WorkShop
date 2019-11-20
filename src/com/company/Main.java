package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BuildingAdministrator ba = new BuildingAdministrator();
        
        ba.addBuilding("U55", 1);
        ba.addBuilding("U53", 2);
        ba.getBuildings().get(1).addSensor(new TempSensor("TempSensor_01"));
        ba.getBuildings().get(1).addSensor(new TempSensor("TempSensor_02"));
        ba.getBuildings().get(1).addActuator(new Actuators("Actuator_01", 4.0));
        ba.getBuildings().get(1).addActuator(new Actuators("Actuator_02", 5.0));
        
        System.out.println(ba.toString() + "\n");
        System.out.println(ba.getBuildings().get(1).sensorToString() + "\n");
        System.out.println(ba.getBuildings().get(1).actuatorToString() + "\n");

        ba.removeBuilding("U55", 1);
        System.out.println(ba.toString() + "\n");

        ba.getBuildings().get(0).removeSensor("TempSensor_01");
        System.out.println(ba.getBuildings().get(0).sensorToString() + "\n");
        ba.getBuildings().get(0).removeActuator("Actuator_01");
        System.out.println(ba.getBuildings().get(0).actuatorToString() + "\n");
        ba.getBuildings().get(0).getActuators().get(0).setPoint(0.0);
        System.out.println("Point: " + ba.getBuildings().get(0).getActuators().get(0).getPoint() + "\n");
    }
}
