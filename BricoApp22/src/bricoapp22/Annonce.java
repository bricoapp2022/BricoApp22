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

    public Annonce(String description, String nomOutil, int idAnnonce, String image, boolean etatAnnonce, Date datePublication) {
        this.description = description;
        this.nomOutil = nomOutil;
        this.idAnnonce = idAnnonce;
        this.image = image;
        this.etatAnnonce = etatAnnonce;
        this.datePublication = datePublication;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
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
    
    
}
