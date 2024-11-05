/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.bo;

public class BOFactory {
    public enum BOTypes{
        CASHIER, DOCTOR, PATIENT, APPOINTMENT, TREATMENT, INVOICE;
    }
    private static BOFactory boFactory;
    private BOFactory(){
    }
    public static BOFactory getInstance(){
        if (boFactory == null){
            boFactory = new BOFactory();
        }
        return boFactory;
    }
    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case CASHIER:
                return new CashierBoImpl();
            case DOCTOR:
                return new DoctorBoImpl();
            case PATIENT:
                return new PatientBoImpl();
            case APPOINTMENT:
                return new AppointmentBoImpl();
            case TREATMENT:
                return new TreatmentBoImpl();
            case INVOICE:
                return new InvoiceBoImpl();
            default:
                return null;
        }
    }
}
