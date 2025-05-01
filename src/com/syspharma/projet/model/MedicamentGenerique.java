package com.syspharma.projet.model;


    // Un médicament générique est un type de médicament
    public class MedicamentGenerique extends Medicament {

        protected String medocOrignal;
        public MedicamentGenerique(String nom, double prix, String description, String categorie, String image, String medocOriginal) {
            super(nom, prix, description, categorie, image);
            this.medocOrignal = medocOriginal;
        }
    }


