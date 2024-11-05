/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.dto;

public class CashierDTO {
    private String CaID;
    private String CaName;
    private String CaUName;
    private String CaPass;
    private String CaNIC;

    //Constructor
    public CashierDTO() {
    }

    public CashierDTO(String caID, String caName, String caUName, String caPass, String caNIC) {
        CaID = caID;
        CaName = caName;
        CaUName = caUName;
        CaPass = caPass;
        CaNIC = caNIC;
    }

    public String getCaID() {
        return CaID;
    }

    public void setCaID(String caID) {
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
        return "CashierDTO{" +
                "CaID='" + CaID + '\'' +
                ", CaName='" + CaName + '\'' +
                ", CaUName='" + CaUName + '\'' +
                ", CaPass='" + CaPass + '\'' +
                ", CaNIC='" + CaNIC + '\'' +
                '}';
    }
}
