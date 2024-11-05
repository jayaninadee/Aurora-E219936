/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.dto;

public class PatientDTO {
    private String patientID;
    private String pName;
    private String pNIC;
    private String pEmail;
    private int pConNumber;

    public PatientDTO() {
    }

    public PatientDTO(String patientID, String pName, String pNIC, String pEmail, int pConNumber) {
        this.patientID = patientID;
        this.pName = pName;
        this.pNIC = pNIC;
        this.pEmail = pEmail;
        this.pConNumber = pConNumber;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
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
        return "PatientDTO{" +
                "patientID='" + patientID + '\'' +
                ", pName='" + pName + '\'' +
                ", pNIC='" + pNIC + '\'' +
                ", pEmail='" + pEmail + '\'' +
                ", pConNumber=" + pConNumber +
                '}';
    }
}
