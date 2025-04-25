package com.syspharma.projet;
import com.syspharma.projet.model.Medicament;



public class MainMedoc {
    public static void main(String[] args) {
Medicament medicament1 = new Medicament("Flagyl", 25, "Flagyl c'est un anti-iotique", "anti-iotique", "son image");
System.out.println(medicament1);
medicament1.setNom("Aspirin");
medicament1.setPrix(100);
System.out.println(medicament1);
    }
}
