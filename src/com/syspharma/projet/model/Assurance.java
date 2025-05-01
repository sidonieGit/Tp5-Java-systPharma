package com.syspharma.projet.model;

public class Assurance {
    private String numeroAssurance;
    private String designation;
    private String information;

    public Assurance(String numeroAssurance, String designation, String information) {
        this.numeroAssurance = numeroAssurance;
        this.designation = designation;
        this.information = information;
    }

    public String getNumeroAssurance() { return numeroAssurance; }
    public String getdesignation() { return designation; }
    public String getInformation() { return information; }

    public void setNumeroAssurance(String numeroAssurance) {
        this.numeroAssurance = numeroAssurance;
    }

    public void setdesignation(String designation) {
        this.designation = designation;
    }

    public void setInformation(String information) {
        this.information = information;
    }


    @Override
    public String toString() {
        return "Assurance{" +
                "numeroAssurance='" + numeroAssurance + '\'' +
                ", designation='" + designation + '\'' +
                ", information='" + information + '\'' +
                '}';
    }
}
