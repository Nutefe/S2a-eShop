package com.esgis.s2aeshop.models;

public class Livraison {
    private int idlivraison;
    private int nbrecolis;
    private String adresseLivraison;
    private String contactreceveur;
    private String contactExpediteur;
    private boolean etatLivraison;

    public Livraison() {
    }

    public Livraison(int idlivraison, int nbrecolis, String adresseLivraison, String contactreceveur, String contactExpediteur, boolean etatLivraison) {
        this.idlivraison = idlivraison;
        this.nbrecolis = nbrecolis;
        this.adresseLivraison = adresseLivraison;
        this.contactreceveur = contactreceveur;
        this.contactExpediteur = contactExpediteur;
        this.etatLivraison = etatLivraison;
    }

    public int getIdlivraison() {
        return idlivraison;
    }

    public void setIdlivraison(int idlivraison) {
        this.idlivraison = idlivraison;
    }

    public int getNbrecolis() {
        return nbrecolis;
    }

    public void setNbrecolis(int nbrecolis) {
        this.nbrecolis = nbrecolis;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public String getContactreceveur() {
        return contactreceveur;
    }

    public void setContactreceveur(String contactreceveur) {
        this.contactreceveur = contactreceveur;
    }

    public String getContactExpediteur() {
        return contactExpediteur;
    }

    public void setContactExpediteur(String contactExpediteur) {
        this.contactExpediteur = contactExpediteur;
    }

    public boolean isEtatLivraison() {
        return etatLivraison;
    }

    public void setEtatLivraison(boolean etatLivraison) {
        this.etatLivraison = etatLivraison;
    }
}
