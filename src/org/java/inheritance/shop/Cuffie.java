package org.java.inheritance.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    // ATTRIBUTI

    private String productColor;
    private boolean productWireless;

    // COSTRUTTORE

    public Cuffie(String productName, String productDescription, BigDecimal productPrice, BigDecimal productIva, String productColor, boolean productWireless) {
        super(productName, productDescription, productPrice, productIva);
        this.productColor = productColor;
        this.productWireless = productWireless;
    }

    // GETTER AND SETTER
    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public boolean isProductWireless() {
        return productWireless;
    }

    public void setProductWireless(boolean productWireless) {
        this.productWireless = productWireless;
    }

    // METODI

    @Override
    public String toString() {
        return super.toString() + ", Colore: " + getProductColor() + ", Wireless: " + isProductWireless() + " ,";
    }
}
