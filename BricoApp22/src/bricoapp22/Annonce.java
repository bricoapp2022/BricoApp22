/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

import static bricoapp22.NewClass.con;
import static bricoapp22.NewClass.stm;
import static bricoapp22.Utilisateur.conn;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fadi
 */
public class Annonce {
    private String description;
    private String nomOutil;
    private static int idAnnonce=0;
    private String image;
    private boolean etatAnnonce;
    private Date datePublication;
    private Membre membre;
    private Categorie categorie;
    public static NewClass conn=new NewClass();
    
    
    
    public Annonce(String description, String nomOutil,String image, Membre membre, Categorie categorie) {
        Date date = new Date();
        this.description = description;
        this.nomOutil = nomOutil;
        this.image = image;
        this.etatAnnonce=true;
        this.datePublication = date;
        this.membre = membre;
        this.categorie = categorie;
        
        this.membre.getAnnonces().add(this);
        this.categorie.getAnnonces().add(this);
        this.idAnnonce++;
        insertAnnonce();
    }
    public void insertAnnonce(){
         
        try {
            
            
            String sql="Insert into Annonce values(?,?,?,?,?,?,?,?)";
            
            stm=con.prepareStatement(sql);
            stm.setInt(1, idAnnonce);
            stm.setString(2,description);
            stm.setString(3,nomOutil);
            stm.setString(4,image);
            stm.setString(5,etatAnnonce?"actif":"inactif");
            stm.setDate(6,new java.sql.Date(datePublication.getTime()));
            stm.setInt(7,categorie.getIdCategorie());
            stm.setInt(8,membre.getID());
            
            String sql2="select categorie_id from categorie where nomcategorie=?";
            
            
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

    public Annonce() {
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomOutil() {
        return nomOutil;
    }

    public void setNomOutil(String nomOutil) {
        this.nomOutil = nomOutil;
    }

    public int getIdAnnonce() {
        return idAnnonce;
    }

    public void setIdAnnonce(int idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isEtatAnnonce() {
        return etatAnnonce;
    }

    public void setEtatAnnonce(boolean etatAnnonce) {
        this.etatAnnonce = etatAnnonce;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    @Override
    public String toString() {
        return "Annonce{" + "description=" + description + ", nomOutil=" + nomOutil + ", membre=" + membre.getNom() + ", categorie=" + categorie + '}';
    }

 
   
    
}
