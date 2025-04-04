package com.syspharma.projet;

import com.syspharma.projet.Utilisateur;

// Agent de pharmacie hérite de User (et donc de Visiteur)
public class AgentPharmacie extends Utilisateur {
    private String matriculeEmploye;
    private String adresse;

    public AgentPharmacie(String nom, String prenom, String email, String telephone, String password, String matriculeEmploye, String adresse) {
        super(nom, prenom, email, telephone, password);
        this.matriculeEmploye = matriculeEmploye;
        this.adresse = adresse;
    }

    public String getMatriculeEmploye() {
        return matriculeEmploye;
    }

    public void setMatriculeEmploye(String matriculeEmploye) {
        this.matriculeEmploye = matriculeEmploye;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public AgentPharmacie(String nom, String prenom, String email, String telephone, String password) {
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

    @Override
    public void rechercherProduit(String produit) {
        super.rechercherProduit(produit);
    }

    @Override
    public String toString() {
        return "AgentPharmacie{" +
                "matriculeEmploye='" + matriculeEmploye + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
