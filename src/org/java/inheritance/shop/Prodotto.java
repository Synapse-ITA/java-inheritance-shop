package org.java.inheritance.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private Random random = new Random();

    // ATTRIBUTI
    private int productCode;
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;
    private BigDecimal productIva;

    // COSTRUTTORE SENZA ARGOMENTI

    public Prodotto() {
        // Inizializza eventuali variabili di istanza con valori di default
        this.productCode = 0;
        this.productName = "";
        this.productDescription = "";
        this.productPrice = BigDecimal.ZERO;
        this.productIva = BigDecimal.ZERO;
    }

    // COSTRUTTORE CON ARGOMENTI
    public Prodotto(String productName, String productDescription, BigDecimal productPrice, BigDecimal productIva) {
        this.productCode = generateRandomCode();
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productIva = productIva;
    }

    // GETTER E SETTER
    public int getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName != null && !productName.trim().isEmpty()) {
            this.productName = productName;
        } else {
            throw new IllegalArgumentException("Errore: Nome non valido!");
        }
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        if (productPrice.compareTo(BigDecimal.ZERO) > 0) {
            this.productPrice = productPrice;
        } else {
            throw new IllegalArgumentException("Valore non valido");
        }
    };


    public BigDecimal getProductIva() {
        return productIva;
    }

    public void setProductIva(BigDecimal productIva) {
        if (productIva.compareTo(BigDecimal.ZERO) > 0) {
            this.productIva = productIva;
        } else {
            throw new IllegalArgumentException("ATTENZIONE! Valore non valido");
        }
    };

    // METODI

    // METODO CHE MOSTRA PREZZO INCLUSO IVA
    public String getIvaPrice() {
        BigDecimal ivaMultiplier = BigDecimal.ONE.add(productIva.divide(BigDecimal.valueOf(100)));
        BigDecimal productIvaPrice = productPrice.multiply(ivaMultiplier).setScale(2, RoundingMode.HALF_UP);

        return String.format("Il prezzo incluso IVA (%.2f%%) è: %.2f €", productIva, productIvaPrice);
    }

    // METODO PER PREZZO BASE
    public String getBasePrice(){
        BigDecimal showBasePrice = productPrice;
        String decimalBasePrice = String.format("%.2f", showBasePrice);
        return "Il prezzo escluso IVA è: " + decimalBasePrice + "€";
    }

    // METODO CHE RESTITUISCE PRODUCTNAME + PRODUCTCODE
    public String getFullName(){
        return "Nome completo prodotto: " + productCode + "-" + productName;
    }

    // METODO UTILITA' CREAZIONE CODICE PER IL PRODOTTO
    private int generateRandomCode() {
        // Num random tra 1000 e 9999
        return 1000 + random.nextInt(9000);
    }

    @Override
    public String toString() {
        return "Nome: " + getProductName() + ", Descrizione: " + getProductDescription() + ", Prezzo: " + getProductPrice();
    }
}
