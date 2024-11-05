/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.entity;

public class Cashier {
    private int CaID;
    private String CaName;
    private String CaUName;
    private String CaPass;
    private String CaNIC;

    //Constructor
    public Cashier() {
    }

    public Cashier(int caID, String caName, String caUName, String caPass, String caNIC) {
        CaID = caID;
        CaName = caName;
        CaUName = caUName;
        CaPass = caPass;
        CaNIC = caNIC;
    }
//Getters & Setters

    public int getCaID() {
        return CaID;
    }

    public void setCaID(int caID) {
        CaID = caID;
    }

    public String getCaName() {
        return CaName;
    }

    public void setCaName(String caName) {
        CaName = caName;
    }

    public String getCaUName() {
        return CaUName;
    }

    public void setCaUName(String caUName) {
        CaUName = caUName;
    }

    public String getCaPass() {
        return CaPass;
    }

    public void setCaPass(String caPass) {
        CaPass = caPass;
    }

    public String getCaNIC() {
        return CaNIC;
    }

    public void setCaNIC(String caNIC) {
        CaNIC = caNIC;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "CaID=" + CaID +
                ", CaName='" + CaName + '\'' +
                ", CaUName='" + CaUName + '\'' +
                ", CaPass='" + CaPass + '\'' +
                ", CaNIC='" + CaNIC + '\'' +
                '}';
    }
}
