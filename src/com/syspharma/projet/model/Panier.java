package com.syspharma.projet.model;

import java.util.ArrayList;
import java.util.List;

public class Panier {
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
