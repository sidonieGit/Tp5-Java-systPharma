package com.syspharma.projet.commande;

import com.syspharma.projet.enums.ModePaiement;

import java.time.LocalDate;

public class Paiement {
    private double montant;
    private ModePaiement modePaiement;
    private LocalDate datePaiement;
    private Commande commande;

    public Paiement(double montant, String modePaiementStr, Commande commande) {
        this.montant = montant;
        this.modePaiement = ModePaiement.valueOf(modePaiementStr.toUpperCase());
        this.datePaiement = LocalDate.now();
        this.commande = commande;
    }

    public double getMontant() {
        return montant;
    }

    public ModePaiement getModePaiement() {
        return modePaiement;
    }

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public Commande getCommande() {
        return commande;
    }
}
