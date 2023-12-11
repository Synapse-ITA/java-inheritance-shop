package org.java.inheritance.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Prodotto> prodotti = new ArrayList<>();

        while (true) {
            System.out.println("Che tipo di prodotto vuoi aggiungere? (1: Smartphone, 2: Televisore, 3: Cuffie, 0: Esci)");
            int sceltaTipoProdotto = scanner.nextInt();
            scanner.nextLine();

            if (sceltaTipoProdotto == 0) {
                // L'utente esce dal programma
                break;
            }

            // L'utente compila i parametri
            System.out.println("Inserisci il nome del prodotto:");
            String name = scanner.nextLine();

            System.out.println("Inserisci la descrizione del prodotto:");
            String description = scanner.nextLine();

            System.out.println("Inserisci il prezzo del prodotto:");
            BigDecimal price = scanner.nextBigDecimal();

            System.out.println("Inserisci l'iva del prodotto:");
            BigDecimal iva = scanner.nextBigDecimal();

            Prodotto nuovoProdotto = null;

            switch (sceltaTipoProdotto) {
                case 1:
                    // Creazione di uno Smartphone
                    System.out.println("Inserisci IMEI dello Smartphone:");
                    int imei = scanner.nextInt();
                    System.out.println("Inserisci la RAM dello Smartphone:");
                    int ram = scanner.nextInt();

                    nuovoProdotto = new Smartphone(name, description, price, iva, imei,ram);
                    break;
                case 2:
                    // Creazione di un Televisore
                    System.out.println("Inserisci la larghezza del Televisore:");
                    BigDecimal tvWidth = scanner.nextBigDecimal();
                    System.out.println("Inserisci la risoluzione del Televisore:");
                    BigDecimal tvHeight = scanner.nextBigDecimal();
                    System.out.println("Il Televisore è Smart? (true/false):");
                    boolean isSmart = scanner.nextBoolean();
                    nuovoProdotto = new Televisori(name, description, price, iva, tvWidth, tvHeight, isSmart);
                    break;
                case 3:
                    // Creazione di Cuffie
                    System.out.println("Inserisci il colore delle Cuffie:");
                    String color = scanner.next();
                    System.out.println("Le cuffie sono wireless?");
                    boolean wireless = scanner.nextBoolean();
                    nuovoProdotto = new Cuffie(name, description, price, iva, color, wireless);
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    continue; // Torna all'inizio del ciclo
            }

            prodotti.add(nuovoProdotto);
            System.out.println("Prodotto aggiunto al carrello!");
        }

        System.out.println("Contenuto del Carrello:");
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto.getFullName() + " - Prezzo: " + prodotto.getIvaPrice());
        }

        System.out.println(prodotti);

















        }
    }



