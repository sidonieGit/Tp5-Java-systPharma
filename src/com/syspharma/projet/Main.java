//nom du package
package com.syspharma.projet;
import com.syspharma.projet.model.Medicament;
import com.syspharma.projet.model.Categorie;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<String, Medicament> medicamentMap = new HashMap<>();
        Categorie antalgique = new Categorie("Antalgique");
        medicamentMap.put("Paracétamol", new Medicament("Paracétamol", 5.99, "Antidouleur", "paracetamol.jpg", antalgique));
        medicamentMap.put("Ibuprofène", new Medicament("Ibuprofène", 7.49, "Anti-inflammatoire", "ibuprofene.jpg", antalgique));
        medicamentMap.put("Aspirine", new Medicament("Aspirine", 4.99, "Analgésique", "aspirine.jpg", antalgique));

        System.out.println("Prix de l'Ibuprofène : " + medicamentMap.get("Ibuprofène").getPrix() + "€");

        // Affichage des médicaments
        for (Map.Entry<String, Medicament> entry : medicamentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}