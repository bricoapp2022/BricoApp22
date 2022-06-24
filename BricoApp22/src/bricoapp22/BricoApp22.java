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
        
        
        Utilisateur hicham = new Utilisateur("hicam", "fouad", "hicha@bricoapp", "438-xxxxxxx", "hichamBrico", "secret", TypeCompte.M, "montreal quebec");
        Utilisateur hicham2 = new Utilisateur("Ibrahim", "fadi", "fadi@bricoapp", "514-xxxxxxx", "fadiBrico", "secret",  TypeCompte.M, "Laval quebec");
        Membre fouad = new Membre(true, "nomMembre", "prenomMembre", "courrielMembre", "514-zzzzzz", "loginMembre", "secretMembre",  TypeCompte.M, "addresseMembre");
    }

}
