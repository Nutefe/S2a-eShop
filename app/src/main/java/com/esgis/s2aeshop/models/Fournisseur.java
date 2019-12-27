package com.esgis.s2aeshop.models;

public class Fournisseur extends Compte{

    private String nomfournisseur;
    private String description;
    private String chargedevante;

    public Fournisseur(String nomfournisseur, String description, String chargedevante) {
        this.nomfournisseur = nomfournisseur;
        this.description = description;
        this.chargedevante = chargedevante;
    }

    public Fournisseur(int id, String username, String password, String telephone, String adresse, String email, String typecompte, String nomfournisseur, String description, String chargedevante) {
        super(id, username, password, telephone, adresse, email, typecompte);
        this.nomfournisseur = nomfournisseur;
        this.description = description;
        this.chargedevante = chargedevante;
    }

    public String getNomfournisseur() {
        return nomfournisseur;
    }

    public void setNomfournisseur(String nomfournisseur) {
        this.nomfournisseur = nomfournisseur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChargedevante() {
        return chargedevante;
    }

    public void setChargedevante(String chargedevante) {
        this.chargedevante = chargedevante;
    }
}
