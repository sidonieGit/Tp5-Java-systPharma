package com.syspharma.projet.commande;


import com.syspharma.projet.model.Medicament;

public class ArticlePanier {
        private Medicament medicament;
        private int quantite;
        private double prixUnitaire;

        public ArticlePanier(Medicament medicament, int quantite, double prixUnitaire) {
            this.medicament = medicament;
            this.quantite = quantite;
            this.prixUnitaire = prixUnitaire;
        }

        public Medicament getMedicament() {
            return medicament;
        }

        public int getQuantite() {
            return quantite;
        }

        public double getPrixUnitaire() {
            return prixUnitaire;
        }

        public double getPrixTotal() {
            return quantite * prixUnitaire;
        }
    }
