package com.esgis.s2aeshop.models;

public class Client extends Compte {

    private String nomClient;


    public Client(String nomClient) {
        this.nomClient = nomClient;
    }

    public Client(int id, String username, String password, String telephone, String adresse, String email, String typecompte, String nomClient) {
        super(id, username, password, telephone, adresse, email, typecompte);
        this.nomClient = nomClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
}
