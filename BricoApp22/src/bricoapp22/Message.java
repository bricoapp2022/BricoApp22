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
public class Message {
    private String contenue;
    private Date dateCreation;
    private Utilisateur utilisateurSender;
    private Utilisateur utilisateurReceiver;
   

    public Message(String contenue, Utilisateur utilisateurReceiver,Utilisateur utilisateurSender) {
        Date date = new Date();
        this.dateCreation=date;
        this.contenue = contenue;
        this.utilisateurSender=utilisateurSender;
        this.utilisateurReceiver=utilisateurReceiver;
        this.utilisateurSender.getMessageEnvoye().add(this);
        this.utilisateurReceiver.getMessageRecu().add(this);
        
    }

    public Message() {
    }

    public String getContenue() {
        return contenue;
    }

    public void setContenue(String contenue) {
        this.contenue = contenue;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }


    public Utilisateur getUtilisateurSender() {
        return utilisateurSender;
    }

    public Utilisateur getUtilisateurReceiver() {
        return utilisateurReceiver;
    }

    @Override
    public String toString() {
        return "Message{" + "contenue=" + contenue + ", dateCreation=" + dateCreation + ", utilisateurSender=" + utilisateurSender.getNom() + ", utilisateurReceiver=" + utilisateurReceiver.getNom() + '}';
    }
   
    
    
}
