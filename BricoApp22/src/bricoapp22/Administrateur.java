/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

/**
 *
 * @author fadi
 */
public class Administrateur extends Utilisateur{
    private String messageSignale;

    public Administrateur(String messageSignale, String nom, String prenom, String courriel, int telephone, String login, String motDePasse, String numeroCompte, String typeCompte, String adresse) {
        super(nom, prenom, courriel, telephone, login, motDePasse, numeroCompte, typeCompte, adresse);
        this.messageSignale = messageSignale;
    }
    

    public String getMessageSignale() {
        return messageSignale;
    }

    public void setMessageSignale(String messageSignale) {
        this.messageSignale = messageSignale;
    }
    
}
