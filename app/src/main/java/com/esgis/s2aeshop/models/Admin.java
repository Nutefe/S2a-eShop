package com.esgis.s2aeshop.models;

public class Admin extends Compte {
    private String nomAdmin;

    public Admin(String nomAdmin) {
        this.nomAdmin = nomAdmin;
    }

    public Admin(int id, String username, String password, String telephone, String adresse, String email, String typecompte, String nomAdmin) {
        super(id, username, password, telephone, adresse, email, typecompte);
        this.nomAdmin = nomAdmin;
    }

    public String getNomAdmin() {
        return nomAdmin;
    }

    public void setNomAdmin(String nomAdmin) {
        this.nomAdmin = nomAdmin;
    }
}
