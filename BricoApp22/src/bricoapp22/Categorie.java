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
public class Categorie {

    public static int getIdCategorie() {
        return idCategorie;
    }
    private String nomCategorie;
    private Set <Annonce> annonces= new HashSet();
    private Administrateur administrateur;
    private static int idCategorie=0;

    public Categorie( String nomCategorie) {
        this.nomCategorie=nomCategorie;
        //this.administrateur = administrateur;
        //this.administrateur.getCategorie().add(this);
        idCategorie++;
        insertCategorie();
    }

    public Categorie() {
    }
    public void insertCategorie(){
        try {
            
            conn.createConnectionDatabase();
            String sql="Insert into Categorie values(?,?)";
            stm=con.prepareStatement(sql);
            stm.setInt(1, idCategorie);
            stm.setString(2, nomCategorie);
            
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
    public Administrateur getAdministrateur() {
        return administrateur;
    }

    public void setAdministrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public Set <Annonce> getAnnonces() {
        return annonces;
    }

    public void setAnnonces(Set <Annonce> annonces) {
        this.annonces = annonces;
    }
    
   
    public void afficherCategorie(){
        System.out.println(toString());
        for (Annonce e: annonces){
            System.out.println(e.toString());
        }
    }

    @Override
    public String toString() {
        return "Categorie{" + "nomCategorie=" + nomCategorie  + ", administrateur=" + administrateur.getNom() + '}';
    }

   

  
    
}
