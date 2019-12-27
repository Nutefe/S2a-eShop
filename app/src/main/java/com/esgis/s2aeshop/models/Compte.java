package com.esgis.s2aeshop.models;

public class Compte {
    private int id;
    private String username;
    private String password;
    private String telephone;
    private String adresse;
    private String email;
    private String typecompte;

    public Compte() {
    }


    public Compte(int id, String username, String password, String telephone, String adresse, String email, String typecompte) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.typecompte = typecompte;
    }

    public String getTypecompte() {
        return typecompte;
    }

    public void setTypecompte(String typecompte) {
        this.typecompte = typecompte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
