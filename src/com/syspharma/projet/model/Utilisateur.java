package com.syspharma.projet.model;

// Classe abstraite User qui hérite de Visiteur et implémente IConnexion
public abstract class Utilisateur implements IConnexion, IActionUtilisateur {
    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
    protected String password;

    public Utilisateur(String nom, String prenom, String email, String telephone, String password) {
        super(); // Appelle le constructeur de Visiteur (enregistre la date de visite)
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    @Override
    public void seConnecter(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println(nom + " connecté avec succès !");
        } else {
            System.out.println("Échec de connexion.");
        }
    }

    public String getNom(){return this.nom;}

    @Override
    public void seDeconnecter() {
        System.out.println(nom + " s'est déconnecté.");
    }

    @Override
    public void modifierMotDePasse(String ancienMotDePasse, String nouveauMotDePasse) {
        if (this.password.equals(ancienMotDePasse)) {
            this.password = nouveauMotDePasse;
            System.out.println("Mot de passe modifié avec succès.");
        } else {
            System.out.println("Ancien mot de passe incorrect !");
        }
    }
    @Override
    public void rechercherProduit(String produit, Pharmacie pharmacie) {
        System.out.println("Recherche du produit : " + produit+ "dans la pharmacie: " + pharmacie);
    }

    @Override
    public void consulterMedicament(String nomMedicament) {

    }

    @Override
    public void consulterAssurances() {

    }

    @Override
    public void gererPanier() {
        System.out.println("Gestion du panier par le visiteur.");
    }

}
