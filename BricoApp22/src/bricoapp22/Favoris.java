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
public class Favoris {
    private Date dateAjout;
    private Membre membre;
    private Annonce annonce;

    public Favoris( Membre membre, Annonce annonce) {
        Date date = new Date();
        this.dateAjout=date;
        this.membre = membre;
        this.annonce = annonce;
    }

    public Favoris() {
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce(Annonce annonce) {
        this.annonce = annonce;
    }

    @Override
    public String toString() {
        return "Favoris{" + "dateAjout=" + dateAjout + ", membre=" + membre.getNom() + ", annonce=" + annonce.getNomOutil() + '}';
    }
    
    
}
