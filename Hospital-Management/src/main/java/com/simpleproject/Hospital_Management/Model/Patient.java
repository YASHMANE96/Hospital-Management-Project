package com.simpleproject.Hospital_Management.Model;

public class Patient {
    private int ID;
    private String First_Name;
    private String Last_Name;
    private String Address;
    private String Date_OF_Birth;
    private String Contact_Number;
    private String Admission_Date;
    private int Doctor_ID;
    private int Ward_ID;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDate_OF_Birth() {
        return Date_OF_Birth;
    }

    public void setDate_OF_Birth(String date_OF_Birth) {
        Date_OF_Birth = date_OF_Birth;
    }

    public String getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(String contact_Number) {
        Contact_Number = contact_Number;
    }

    public String getAdmission_Date() {
        return Admission_Date;
    }

    public void setAdmission_Date(String admission_Date) {
        Admission_Date = admission_Date;
    }

    public int getDoctor_ID() {
        return Doctor_ID;
    }

    public void setDoctor_ID(int doctor_ID) {
        Doctor_ID = doctor_ID;
    }

    public int getWard_ID() {
        return Ward_ID;
    }

    public void setWard_ID(int ward_ID) {
        Ward_ID = ward_ID;
    }
}
