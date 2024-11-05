/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.dto;

public class TreatmentDTO {
    private String trID;
    private String trName;
    private double trprice;

    public TreatmentDTO() {
    }

    public TreatmentDTO(String trID, String trName, double trprice) {
        this.trID = trID;
        this.trName = trName;
        this.trprice = trprice;
    }

    public String getTrID() {
        return trID;
    }

    public void setTrID(String trID) {
        this.trID = trID;
    }

    public String getTrName() {
        return trName;
    }

    public void setTrName(String trName) {
        this.trName = trName;
    }

    public double getTrprice() {
        return trprice;
    }

    public void setTrprice(double trprice) {
        this.trprice = trprice;
    }

    @Override
    public String toString() {
        return "TreatmentDTO{" +
                "trID='" + trID + '\'' +
                ", trName='" + trName + '\'' +
                ", trprice=" + trprice +
                '}';
    }
}
