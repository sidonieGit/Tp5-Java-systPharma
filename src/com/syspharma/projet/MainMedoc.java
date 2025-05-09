package com.syspharma.projet;
import com.syspharma.projet.model.Medicament;
import  com.syspharma.projet.model.Categorie;



public class MainMedoc {
    public static void main(String[] args) {
        Categorie antalgique = new Categorie("Antalgique");
Medicament medicament1 = new Medicament("Flagyl", 25, "Flagyl c'est un anti-iotique", "son image", antalgique);
System.out.println(medicament1);
medicament1.setDescription("Aspirin");
medicament1.setPrix(100);
System.out.println(medicament1);
    }
}
