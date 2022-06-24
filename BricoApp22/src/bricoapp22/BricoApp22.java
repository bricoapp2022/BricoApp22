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
        
        
        
    Membre fouad = new Membre(true, "nomMembre", "prenomMembre", "courrielMembre", "514-zzzzzz", "loginMembre", "secretMembre",  TypeCompte.M, "addresseMembre");
    Categorie jardinage=new Categorie("jardinage");
    Categorie plomberie=new Categorie("plomberie");
    Categorie menuiserie=new Categorie("menuiserie");
    Annonce ann1=new Annonce("Une annonce tres importante", "marteau magique", "marteau.jpg", fouad, plomberie);
    
    
    
    
    }

}
