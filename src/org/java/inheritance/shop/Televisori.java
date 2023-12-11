package org.java.inheritance.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {

    //ATTRIBUTI
    private BigDecimal productWidth;
    private BigDecimal productHeight;
    boolean smartOrNot;

    // COSTRUTTORE
    public Televisori(String productName, String productDescription, BigDecimal productPrice, BigDecimal productIva, BigDecimal productWidth, BigDecimal productHeight, boolean smartOrNot) {
        super(productName, productDescription, productPrice, productIva);
        this.productWidth = productWidth;
        this.productHeight = productHeight;
        this.smartOrNot = smartOrNot;
    }

    // GETTER AND SETTER
    public BigDecimal getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(BigDecimal productWidth) {
        this.productWidth = productWidth;
    }

    public BigDecimal getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(BigDecimal productHeight) {
        this.productHeight = productHeight;
    }

    public boolean isSmartOrNot() {
        return smartOrNot;
    }

    public void setSmartOrNot(boolean smartOrNot) {
        this.smartOrNot = smartOrNot;
    }

    // METODI

    public String toString() {
        return super.toString() + ", Larghezza: " + getProductWidth() + ", Altezza: " + getProductHeight() + ", Smart: " + isSmartOrNot() + " ,";
    }
}



