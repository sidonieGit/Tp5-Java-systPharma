package com.syspharma.projet.model;


// Administrateur hérite de User (et donc de Visiteur)
public class Administrateur extends Utilisateur {
    public Administrateur(String nom, String prenom, String email, String telephone, String password) {
        super(nom, prenom, email, telephone, password);
    }

    @Override
    public void seConnecter(String email, String password) {
        super.seConnecter(email, password);
    }

    @Override
    public void seDeconnecter() {
        super.seDeconnecter();
    }

    @Override
    public void modifierMotDePasse(String ancienMotDePasse, String nouveauMotDePasse) {
        super.modifierMotDePasse(ancienMotDePasse, nouveauMotDePasse);
    }
 public String getNom(){ return this.nom;}




    @Override
    public String toString() {
        return "Administrateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
