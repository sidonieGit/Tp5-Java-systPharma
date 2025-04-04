package com.syspharma.projet;

public class Assurance {
    private String numeroAssurance;
    private String nom;
    private String information;

    public Assurance(String numeroAssurance, String nom, String information) {
        this.numeroAssurance = numeroAssurance;
        this.nom = nom;
        this.information = information;
    }

    public String getNumeroAssurance() { return numeroAssurance; }
    public String getNom() { return nom; }
    public String getInformation() { return information; }

    public void setNumeroAssurance(String numeroAssurance) {
        this.numeroAssurance = numeroAssurance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setInformation(String information) {
        this.information = information;
    }


    @Override
    public String toString() {
        return "Assurance{" +
                "numeroAssurance='" + numeroAssurance + '\'' +
                ", nom='" + nom + '\'' +
                ", information='" + information + '\'' +
                '}';
    }
}
