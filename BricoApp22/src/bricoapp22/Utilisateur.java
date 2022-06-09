/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author fadi
 */
public class Utilisateur {
    private String nom;
    private String prenom;
    private String courriel;
    private int telephone;
    private String login;
    private String motDePasse;
    private String numeroCompte;
    private TypeCompte typeCompte;
    private String adresse;
    private Set <String> messageRecu = new HashSet(0);
    private Set <String> messageEnvoye = new HashSet(0);

    public Utilisateur(String nom, String prenom, String courriel, int telephone, String login, String motDePasse, String numeroCompte, TypeCompte typeCompte, String adresse) {
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

    public Utilisateur() {
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

    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(TypeCompte typeCompte) {
        this.typeCompte = typeCompte;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Set<String> getMessageRecu() {
        return messageRecu;
    }

    public void setMessageRecu(Set<String> messageRecu) {
        this.messageRecu = messageRecu;
    }

    public Set<String> getMessageEnvoye() {
        return messageEnvoye;
    }

    public void setMessageEnvoye(Set<String> messageEnvoye) {
        this.messageEnvoye = messageEnvoye;
    }




}
