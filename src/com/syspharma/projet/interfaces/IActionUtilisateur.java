package com.syspharma.projet.interfaces;

import com.syspharma.projet.commande.Paiement;
import com.syspharma.projet.model.Assurance;
import com.syspharma.projet.model.Medicament;
import com.syspharma.projet.model.Pharmacie;

public interface IActionUtilisateur {
    boolean rechercherMedicament(Medicament medicament, Pharmacie pharmacie);
    boolean rechercherMedicament(Medicament medicament);
    boolean rechercherAssurances(Assurance assurance, Pharmacie pharmacie);
    boolean rechercherAssurance(Assurance assurance);
    boolean gererPanier(Paiement.Panier panier); // ou plus spécifique : ajouterAuPanier(), etc.
}

