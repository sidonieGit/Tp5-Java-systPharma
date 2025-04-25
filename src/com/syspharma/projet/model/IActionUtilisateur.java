package com.syspharma.projet.model;

public interface IActionUtilisateur {
    void rechercherProduit(String produit, Pharmacie pharmacie);
    void consulterMedicament(String nomMedicament);
    void consulterAssurances();
    void gererPanier(); // ou plus spécifique : ajouterAuPanier(), etc.
}

