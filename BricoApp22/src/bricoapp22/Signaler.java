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
public class Signaler {
    private Date dateSignalisation;
    private String raisonSignalisation;
    private Membre membre;
    private Annonce annonce;

    public Signaler(Date dateSignalisation, String raisonSignalisation, Membre membre, Annonce annonce) {
        this.dateSignalisation = dateSignalisation;
        this.raisonSignalisation = raisonSignalisation;
        this.membre = membre;
        this.annonce = annonce;
    }

    public Signaler() {
    }

    public Date getDateSignalisation() {
        return dateSignalisation;
    }

    public void setDateSignalisation(Date dateSignalisation) {
        this.dateSignalisation = dateSignalisation;
    }

    public String getRaisonSignalisation() {
        return raisonSignalisation;
    }

    public void setRaisonSignalisation(String raisonSignalisation) {
        this.raisonSignalisation = raisonSignalisation;
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
    
    
}
