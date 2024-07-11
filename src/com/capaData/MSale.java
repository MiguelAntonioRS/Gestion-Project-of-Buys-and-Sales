package com.capaData;

import java.sql.Date;
/**
 *
 * @author Miguel Antonio
 */
public class MSale {
    
    private int idSale;
    private Date date;
    private String hour;
    private String serie;
    private String documentNumber;
    private String documentType;
    private double subtotal;
    private double igv;
    private double total;
    private String status;
    private int idUser;
    private String idClient;

    public MSale() {
    }

    public MSale(int idSale, Date date, String hour, String serie, String documentNumber, String documentType, double subtotal, double igv, double total, String status, int idUser, String idClient) {
        this.idSale = idSale;
        this.date = date;
        this.hour = hour;
        this.serie = serie;
        this.documentNumber = documentNumber;
        this.documentType = documentType;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
        this.status = status;
        this.idUser = idUser;
        this.idClient = idClient;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
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

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }
    
    
}
