package com.syspharma.projet.model;

/**
 * Représente un administrateur ayant un rôle global sur la plateforme.
 */
public class Administrateur extends Utilisateur {

    public Administrateur(String nom, String prenom, String email, String adresse, String telephone, String password) {
        super(nom, prenom, email, adresse, telephone, password);
    }

    // Tu pourras ajouter des méthodes spécifiques à la gestion plus tard
}
