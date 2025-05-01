package com.syspharma.projet.model;


import com.syspharma.projet.commande.Paiement;

// Agent de pharmacie hérite de User (et donc de Visiteur)
public class AgentPharmacie extends Utilisateur {
    private String matriculeEmploye;


    public AgentPharmacie(String nom, String prenom, String email,String adresse, String telephone, String password, String matriculeEmploye) {
        super(nom, prenom, email, adresse, telephone, password);
        this.matriculeEmploye = matriculeEmploye;
    }

    public String getMatriculeEmploye() {
        return matriculeEmploye;
    }

    public void setMatriculeEmploye(String matriculeEmploye) {
        this.matriculeEmploye = matriculeEmploye;
    }



    public AgentPharmacie(String nom, String prenom, String email, String adresse, String telephone, String password) {
        super(nom, prenom, email, adresse, telephone, password);
    }

    @Override
    public boolean seConnecter(String email, String password) {
        super.seConnecter(email, password);
        return true;
    }

    @Override
    public boolean seDeconnecter() {
        super.seDeconnecter();
        return true;
    }

   /* @Override
    public void modifierMotDePasse(String ancienMotDePasse, String nouveauMotDePasse) {
        super.modifierMotDePasse(ancienMotDePasse, nouveauMotDePasse);
    }*/

    @Override
    public boolean miseAJourCompte(Utilisateur utilisateur) {
        System.out.println("vous pouvez choisir quel propriété metre à jour");
        return true;
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
        return "AgentPharmacie{" +
                "matriculeEmploye='" + matriculeEmploye + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
