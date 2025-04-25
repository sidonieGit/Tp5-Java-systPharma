package com.syspharma.projet.model;

public class    Medicament {
    private String nom;
    private double prix;
    private String description;
    private String categorie;
    private String image;

    public Medicament(String nom, double prix, String description, String categorie, String image) {
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.categorie = categorie;
        this.image = image;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", categorie='" + categorie + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
/*
*Ce code ajoutera un doublon !
* Pourquoi ? Parce que HashSet utilise equals() et hashCode() pour vérifier les doublons. Ajoutons-les dans Medicament :
 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Medicament that = (Medicament) obj;
        return nom.equals(that.nom);
    }
    /*
     *Ce code ajoutera un doublon !
     * Pourquoi ? Parce que HashSet utilise equals() et hashCode() pour vérifier les doublons. Ajoutons-les dans Medicament :
     */
    @Override
    public int hashCode() {
        return nom.hashCode();
    }

}
