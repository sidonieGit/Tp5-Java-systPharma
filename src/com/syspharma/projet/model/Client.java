package com.syspharma.projet.model;

import com.syspharma.projet.commande.Commande;
import com.syspharma.projet.commande.Panier;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un client pouvant passer commande et gérer un panier.
 */
public class Client extends Utilisateur {
    private String numeroCommande;
    private Panier panier;
    private List<Commande> commandes;

    public Client(String nom, String prenom, String email, String adresse, String telephone, String password, String numeroCommande) {
        super(nom, prenom, email, adresse, telephone, password);
        this.numeroCommande = numeroCommande;
        this.panier = new Panier();
        this.commandes = new ArrayList<>();
    }

    public String getNumeroCommande() { return numeroCommande; }
    public void setNumeroCommande(String numeroCommande) { this.numeroCommande = numeroCommande; }

    public Panier getPanier() { return panier; }
    public void setPanier(Panier panier) { this.panier = panier; }

    public List<Commande> getCommandes() { return commandes; }

    public void ajouterCommande(Commande commande) {
        this.commandes.add(commande);
    }
}
