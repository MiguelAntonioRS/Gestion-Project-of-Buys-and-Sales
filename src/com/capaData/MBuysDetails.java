package com.capaData;

/**
 *
 * @author Miguel Antonio
 */
public class MBuysDetails {

    private int idBuysDetails;
    private int idBuys;
    private String idProduct;
    private int amount;
    private double price;
    private double total;

    public MBuysDetails() {
    }

    public MBuysDetails(int idBuysDetails, int idBuys, String idProduct, int amount, double price, double total) {
        this.idBuysDetails = idBuysDetails;
        this.idBuys = idBuys;
        this.idProduct = idProduct;
        this.amount = amount;
        this.price = price;
        this.total = total;
    }

    public int getIdBuysDetails() {
        return idBuysDetails;
    }

    public void setIdBuysDetails(int idBuysDetails) {
        this.idBuysDetails = idBuysDetails;
    }

    public int getIdBuys() {
        return idBuys;
    }

    public void setIdBuys(int idBuys) {
        this.idBuys = idBuys;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
