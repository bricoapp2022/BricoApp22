/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bricoapp22;

import java.time.LocalDate;

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
        Membre zied = new Membre(true, fouad, "zarzour", "zizo", "zizo@bricoapp.com", 01234561, "zarzour", "password2", "z002", TypeCompte.client, "Laval Canada");
        fouad.afficherMembres();
        
        Categorie bricos = new Categorie(fouad);
        Categorie bricos2 = new Categorie(fouad);
        Categorie bricos3 = new Categorie(fouad);
        fouad.afficheAdmin();
        LocalDate todayDate = LocalDate.now();
        Annonce marteau = new Annonce("desc Marteau", "marteau", 123, "URL image", true, todayDate.getDayOfYear(), zied, bricos3)
        
    }

}
