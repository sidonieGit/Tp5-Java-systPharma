package com.syspharma.projet;

import com.syspharma.projet.service.GestionUtilisateur;
import com.syspharma.projet.model.*;

import java.util.ArrayList;


public class MainTP{
    public static void main(String[] args) {
        GestionUtilisateur gestion = new GestionUtilisateur();

        // Un visiteur crée un compte pour devenir client
        Client client1 = gestion.creerCompteClient(
                "Sido", "Dupont", "alice@mail.com", "0600000000", "pass123");
        Client client2 = gestion.creerCompteClient(
                "Alice", "Cost", "cost@mail.com", "0600000000", "pass123");
        System.out.println("*************les clients ************:"+ client1+ " et "+client2 +" ont été cree.");

        //Création d'un agent par un administrateur
        Administrateur admin = new Administrateur("Admin1", "Sys", "admin@mail.com", "0777777777", "adminpass");

        AgentPharmacie agent = gestion.creerCompteAgent(admin, "Paul", "Jean", "agent@mail.com", "0611111111", "agentpass", "MAT001", "Paris");
       // System.out.println(" :"+ agent + " .");


        //liste utilisateurs
        ArrayList<Client> users ;
        users = new ArrayList<Client>();
        users.add(client1);
        users.add(client2);
        System.out.println("Liste des clients:");
        for (Client c : users) System.out.println(c);
    }
}
