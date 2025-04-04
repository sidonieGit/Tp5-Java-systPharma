package com.syspharma.projet;

import java.time.LocalDateTime;

// Visiteur sans compte, peut consulter des produits
public class Visiteur implements IVisiteur {
    private LocalDateTime dateVisite;

    public Visiteur() {
        this.dateVisite = LocalDateTime.now();
    }

    public LocalDateTime getDateVisite() {
        return dateVisite;
    }

    public void rechercherProduit(String produit) {
        System.out.println("Recherche du produit : " + produit);
    }

    @Override
    public void rechercherProduit(String produit, Pharmacie pharmacie) {
        System.out.println("Recherche du produit : " + produit+ "dans la pharmacie: " + pharmacie);
    }


    public void gererPanier() {
        System.out.println("Gestion du panier par le visiteur.");
    }

    public void setDateVisite(LocalDateTime dateVisite) {
        this.dateVisite = dateVisite;
    }

    @Override
    public String toString() {
        return "Visiteur{" +
                "dateVisite=" + dateVisite +
                '}';
    }
}
