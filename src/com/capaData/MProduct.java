package com.capaData;

import java.sql.Date;
/**
 *
 * @author Miguel Antonio
 */
public class MProduct {
    
    private String idProduct;
    private int idCategory;
    private String serie;
    private String name;
    private Date fIncome;
    private Date fExpiration;
    private double pSale;
    private double pBuys;

    public MProduct() {
    }

    public MProduct(String idProduct, int idCategory, String serie, String name, Date fIncome, Date fExpiration, double pSale, double pBuys) {
        this.idProduct = idProduct;
        this.idCategory = idCategory;
        this.serie = serie;
        this.name = name;
        this.fIncome = fIncome;
        this.fExpiration = fExpiration;
        this.pSale = pSale;
        this.pBuys = pBuys;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getfIncome() {
        return fIncome;
    }

    public void setfIncome(Date fIncome) {
        this.fIncome = fIncome;
    }

    public Date getfExpiration() {
        return fExpiration;
    }

    public void setfExpiration(Date fExpiration) {
        this.fExpiration = fExpiration;
    }

    public double getpSale() {
        return pSale;
    }

    public void setpSale(double pSale) {
        this.pSale = pSale;
    }

    public double getpBuys() {
        return pBuys;
    }

    public void setpBuys(double pBuys) {
        this.pBuys = pBuys;
    }
    
    
}
