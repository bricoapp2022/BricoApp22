/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bricoapp22;
        
        


/**
 *
 * @author fadi
 */
public class BricoApp22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrateur fouad = new Administrateur("dfdfg", "Fouad", "hicham", "admin@bricoapp.com", 01234567, "fouad", "motdepasse", "1234", TypeCompte.Administrateur, "Montreal Canada") ;
        System.out.println(fouad);
        Membre fadi = new Membre(true, fouad, "Ibrahim", "fadi", "fadi@bricoapp.com", 01234567, "fadi", "password", "F002", TypeCompte.client, "Laval Canada");
        Membre zarzour = new Membre(true, fouad, "zarzour", "zizo", "zizo@bricoapp.com", 01234561, "zarzour", "password2", "z002", TypeCompte.client, "Laval Canada");
        fouad.afficherMembres();
        
        Categorie jardinage = new Categorie(fouad,"jardinage");
        Categorie menuiserie = new Categorie(fouad, "menuiserie");
        Categorie plomberie = new Categorie(fouad, "plomberie");
        
        Annonce ann1 = new Annonce("description ann 1", "marteau magic", "path pour image", zarzour, plomberie);
        Annonce ann2 = new Annonce("description ann 2", "tournevis magic", "path pour image", fadi, plomberie);
        Annonce ann3 = new Annonce("description ann 3", "perceuse magic", "path pour image", zarzour, plomberie);
        
        Message hello= new Message("Bonjour zarzour -> fadi", fadi, zarzour);
        Message hello4= new Message("Bonjour fadi -> zarzour", zarzour, fadi);
        Message hello2= new Message("Bonjour fouad -> fadi", fadi,fouad);
        //Message hello3= new Message("Bonjour fadi -> fadi", fadi, fadi);
        zarzour.afficheMembre();
        Signaler sign1 = new Signaler("trompeuse", fadi, ann3, fouad);
        Signaler sign2 = new Signaler("frauduleuse", fadi, ann2, fouad);
        
        fouad.afficheAdmin();
        plomberie.afficherCategorie();
        
        fadi.afficherUtilisateur();
        zarzour.afficherUtilisateur();
        fouad.afficherUtilisateur();
        
        
    }

}
