package com.company;

import java.util.ArrayList;


public class BuildingAdministrator {
    
    private ArrayList<Building> buildings = new ArrayList<Building>();
    
    //Constructors
    public BuildingAdministrator()
    {
        
    }
    
    public void addBuilding(String name, int id)
    {
        Building building = new Building(name, id);
        buildings.add(building);
    }
    
    public void removeBuilding(String name, int id)
    {
        for(int i = 0; i < buildings.size(); i++)
        {
            if(buildings.get(i).getName().equals(name) && buildings.get(i).getId() == id)
            {
                System.out.println("Removed " + name + "(" + id + ")");
                buildings.remove(i);
                return; //Stop metode
            }
        }
    }
    
    
    public ArrayList<Building> getBuildings()
    {
        return buildings;
    }
}
