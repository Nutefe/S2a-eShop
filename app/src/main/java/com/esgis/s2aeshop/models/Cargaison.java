package com.esgis.s2aeshop.models;

public class Cargaison {
    private int idcargaison;
    private String trajet;
    private int nombredecolis;
    private int nbrelivraisons;

    public Cargaison(int idcargaison, String trajet, int nombredecolis, int nbrelivraisons) {
        this.idcargaison = idcargaison;
        this.trajet = trajet;
        this.nombredecolis = nombredecolis;
        this.nbrelivraisons = nbrelivraisons;
    }

    public int getIdcargaison() {
        return idcargaison;
    }

    public void setIdcargaison(int idcargaison) {
        this.idcargaison = idcargaison;
    }

    public String getTrajet() {
        return trajet;
    }

    public void setTrajet(String trajet) {
        this.trajet = trajet;
    }

    public int getNombredecolis() {
        return nombredecolis;
    }

    public void setNombredecolis(int nombredecolis) {
        this.nombredecolis = nombredecolis;
    }

    public int getNbrelivraisons() {
        return nbrelivraisons;
    }

    public void setNbrelivraisons(int nbrelivraisons) {
        this.nbrelivraisons = nbrelivraisons;
    }
}
