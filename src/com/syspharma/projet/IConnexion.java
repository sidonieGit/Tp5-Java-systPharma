package com.syspharma.projet;

//// Interface pour la gestion de la connexion des utilisateurs ayant un compte
// Interface pour gérer la connexion des utilisateurs
public interface IConnexion {
    void seConnecter(String email, String password);
    void seDeconnecter();
    void modifierMotDePasse(String ancienMotDePasse, String nouveauMotDePasse);
}