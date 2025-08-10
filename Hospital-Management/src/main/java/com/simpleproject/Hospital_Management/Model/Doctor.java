package com.simpleproject.Hospital_Management.Model;

public class Doctor {
    private int ID;
    private String First_Name;
    private String Last_Name;
    private String Specialization;
    private String phone_Number;
    private String Email;
    private String Date_OF_Birth;
    private String Gender;


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

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDate_OF_Birth() {
        return Date_OF_Birth;
    }

    public void setDate_OF_Birth(String date_OF_Birth) {
        Date_OF_Birth = date_OF_Birth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "ID=" + ID +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Specialization='" + Specialization + '\'' +
                ", phone_Number='" + phone_Number + '\'' +
                ", Email='" + Email + '\'' +
                ", Date_OF_Birth='" + Date_OF_Birth + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
