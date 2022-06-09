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
public class Administrateur extends Utilisateur{
    private String messageSignale;
    private Set <String> utilisateurs = new HashSet(0);
    private Set <String> categorie= new HashSet();

    public Administrateur(String messageSignale, String nom, String prenom, String courriel, int telephone, String login, String motDePasse, String numeroCompte, TypeCompte typeCompte, String adresse) {
        super(nom, prenom, courriel, telephone, login, motDePasse, numeroCompte, typeCompte, adresse);
        this.messageSignale = messageSignale;
    }

    public Administrateur(String messageSignale) {
        this.messageSignale = messageSignale;
    }

    public Administrateur() {
    }

    public Set <String> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Set <String> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public String getMessageSignale() {
        return messageSignale;
    }

    public void setMessageSignale(String messageSignale) {
        this.messageSignale = messageSignale;
    }

    public Set <String> getCategorie() {
        return categorie;
    }

    public void setCategorie(Set <String> categorie) {
        this.categorie = categorie;
    }

    
    
}
