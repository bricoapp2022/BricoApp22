/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

import java.util.Date;

/**
 *
 * @author fadi
 */
public class Annonce {
    private String description;
    private String nomOutil;
    private int idAnnonce;
    private String image;
    private boolean etatAnnonce;
    private Date datePublication;
    private Membre membre;
    private Categorie categorie;

    public Annonce(String description, String nomOutil, int idAnnonce, String image, boolean etatAnnonce, Date datePublication, Membre membre, Categorie categorie) {
        this.description = description;
        this.nomOutil = nomOutil;
        this.idAnnonce = idAnnonce;
        this.image = image;
        this.etatAnnonce = etatAnnonce;
        this.datePublication = datePublication;
        this.membre = membre;
        this.categorie = categorie;
        
        this.membre.getAnnonces().add(this);
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

   
    
}
