package com.esgis.s2aeshop.models;

public class Magasinier extends Compte {
    private String nomMagasinier;
    private String adresseMagasin;

    public Magasinier(String nomMagasinier, String adresseMagasin) {
        this.nomMagasinier = nomMagasinier;
        this.adresseMagasin = adresseMagasin;
    }

    public Magasinier(int id, String username, String password, String telephone, String adresse, String email, String typecompte, String nomMagasinier, String adresseMagasin) {
        super(id, username, password, telephone, adresse, email, typecompte);
        this.nomMagasinier = nomMagasinier;
        this.adresseMagasin = adresseMagasin;
    }

}
