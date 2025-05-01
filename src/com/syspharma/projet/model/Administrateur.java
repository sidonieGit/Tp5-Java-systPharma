package com.syspharma.projet.model;


import com.syspharma.projet.commande.Paiement;

// Administrateur hérite de User (et donc de Visiteur)
public class Administrateur extends Utilisateur {
    public Administrateur(String nom, String prenom, String email,String adresse, String telephone, String password) {
        super(nom, prenom, email,adresse, telephone, password);
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

    /* @Override
        public void modifierMotDePasse(String ancienMotDePasse, String nouveauMotDePasse) {
            super.modifierMotDePasse(ancienMotDePasse, nouveauMotDePasse);
        }*/
 public String getNom(){ return this.nom;}



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
        return "Administrateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
