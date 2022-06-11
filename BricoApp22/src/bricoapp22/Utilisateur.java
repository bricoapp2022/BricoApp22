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
    protected String nom;
    protected String prenom;
    protected String courriel;
    protected int telephone;
    protected String login;
    protected String motDePasse;
    protected String numeroCompte;
    protected TypeCompte typeCompte;
    protected String adresse;
    protected Set <Message> messageRecu = new HashSet(0);
    protected Set <Message> messageEnvoye = new HashSet(0);

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

    public Set<Message> getMessageRecu() {
        return messageRecu;
    }

    public void setMessageRecu(Set<Message> messageRecu) {
        this.messageRecu = messageRecu;
    }

    public Set<Message> getMessageEnvoye() {
        return messageEnvoye;
    }

    public void setMessageEnvoye(Set<Message> messageEnvoye) {
        this.messageEnvoye = messageEnvoye;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "nom=" + nom + ", prenom=" + prenom + ", courriel=" + courriel + ", telephone=" + telephone + ", login=" + login + ", motDePasse=" + motDePasse + ", numeroCompte=" + numeroCompte + ", typeCompte=" + typeCompte + ", adresse=" + adresse + ", messageRecu=" + messageRecu + ", messageEnvoye=" + messageEnvoye + '}';
    }

    public void afficherUtilisateur(){
        System.out.println(toString());
        System.out.println("Messages recu: ");
          
        if(!messageRecu.isEmpty()){
        for (Message e: messageRecu){
            System.out.println( e.toString());
        }}
          System.out.println("Messages Envoye: ");
          if(!messageEnvoye.isEmpty()){
          for (Message e: messageEnvoye){
            System.out.println( e.toString());
        }}
    }


}
