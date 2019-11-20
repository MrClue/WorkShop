package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

import rd01.oop.workshop.acquaintance.IBuildingManagementSystem;

public class BuildingAdministrator implements IBuildingManagementSystem {

    private ArrayList<Building> buildings = new ArrayList<Building>();

    // Constructors
    public BuildingAdministrator() {

    }

    public void addBuilding(String name, int id) {
        Building building = new Building(name, id);
        buildings.add(building);
    }

    public void removeBuilding(String name, int id) {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getName().equals(name) && buildings.get(i).getId() == id) {
                System.out.println("Removed " + name + "(" + id + ")");
                buildings.remove(i);
                return; // Stop metode
            }
        }
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    @Override
    public String toString() {
        String returnString = "Buildings:";
        for (int i = 0; i < buildings.size(); i++) {
            returnString += "\n" + buildings.get(i).getName() + "(id: " + buildings.get(i).getId() + ")";
        }

        return returnString;
    }

    @Override
    public Map<UUID, String> getBuildingInformation() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        // TODO Auto-generated method stub

    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        // TODO Auto-generated method stub

    }
}
