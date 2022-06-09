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
public class Membre extends Utilisateur {
    private boolean etatMembre;
    private Set <String> annonces = new HashSet(0);
    private Administrateur admin;

    public Membre(boolean etatMembre, Administrateur admin, String nom, String prenom, String courriel, int telephone, String login, String motDePasse, String numeroCompte, TypeCompte typeCompte, String adresse) {
        super(nom, prenom, courriel, telephone, login, motDePasse, numeroCompte, typeCompte, adresse);
        this.etatMembre = etatMembre;
        this.admin = admin;
        this.admin.getUtilisateurs().add(this);
    }

    public Membre(boolean etatMembre, Administrateur admin) {
        this.etatMembre = etatMembre;
        this.admin = admin;
    }

    public Membre() {
    }

    public Set <String> getAnnonces() {
        return annonces;
    }

    public void setAnnonces(Set <String> annonces) {
        this.annonces = annonces;
    }

    public Administrateur getAdmin() {
        return admin;
    }

    public void setAdmin(Administrateur admin) {
        this.admin = admin;
    }

    public boolean isEtatMembre() {
        return etatMembre;
    }

    public void setEtatMembre(boolean etatMembre) {
        this.etatMembre = etatMembre;
    }
   
    
}
