/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

import java.util.HashSet;
import java.util.Set;
import bricoapp22.Categorie;
import static bricoapp22.NewClass.con;
import static bricoapp22.NewClass.stm;
import static bricoapp22.Utilisateur.conn;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fadi
 */
public class Administrateur extends Utilisateur{
    private String messageSignale;
    private Set <Membre> utilisateurs = new HashSet(0);
    private Set <Categorie> categorie= new HashSet(0);
    private Set <Signaler> signalements= new HashSet(0);

    public Administrateur(String messageSignale, String nom, String prenom, String courriel, String telephone, String login, String motDePasse, String numeroCompte, TypeCompte typeCompte, String adresse) {
        super(nom, prenom, courriel, telephone, login, motDePasse, typeCompte, adresse);
        this.messageSignale = messageSignale;
        insertAdmin();
    }
    public void insertAdmin(){
        
        try {
            System.out.println("Id du super " + super.getIdUser());
            conn.createConnectionDatabase();
            String sql="Insert into Membre values(?,?,?)";
            stm=con.prepareStatement(sql);
            stm.setInt(1, super.getIdUser());
            stm.setString(2, "actif");
            stm.setInt(3, super.getIdUser());
            
            int resultat=stm.executeUpdate();
             if (resultat>0){
                 System.out.println("Insertion reussie");
             }else{
                 System.out.println("Insertion echouée");
             }
        } catch (SQLException ex) {
            Logger.getLogger(Utilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
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
