package com.syspharma.projet.service;

import com.syspharma.projet.model.*;
import com.syspharma.projet.commande.Commande;
import com.syspharma.projet.enums.StatutCommande;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ServiceAgentPharmacie {

    public void ajouterMedicament(Pharmacie pharmacie, Medicament medicament) {
        pharmacie.getStock().add(medicament);
    }

    public void supprimerMedicament(Pharmacie pharmacie, Medicament medicament) {
        pharmacie.getStock().remove(medicament);
    }

    public void modifierMedicament(Medicament medicament, String nouvelleDescription) {
        medicament.setDescription(nouvelleDescription);
    }

    public List<Medicament> listerMedicaments(Pharmacie pharmacie) {
        return pharmacie.getStock();
    }

    public void ajouterAssurance(Pharmacie pharmacie, Assurance assurance) {
        pharmacie.getAssurances().add(assurance);
    }

    public void supprimerAssurance(Pharmacie pharmacie, Assurance assurance) {
        pharmacie.getAssurances().remove(assurance);
    }

    public void confirmerLivraison(Commande commande) {
        commande.setStatut(StatutCommande.LIVREE);
    }

    public void annulerCommande(Commande commande) {
        commande.setStatut(StatutCommande.ANNULEE);
    }
    /**
     * Lister les clients ayant passé une commande dans une pharmacie,
     * avec ou sans filtre de statut.
     *
     * @param commandes liste des commandes globales
     * @param pharmacie la pharmacie concernée
     * @param statut (optionnel) statut à filtrer, sinon null
     * @return liste unique des clients
     */
    public Set<Client> listerClientsAyantCommandeDansPharmacie(List<Commande> commandes, Pharmacie pharmacie, StatutCommande statut) {
        return commandes.stream()
                .filter(c -> c.getPharmacie().equals(pharmacie))
                .filter(c -> statut == null || c.getStatut().equals(statut))
                .map(Commande::getClient)
                .collect(Collectors.toSet());
    }

    /**
     * Vérifie dans quelle pharmacie une commande a été enregistrée.
     *
     * @param client le client concerné
     * @param numeroCommande le numéro de commande
     * @return la pharmacie où la commande a été passée, ou null si non trouvée
     */
    public Pharmacie verifierPharmacieCommande(Client client, String numeroCommande) {
        return client.getCommandes().stream()
                .filter(c -> c.getNumeroCommande().equals(numeroCommande))
                .map(Commande::getPharmacie)
                .findFirst()
                .orElse(null);
    }
}

