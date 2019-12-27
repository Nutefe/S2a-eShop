package com.esgis.s2aeshop.models;

public class Livreur extends Compte{
    private String nomlivreur;

    public Livreur(String nomlivreur) {
        this.nomlivreur = nomlivreur;
    }

    public Livreur(int id, String username, String password, String telephone, String adresse, String email, String typecompte, String nomlivreur) {
        super(id, username, password, telephone, adresse, email, typecompte);
        this.nomlivreur = nomlivreur;
    }

    public String getNomlivreur() {
        return nomlivreur;
    }

    public void setNomlivreur(String nomlivreur) {
        this.nomlivreur = nomlivreur;
    }
}
