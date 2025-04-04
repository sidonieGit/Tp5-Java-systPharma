package com.syspharma.projet;

import java.util.List;

public class Commande {
    private int numeroCommande;
    private String dateCommande;
    private String statutCommande;
    private double montantTotal;
    private Panier panier; //  Association avec Panier

    //  Suppression de List<ArticlePanier> articles (association déjà existante)

    public Commande(int numeroCommande, String dateCommande, String statutCommande, double montantTotal) {
        this.numeroCommande = numeroCommande;
        this.dateCommande = dateCommande;
        this.statutCommande = statutCommande;
        this.montantTotal = montantTotal;
        this.panier = panier; // On associe un panier à la commande
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public String getStatutCommande() {
        return statutCommande;
    }

    public double getMontantTotal() {
        return montantTotal;
    }
    public Panier getPanier() {
        //  Retourne le panier associé
        return panier;
    }

    public void setStatutCommande(String statutCommande) {
        this.statutCommande = statutCommande;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }
}
