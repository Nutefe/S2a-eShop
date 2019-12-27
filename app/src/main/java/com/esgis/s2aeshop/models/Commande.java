package com.esgis.s2aeshop.models;

import java.util.Date;

public class Commande {
    private int idCommande;
    private Date dateCommande;
    private String adresseLivraison;
    private String numreceveur;
    private int quantite;
    private Boolean etat;

    public Commande() {
    }

    public Commande(int idCommande, Date dateCommande, String adresseLivraison, String numreceveur, int quantite, Boolean etat) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.adresseLivraison = adresseLivraison;
        this.numreceveur = numreceveur;
        this.quantite = quantite;
        this.etat = etat;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public String getNumreceveur() {
        return numreceveur;
    }

    public void setNumreceveur(String numreceveur) {
        this.numreceveur = numreceveur;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
}
