/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

/**
 *
 * @author fadi
 */
public class Detail {
    private String note;
    private String commentaire;
    private Membre membre;
    private Annonce annonce;

    public Detail(String note, String commentaire, Membre membre, Annonce annonce) {
        this.note = note;
        this.commentaire = commentaire;
        this.membre = membre;
        this.annonce = annonce;
    }

    public Detail() {
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
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
