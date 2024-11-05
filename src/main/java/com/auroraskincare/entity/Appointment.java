/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.entity;

import java.sql.Date;

public class Appointment {
    private String apID;
    private String apDate;
    private String apTime;
    private String apStatus;

    //Constructor
    public Appointment() {
    }

    public Appointment(String apID, String apDate, String apTime, String apStatus) {
        this.apID = apID;
        this.apDate = apDate;
        this.apTime = apTime;
        this.apStatus = apStatus;
    }

    //Getters & Setters

    public String getApID() {
        return apID;
    }

    public void setApID(String apID) {
        this.apID = apID;
    }

    public String getApDate() {
        return apDate;
    }

    public void setApDate(String apDate) {
        this.apDate = apDate;
    }

    public String getApTime() {
        return apTime;
    }

    public void setApTime(String apTime) {
        this.apTime = apTime;
    }

    public String getApStatus() {
        return apStatus;
    }

    public void setApStatus(String apStatus) {
        this.apStatus = apStatus;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "apID='" + apID + '\'' +
                ", apDate='" + apDate + '\'' +
                ", apTime='" + apTime + '\'' +
                ", apStatus='" + apStatus + '\'' +
                '}';
    }
}
