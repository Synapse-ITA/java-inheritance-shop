package org.java.inheritance.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    // ATTRIBUTI AGGIUNTIVI
    private int productImei;
    private int productRam;

    // COSTRUTTORE
    public Smartphone(String productName, String productDescription, BigDecimal productPrice, BigDecimal productIva, int productImei, int productRam) {
        super(productName, productDescription, productPrice, productIva);
        this.productImei = productImei;
        this.productRam = productRam;
    }

    // GETTER AND SETTER


    public int getProductImei() {
        return productImei;
    }

    public void setProductImei(int productImei) {
        this.productImei = productImei;
    }

    public int getProductRam() {
        return productRam;
    }

    public void setProductRam(int productRam) {
        this.productRam = productRam;
    }

    // METODI

    @Override
    public String toString() {
        return super.toString() + ", IMEI: " + getProductImei() + ", RAM: " + getProductRam() + " ,";
}
}







