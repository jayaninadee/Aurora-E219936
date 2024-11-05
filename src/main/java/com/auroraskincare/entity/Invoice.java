/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.entity;

public class Invoice {
    private int patientID;
    private String pName;
    private String pNIC;
    private String pEmail;
    private int pConNumber;

    public Invoice() {
    }

    public Invoice(int patientID, String pName, String pNIC, String pEmail, int pConNumber) {
        this.patientID = patientID;
        this.pName = pName;
        this.pNIC = pNIC;
        this.pEmail = pEmail;
        this.pConNumber = pConNumber;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpNIC() {
        return pNIC;
    }

    public void setpNIC(String pNIC) {
        this.pNIC = pNIC;
    }

    public String getpEmail() {
        return pEmail;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail;
    }

    public int getpConNumber() {
        return pConNumber;
    }

    public void setpConNumber(int pConNumber) {
        this.pConNumber = pConNumber;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "patientID=" + patientID +
                ", pName='" + pName + '\'' +
                ", pNIC='" + pNIC + '\'' +
                ", pEmail='" + pEmail + '\'' +
                ", pConNumber=" + pConNumber +
                '}';
    }
}
