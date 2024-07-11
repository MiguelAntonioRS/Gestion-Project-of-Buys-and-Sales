package com.capaData;

/**
 *
 * @author Miguel Antonio
 */
public class MSupplier {
    private String idSupplier;
    private String socialRazon;
    private String ruc;
    private String phone;
    private String address;

    public MSupplier() {
    }

    public MSupplier(String idSupplier, String socialRazon, String ruc, String phone, String direction) {
        this.idSupplier = idSupplier;
        this.socialRazon = socialRazon;
        this.ruc = ruc;
        this.phone = phone;
        this.address = direction;
    }

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getSocialRazon() {
        return socialRazon;
    }

    public void setSocialRazon(String socialRazon) {
        this.socialRazon = socialRazon;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
