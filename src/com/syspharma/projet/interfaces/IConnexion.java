package com.syspharma.projet.interfaces;

import com.syspharma.projet.model.Utilisateur;

//// Interface pour la gestion de la connexion des utilisateurs ayant un compte
// Interface pour gérer la connexion des utilisateurs
public interface IConnexion {
    boolean seConnecter(String email, String password);
    boolean seDeconnecter();
    boolean miseAJourCompte(Utilisateur utilisateur);
}