/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

import java.util.HashSet;
import java.util.Set;
import bricoapp22.Categorie;

/**
 *
 * @author fadi
 */
public class Administrateur extends Utilisateur{
    private String messageSignale;
    private Set <Membre> utilisateurs = new HashSet(0);
    private Set <Categorie> categorie= new HashSet(0);
    private Set <Signaler> signalements= new HashSet(0);

    public Administrateur(String messageSignale, String nom, String prenom, String courriel, int telephone, String login, String motDePasse, String numeroCompte, TypeCompte typeCompte, String adresse) {
        super(nom, prenom, courriel, telephone, login, motDePasse, numeroCompte, typeCompte, adresse);
        this.messageSignale = messageSignale;
    }

    public Administrateur(String messageSignale) {
        this.messageSignale = messageSignale;
    }

    public Administrateur() {
    }

    public Set <Membre> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Set <Membre> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public String getMessageSignale() {
        return messageSignale;
    }

    public void setMessageSignale(String messageSignale) {
        this.messageSignale = messageSignale;
    }

    public Set <Categorie> getCategorie() {
        return categorie;
    }

    public void setCategorie(Set <Categorie> categorie) {
        this.categorie = categorie;
    }

    public void afficherMembres (){
        for (Membre e: this.utilisateurs){
            System.out.println(e.toString());
        }
    }
    public void afficheAdmin(){
        for (Categorie e: categorie){
            System.out.println("Categorie : " + e.toString());
        }
        System.out.println("Annonces signalées :");
        for (Signaler e: signalements){
            System.out.println("Signalements : " + e.toString());
        }
    }

    public Set <Signaler> getSignalements() {
        return signalements;
    }
}
