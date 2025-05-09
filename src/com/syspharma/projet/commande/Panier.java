package com.syspharma.projet.commande;

import com.syspharma.projet.enums.EtatPanier;
import com.syspharma.projet.model.Medicament;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<ArticlePanier> articles;
    private EtatPanier etat;

    public Panier() {
        this.articles = new ArrayList<>();
        this.etat = EtatPanier.EN_COURS;
    }

    public void setArticles(List<ArticlePanier> articles) {
        this.articles = articles;
    }

    public void setEtat(EtatPanier etat) {
        this.etat = etat;
    }

    public void ajouterArticle(ArticlePanier article) {
        for (ArticlePanier a : articles) {
            if (a.getMedicament().equals(article.getMedicament())) {
                a.setQuantite(a.getQuantite() + article.getQuantite());
                return;
            }
        }
        articles.add(article);
    }

    public void supprimerArticle(Medicament medicament) {
        articles.removeIf(a -> a.getMedicament().equals(medicament));
    }

    public void vider() {
        articles.clear();
        etat = EtatPanier.VIDE;
    }

    public double calculerMontantTotal() {
        return articles.stream().mapToDouble(ArticlePanier::getPrixTotal).sum();
    }

    public List<ArticlePanier> getArticles() {
        return articles;
    }

    public EtatPanier getEtat() {
        return etat;
    }

    public void valider() {
        this.etat = EtatPanier.VALIDE;
    }
}
