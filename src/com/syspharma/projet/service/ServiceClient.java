package com.syspharma.projet.service;

import com.syspharma.projet.commande.ArticlePanier;
import com.syspharma.projet.commande.Commande;
import com.syspharma.projet.commande.Paiement;
import com.syspharma.projet.commande.Panier;
import com.syspharma.projet.enums.StatutCommande;
import com.syspharma.projet.model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServiceClient {

    private List<Client> baseClients = new ArrayList<>();

    /**
     * Crée un compte client si l'email n'existe pas déjà.
     *
     * @return true si création réussie, false sinon (email déjà pris)
     */
    public boolean creerCompte(Client nouveauClient) {
        for (Client c : baseClients) {
            if (c.getEmail().equalsIgnoreCase(nouveauClient.getEmail())) {
                return false; // email déjà utilisé
            }
        }
        baseClients.add(nouveauClient);
        return true;
    }

    /**
     * rechercher un médicament par nom (dans toute la plateforme)
      */

    public Medicament rechercherMedicamentParNom(String nomMedicament, List<Pharmacie> pharmacies) {
        for (Pharmacie p : pharmacies) {
            for (Medicament m : p.getStock()) {
                if (m.getDesignation().equalsIgnoreCase(nomMedicament)) {
                    return m;
                }
            }
        }
        return null;
    }

    /**
     *
     * @param nom
     * @param pharmacie
     * @return Rechercher un médicament par nom dans une pharmacie spécifique
     */
    public Medicament rechercherMedicamentParNom(String nom, Pharmacie pharmacie) {
        return pharmacie.getStock().stream()
                .filter(m -> m.getDesignation().equalsIgnoreCase(nom))
                .findFirst()
                .orElse(null);
    }

    // Rechercher assurance par nom dans une pharmacie
    public Assurance rechercherAssurance(String nomAssurance, Pharmacie pharmacie) {
        return pharmacie.getAssurances().stream()
                .filter(a -> a.getDesignation().equalsIgnoreCase(nomAssurance))
                .findFirst()
                .orElse(null);
    }

    // Rechercher toutes les pharmacies ayant un médicament donné
    public List<Pharmacie> rechercherPharmaciesParNomMedicament(String nomMedicament, List<Pharmacie> pharmacies) {
        return pharmacies.stream()
                .filter(p -> p.getStock().stream()
                        .anyMatch(m -> m.getDesignation().equalsIgnoreCase(nomMedicament)))
                .toList();
    }

    // Rechercher médicaments d’une pharmacie selon une catégorie
    public List<Medicament> rechercherParCategorie(Pharmacie pharmacie, String nomCategorie) {
        return pharmacie.getStock().stream()
                .filter(m -> m.getCategorie().getDesignation().equalsIgnoreCase(nomCategorie))
                .toList();
    }

    public void ajouterArticleAuPanier(Client client, Medicament medicament, int quantite) {
        client.getPanier().ajouterArticle(new ArticlePanier(medicament, quantite));
    }

    public void supprimerArticleDuPanier(Client client, Medicament medicament) {
        client.getPanier().supprimerArticle(medicament);
    }

    public void viderPanier(Client client) {
        client.getPanier().vider();
    }

    public double consulterMontantTotalPanier(Client client) {
        return client.getPanier().calculerMontantTotal();
    }


    public Commande passerCommande(Client client, Pharmacie pharmacie) {
        Panier panier = client.getPanier();
        panier.valider();
        Commande commande = new Commande(client, panier, pharmacie);
        client.ajouterCommande(commande);
        return commande;
    }

    public Paiement effectuerPaiement(Commande commande, String modePaiement) {
        Paiement paiement = new Paiement(commande.getPanier().calculerMontantTotal(), modePaiement, commande);
        commande.setPaiement(paiement);
        commande.setStatut(modePaiement.equalsIgnoreCase("ESPECE") ? StatutCommande.EN_ATTENTE_PAIEMENT : StatutCommande.PAYE_EN_LIGNE);
        return paiement;
    }

    public Commande consulterCommandeParDate(Client client, LocalDate date) {
        return client.getCommandes().stream()
                .filter(c -> c.getDateCommande().equals(date))
                .findFirst().orElse(null);
    }

    public List<Medicament> listerMedicamentsCommandes(Client client, String numeroCommande) {
        return client.getCommandes().stream()
                .filter(c -> c.getNumeroCommande() == numeroCommande)
                .flatMap(c -> c.getPanier().getArticles().stream())
                .map(ArticlePanier::getMedicament)
                .toList();
    }


}
