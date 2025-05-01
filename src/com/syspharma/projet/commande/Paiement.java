package com.syspharma.projet.commande;

import java.util.ArrayList;
import java.util.List;

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

    public static class Panier {
        private List<ArticlePanier> articles;
        private boolean etat; // ✅ Exemple : actif ou non

        public Panier() {
            this.articles = new ArrayList<>();
            this.etat = true;
        }

        public void ajouterArticle(ArticlePanier article) {
            articles.add(article);
        }

        public void supprimerArticle(ArticlePanier article) {
            articles.remove(article);
        }

        public void viderPanier() {
            articles.clear();
        }

        public List<ArticlePanier> getArticles() {
            return articles;
        }

        public boolean isActif() {
            return etat;
        }

        public void setEtat(boolean etat) {
            this.etat = etat;
        }
    }
}
