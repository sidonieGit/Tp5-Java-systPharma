package com.syspharma.projet.model;

import com.syspharma.projet.commande.Paiement;
import com.syspharma.projet.interfaces.IActionUtilisateur;
import com.syspharma.projet.interfaces.IConnexion;

// Classe abstraite User qui hérite de Visiteur et implémente IConnexion
public abstract class Utilisateur implements IConnexion, IActionUtilisateur {
    protected String nom;
    protected String prenom;
    protected String email;
    protected String adresse;
    protected String telephone;
    protected String password;

    public Utilisateur(String nom, String prenom, String email, String adresse, String telephone, String password) {

        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
        this.password = password;
    }

    @Override
    public boolean seConnecter(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println(nom + " connecté avec succès !");
            return true;
        } else {
            System.out.println("Échec de connexion.");
            return false;
        }

    }

    public String getNom(){return this.nom;}

    @Override
    public boolean seDeconnecter() {
        System.out.println(nom + " s'est déconnecté.");
        return true;
    }

    @Override
    public boolean miseAJourCompte(Utilisateur utilisateur) {
return true;
    }

    @Override
    public boolean rechercherMedicament(Medicament medicament, Pharmacie pharmacie) {
        return false;
    }

    @Override
    public boolean rechercherMedicament(Medicament medicament) {
        return false;
    }

    @Override
    public boolean rechercherAssurances(Assurance assurance, Pharmacie pharmacie) {
        return false;
    }

    @Override
    public boolean rechercherAssurance(Assurance assurance) {
        return false;
    }

    @Override
    public boolean gererPanier(Paiement.Panier panier) {
        return false;
    }


/*  @Override
    public void modifierMotDePasse(String ancienMotDePasse, String nouveauMotDePasse) {
        if (this.password.equals(ancienMotDePasse)) {
            this.password = nouveauMotDePasse;
            System.out.println("Mot de passe modifié avec succès.");
        } else {
            System.out.println("Ancien mot de passe incorrect !");
        }
    }*/



}
