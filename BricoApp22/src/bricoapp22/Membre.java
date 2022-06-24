/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

import static bricoapp22.NewClass.con;
import static bricoapp22.NewClass.stm;
import static bricoapp22.Utilisateur.conn;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fadi
 */
public class Membre extends Utilisateur {
    private boolean etatMembre;
    private Set <Annonce> annonces = new HashSet(0);
    private Administrateur admin;

    public Membre(boolean etatMembre,String nom, String prenom, String courriel, String telephone, String login, String motDePasse, TypeCompte typeCompte, String adresse) {
        super(nom, prenom, courriel, telephone, login, motDePasse, typeCompte, adresse);
        this.etatMembre = etatMembre;
        //this.admin = admin;
        //this.admin.getUtilisateurs().add(this);
        insertMember();
    }
    public void insertMember(){
        
        try {
            System.out.println("Id du super " + super.idUser);
            conn.createConnectionDatabase();
            String sql="Insert into Membre values(?,?,?)";
            stm=con.prepareStatement(sql);
            stm.setInt(1, super.idUser);
            stm.setString(2, "actif");
            stm.setInt(3, super.idUser);
            
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
    public Membre(boolean etatMembre, Administrateur admin) {
        this.etatMembre = etatMembre;
        this.admin = admin;
    }

    public Membre() {
    }

    public Set <Annonce> getAnnonces() {
        return annonces;
    }

    public void setAnnonces(Set <Annonce> annonces) {
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
    public void afficheMembre(){
        for (Annonce e: annonces){
            System.out.println("Annonce : " + e.toString());
        }
    }
   
    
}
