package com.syspharma.projet.model;

import com.syspharma.projet.enums.StatutCompte;

import java.time.LocalDate;

public class Compte {
    private String identifiant; // = email
    private String motDePasse;
    private StatutCompte statut;
    private LocalDate dateCreation;
    private LocalDate dateDerniereConnexion;

    public Compte(String identifiant, String motDePasse) {
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
        this.dateCreation = LocalDate.now();
        this.dateDerniereConnexion = dateCreation;
        this.statut = StatutCompte.ACTIF;
    }

    // getters / setters

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public StatutCompte getStatut() {
        return statut;
    }

    public void setStatut(StatutCompte statut) {
        this.statut = statut;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDate getDateDerniereConnexion() {
        return dateDerniereConnexion;
    }

    public void setDateDerniereConnexion(LocalDate dateDerniereConnexion) {
        this.dateDerniereConnexion = dateDerniereConnexion;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "identifiant='" + identifiant + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", statut=" + statut +
                ", dateCreation=" + dateCreation +
                ", dateDerniereConnexion=" + dateDerniereConnexion +
                '}';
    }
}
