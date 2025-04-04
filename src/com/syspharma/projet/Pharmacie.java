package com.syspharma.projet;

public class Pharmacie {
    private String nom;
    private String adresse;
    private String telephone;
    private String heureOuverture;
    private String heureFermeture;

    public Pharmacie(String nom, String adresse, String telephone, String heureOuverture, String heureFermeture) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.heureOuverture = heureOuverture;
        this.heureFermeture = heureFermeture;
    }

    // GETTERS
    public String getNom() { return nom; }
    public String getAdresse() { return adresse; }
    public String getTelephone() { return telephone; }
    public String getHeureOuverture() { return heureOuverture; }
    public String getHeureFermeture() { return heureFermeture; }

    //setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setHeureOuverture(String heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    public void setHeureFermeture(String heureFermeture) {
        this.heureFermeture = heureFermeture;
    }

    @Override
    public String toString() {
        return "Pharmacie{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", heureOuverture='" + heureOuverture + '\'' +
                ", heureFermeture='" + heureFermeture + '\'' +
                '}';
    }

    //  MÉTHODES POUR GÉRER LES RELATIONS AVEC MÉDICAMENTS ET ASSURANCES
    public void afficherInformations() {
        System.out.println("Pharmacie : " + nom + " | Adresse : " + adresse + " | Tel : " + telephone);
    }
}
