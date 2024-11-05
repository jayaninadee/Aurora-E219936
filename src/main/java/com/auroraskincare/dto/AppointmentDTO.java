/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.dto;

public class AppointmentDTO {
    private String apID;
    private String apDate;
    private String apTime;
    private String apStatus;

    //Constructor

    public AppointmentDTO() {
    }

    public AppointmentDTO(String apID, String apDate, String apTime, String apStatus) {
        this.apID = apID;
        this.apDate = apDate;
        this.apTime = apTime;
        this.apStatus = apStatus;
    }

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
        return "AppointmentDTO{" +
                "apID='" + apID + '\'' +
                ", apDate='" + apDate + '\'' +
                ", apTime='" + apTime + '\'' +
                ", apStatus='" + apStatus + '\'' +
                '}';
    }
}
