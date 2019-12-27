package com.esgis.s2aeshop.models;

public class Article {
    private int idArticle;
    private String nomArticle;
    private double intervallePrix;
    private String image;
    private String descriptionArticle;
    private String referenceFournisseur;

    public Article() {
    }

    public Article(int idArticle, String nomArticle, double intervallePrix, String image, String descriptionArticle, String referenceFournisseur) {
        this.idArticle = idArticle;
        this.nomArticle = nomArticle;
        this.intervallePrix = intervallePrix;
        this.image = image;
        this.descriptionArticle = descriptionArticle;
        this.referenceFournisseur = referenceFournisseur;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public double getIntervallePrix() {
        return intervallePrix;
    }

    public void setIntervallePrix(double intervallePrix) {
        this.intervallePrix = intervallePrix;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescriptionArticle() {
        return descriptionArticle;
    }

    public void setDescriptionArticle(String descriptionArticle) {
        this.descriptionArticle = descriptionArticle;
    }

    public String getReferenceFournisseur() {
        return referenceFournisseur;
    }

    public void setReferenceFournisseur(String referenceFournisseur) {
        this.referenceFournisseur = referenceFournisseur;
    }
}

