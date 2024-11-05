/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.entity;

public class Treatment {
    private int trID;
    private String trName;
    private double trprice;

    public Treatment() {
    }

    public Treatment(int trID, String trName, double trprice) {
        this.trID = trID;
        this.trName = trName;
        this.trprice = trprice;
    }

    public int getTrID() {
        return trID;
    }

    public void setTrID(int trID) {
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

}
