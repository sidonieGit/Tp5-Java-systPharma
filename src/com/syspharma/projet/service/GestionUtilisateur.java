package com.syspharma.projet.service;

import com.syspharma.projet.model.Utilisateur;
import com.syspharma.projet.model.Client;
import com.syspharma.projet.model.AgentPharmacie;
import com.syspharma.projet.model.Administrateur;

import java.util.ArrayList;
import java.util.List;

public class GestionUtilisateur {

    private ArrayList<Utilisateur> utilisateurs;

    public GestionUtilisateur() {
        this.utilisateurs = new ArrayList<>();
    }

    // Visiteur → création de compte client
    public Client creerCompteClient(String nom, String prenom, String email, String tel, String mdp) {
        Client client = new Client(nom, prenom, email, tel, mdp, 0);
        utilisateurs.add(client);
        System.out.println("✅ Compte client créé : " + client.getNom());
        return client;
    }

    // Admin → création de compte agent
    public AgentPharmacie creerCompteAgent(Administrateur admin, String nom, String prenom, String email, String tel, String mdp, String matricule, String adresse) {
        AgentPharmacie agent = new AgentPharmacie(nom, prenom, email, tel, mdp, matricule, adresse);
        utilisateurs.add(agent);
        System.out.println("✅ Compte agent: "+agent.getNom()+" créé par l\'admin : " + admin.getNom());
        return agent;
    }

    // Suppression de compte (admin uniquement)
    public void supprimerUtilisateur(Administrateur admin, Utilisateur utilisateur) {
        utilisateurs.remove(utilisateur);
        System.out.println("🗑️ Compte supprimé : " + utilisateur.getNom());
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }
}
