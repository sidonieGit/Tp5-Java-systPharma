package com.syspharma.projet.model;

// Paiement associé à une commande
public class Paiement {
    private double montant;
    private String modePaiement;
    private String datePaiement;

    public Paiement(double montant, String modePaiement, String datePaiement) {
        this.montant = montant;
        this.modePaiement = modePaiement;
        this.datePaiement = datePaiement;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public String getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(String datePaiement) {
        this.datePaiement = datePaiement;
    }

    @Override
    public String toString() {
        return "Paiement{" +
                "montant=" + montant +
                ", modePaiement='" + modePaiement + '\'' +
                ", datePaiement='" + datePaiement + '\'' +
                '}';
    }
}
