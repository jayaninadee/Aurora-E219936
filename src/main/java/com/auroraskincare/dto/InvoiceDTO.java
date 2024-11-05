/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.dto;

public class InvoiceDTO {
    private String invoiceID;
    private double amountPaid;
    private String paymentDate;
    private String paymentType;
    private String paymentCateg;

    public InvoiceDTO() {
    }

    public InvoiceDTO(String invoiceID, double amountPaid, String paymentDate, String paymentType, String paymentCateg) {
        this.invoiceID = invoiceID;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
        this.paymentType = paymentType;
        this.paymentCateg = paymentCateg;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentCateg() {
        return paymentCateg;
    }

    public void setPaymentCateg(String paymentCateg) {
        this.paymentCateg = paymentCateg;
    }

    @Override
    public String toString() {
        return "InvoiceDTO{" +
                "invoiceID='" + invoiceID + '\'' +
                ", amountPaid=" + amountPaid +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", paymentCateg='" + paymentCateg + '\'' +
                '}';
    }
}
