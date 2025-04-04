package com.syspharma.projet;

// Client hérite de User, donc aussi de Visiteur
public class Client extends Utilisateur {
    private int numeroCommande;

    public Client(String nom, String prenom, String email, String telephone, String password, int numeroCommande) {
        super(nom, prenom, email, telephone, password);
        this.numeroCommande = numeroCommande;
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }


    @Override
    public String toString() {
        return "Client{" +
                "numeroCommande=" + numeroCommande +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
