package com.simpleproject.Hospital_Management.Model;

public class Ward {
    private int ID;
    private String Ward_Name;
    private String Capacity;
    private String Current_Occupancy;
    private String Ward_Type;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getWard_Name() {
        return Ward_Name;
    }

    public void setWard_Name(String ward_Name) {
        Ward_Name = ward_Name;
    }

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String capacity) {
        Capacity = capacity;
    }

    public String getCurrent_Occupancy() {
        return Current_Occupancy;
    }

    public void setCurrent_Occupancy(String current_Occupancy) {
        Current_Occupancy = current_Occupancy;
    }

    public String getWard_Type() {
        return Ward_Type;
    }

    public void setWard_Type(String ward_Type) {
        Ward_Type = ward_Type;
    }
}
