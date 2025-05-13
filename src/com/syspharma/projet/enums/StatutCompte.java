package com.syspharma.projet.enums;

public enum StatutCompte {
    ACTIF,
    INACTIF,
    DESACTIVE;

    public boolean isActif() {
        return this == ACTIF;
    }
}
