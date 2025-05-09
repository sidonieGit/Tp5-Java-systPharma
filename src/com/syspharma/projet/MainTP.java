package com.syspharma.projet;

import com.syspharma.projet.model.*;
import com.syspharma.projet.service.ServiceAdministrateur;
import com.syspharma.projet.service.ServiceClient;

import java.util.ArrayList;


public class MainTP{
    public static void main(String[] args) {
        ServiceAdministrateur gestion = new ServiceAdministrateur();
        ServiceClient gestionClient = new ServiceClient();

        // Un visiteur crée un compte pour devenir client
        ServiceClient serviceClient = new ServiceClient();

        Client client = new Client(
                "Jean", "Dupont", "jean@gmail.com", "BP 001", "672233445", "password123", null
        );

        boolean compteCree = serviceClient.creerCompte(client);

        if (compteCree) {
            System.out.println("✅ Compte client créé avec succès !");
        } else {
            System.out.println("❌ Cet email est déjà utilisé.");
        }

        /*Création d'un agent par un administrateur
        // Administrateur admin = new Administrateur("Admin1", "Sys", "admin@mail.com", "ange rapha", "0777777777", "adminpass");

//AgentPharmacie agent = gestion.creerCompteAgent(admin, "Paul", "Jean", "agent@mail.com", "0611111111", "agentpass", "MAT001", "Paris");
       // System.out.println(" :"+ agent + " .");


        //liste utilisateurs
        ArrayList<Client> users ;
        users = new ArrayList<Client>();
        users.add(client1);
        users.add(client2);
        System.out.println("********************Liste des clients:*************************");
        for (Client c : users) System.out.println(c);
}*/
    }
}