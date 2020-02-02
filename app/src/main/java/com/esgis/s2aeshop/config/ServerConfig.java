package com.esgis.s2aeshop.config;

/**
 * Created by Admin on 12/06/2018.
 */

public class ServerConfig {
    private static String http = "http://";
    //private static String ip = "192.168.1.111";
    //private static String ip = "192.168.1.120";
    private static String ip = "192.168.1.153";
    //private static String ip = "51.89.138.77";
    private static String port = "8080";
    private static String path = "/e2v/api/";
    public static String url_base = "http://"+ip+":"+port+path;


    // les d'authentifications
    public static String url_signin_up = url_base+"auth/signin-up";
    public static String url_signig= url_base+"auth/signin";

    // url facture
    public static String url_facture_del_false = url_base+"facture_del_false";
    public static String url_facture_page = url_base+"facture_desc";
    public static String url_facture_one = url_base+"facture/";
    public static String url_facture_existe = url_base+"facture_existe/";

    // url encaissement
    public static String url_encaissement = url_base+"enc_espece";
    public static String url_nbr_enc = url_base+"facture_nbr_enc";
    public static String url_nbr_no_enc = url_base+"facture_nbr_no_enc";
    public static String url_montant_enc = url_base+"enc_espece_montant";

    // l'url de recherche

}
