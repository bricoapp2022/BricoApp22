/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

/**
 *
 * @author fadi
 */
public class Utilisateur {
    protected String nom;
    protected String prenom;
    protected String courriel;
    protected int telephone;
    protected String login;
    protected String motDePasse;
    protected String numeroCompte;
    protected String typeCompte;
    protected String adresse;

    public Utilisateur(String nom, String prenom, String courriel, int telephone, String login, String motDePasse, String numeroCompte, String typeCompte, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.courriel = courriel;
        this.telephone = telephone;
        this.login = login;
        this.motDePasse = motDePasse;
        this.numeroCompte = numeroCompte;
        this.typeCompte = typeCompte;
        this.adresse = adresse;
    }

    public Utilisateur(String nom, String prenom, String courriel, int telephone, String login, String motDePasse, String typeCompte, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.courriel = courriel;
        this.telephone = telephone;
        this.login = login;
        this.motDePasse = motDePasse;
        this.typeCompte = typeCompte;
        this.adresse = adresse;
    }



    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }
    
}
