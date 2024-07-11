package com.capaData;

/**
 *
 * @author Miguel Antonio
 */
public class MSaleDetails {
    
    private int idSaleDetails;
    private int idSale;
    private String idProduct;
    private int quantity;
    private Double price;
    private Double total;

    public MSaleDetails() {
    }

    public MSaleDetails(int idSaleDetails, int idSale, String idProduct, int quantity, Double price, Double total) {
        this.idSaleDetails = idSaleDetails;
        this.idSale = idSale;
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public int getIdSaleDetails() {
        return idSaleDetails;
    }

    public void setIdSaleDetails(int idSaleDetails) {
        this.idSaleDetails = idSaleDetails;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
