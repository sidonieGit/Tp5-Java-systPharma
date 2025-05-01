package com.syspharma.projet.model;

import com.syspharma.projet.commande.Paiement;

// Client hérite de User, donc aussi de Visiteur
public class Client extends Utilisateur {
    private int numeroCommande;

    public Client(String nom, String prenom, String email, String adresse, String telephone, String password, int numeroCommande) {
        super(nom, prenom, email, adresse, telephone, password);
        this.numeroCommande = numeroCommande;
    }


    @Override
    public boolean seConnecter(String email, String password) {
        return super.seConnecter(email, password);
    }

    @Override
    public boolean seDeconnecter() {
        return super.seDeconnecter();
    }

    @Override
    public boolean miseAJourCompte(Utilisateur utilisateur) {
        return super.miseAJourCompte(utilisateur);
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }
public String getNom(){
        return this.nom;
}

    @Override
    public boolean rechercherMedicament(Medicament medicament, Pharmacie pharmacie) {
        return false;
    }

    @Override
    public boolean rechercherMedicament(Medicament medicament) {
        return false;
    }

    @Override
    public boolean rechercherAssurances(Assurance assurance, Pharmacie pharmacie) {
        return false;
    }

    @Override
    public boolean rechercherAssurance(Assurance assurance) {
        return false;
    }

    @Override
    public boolean gererPanier(Paiement.Panier panier) {
        return false;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numeroCommande=" + numeroCommande +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

   public int passerCommande(Paiement.Panier panier)
   {
return 1 ;
   }
}
