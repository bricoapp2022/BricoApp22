/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

/**
 *
 * @author fadi
 */
public class Membre extends Utilisateur {
    private String etatMembre;

    public Membre(String etatMembre, String nom, String prenom, String courriel, int telephone, String login, String motDePasse, String numeroCompte, String typeCompte, String adresse) {
        super(nom, prenom, courriel, telephone, login, motDePasse, numeroCompte, typeCompte, adresse);
        this.etatMembre = etatMembre;
    }

    public String getEtatMembre() {
        return etatMembre;
    }

    public void setEtatMembre(String etatMembre) {
        this.etatMembre = etatMembre;
    }
    
}
