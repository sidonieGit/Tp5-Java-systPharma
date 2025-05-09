package com.syspharma.projet.interfaces;

import com.syspharma.projet.model.Compte;

/**
 * Interface pour gérer les connexions utilisateurs disposant d'un compte
 */
public interface IConnexion {

    /**
     * Authentifie un utilisateur
     *
     * @param email identifiant de connexion
     * @param password mot de passe
     * @return true si authentification réussie
     */
    boolean seConnecter(String email, String password);

    /**
     * Déconnecte l'utilisateur
     *
     * @return true si déconnexion réussie
     */
    boolean seDeconnecter();

    /**
     * Met à jour les informations du compte utilisateur
     *
     * @param compte compte mis à jour
     * @return true si mise à jour réussie
     */
    boolean miseAJourCompte(Compte compte);
}
