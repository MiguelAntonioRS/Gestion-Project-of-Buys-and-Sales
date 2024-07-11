package com.capaData;

import java.sql.Date;

/**
 *
 * @author Miguel Antonio
 */
public class MBuys {

    private int idBuys;
    private Date date;
    private String hour;
    private String documentNumber;
    private String documentType;
    private double igv;
    private double subTotal;
    private double total;
    private String status;
    private int idUser;
    private String idSupplier;

    public MBuys() {
    }

    public MBuys(int idBuys, Date date, String hour, String documentNumber, String documentType, double igv, double subTotal, double total, String status, int idUser, String idSupplier) {
        this.idBuys = idBuys;
        this.date = date;
        this.hour = hour;
        this.documentNumber = documentNumber;
        this.documentType = documentType;
        this.igv = igv;
        this.subTotal = subTotal;
        this.total = total;
        this.status = status;
        this.idUser = idUser;
        this.idSupplier = idSupplier;
    }

    public int getIdBuys() {
        return idBuys;
    }

    public void setIdBuys(int idBuys) {
        this.idBuys = idBuys;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

}
