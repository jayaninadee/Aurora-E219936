/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.entity;

public class Doctor {
    private String doctorID;
    private String dName;
    private String dSpecialization;
    private String dNIC;
    private int dConNumber;

    public Doctor() {
    }

    public Doctor(String doctorID, String dName, String dSpecialization, String dNIC, int dConNumber) {
        this.doctorID = doctorID;
        this.dName = dName;
        this.dSpecialization = dSpecialization;
        this.dNIC = dNIC;
        this.dConNumber = dConNumber;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdSpecialization() {
        return dSpecialization;
    }

    public void setdSpecialization(String dSpecialization) {
        this.dSpecialization = dSpecialization;
    }

    public String getdNIC() {
        return dNIC;
    }

    public void setdNIC(String dNIC) {
        this.dNIC = dNIC;
    }

    public int getdConNumber() {
        return dConNumber;
    }

    public void setdConNumber(int dConNumber) {
        this.dConNumber = dConNumber;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorID='" + doctorID + '\'' +
                ", dName='" + dName + '\'' +
                ", dSpecialization='" + dSpecialization + '\'' +
                ", dNIC='" + dNIC + '\'' +
                ", dConNumber=" + dConNumber +
                '}';
    }
}
