/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.dao;

import com.auroraskincare.dao.custom.impl.*;

public class DAOFactory {
    public enum DAOTypes{
        CASHIER, DOCTOR, PATIENT, APPOINTMENT, TREATMENT, INVOICE;
    }
    private static DAOFactory daoFactory;
    public DAOFactory() {
    }
    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    public SuperDAO getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case CASHIER:
                return new CashierDAOImpl();
            case DOCTOR:
                return new DoctorDAOImpl();
            case PATIENT:
                return new PatientDAOImpl();
            case APPOINTMENT:
                return new AppointmentDAOImpl();
            case TREATMENT:
                return new TreatmentDAOImpl();
            case INVOICE:
                return new InvoiceDAOImpl();
            default:
                return null;

        }
    }
}
