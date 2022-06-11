/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author fadi
 */
public class Categorie {
    private String nomCategorie;
    private Set <Annonce> annonces= new HashSet();
    private Administrateur administrateur;

    public Categorie(Administrateur administrateur, String nomCategorie) {
        this.nomCategorie=nomCategorie;
        this.administrateur = administrateur;
        this.administrateur.getCategorie().add(this);
    }

    public Categorie() {
    }

    public Administrateur getAdministrateur() {
        return administrateur;
    }

    public void setAdministrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public Set <Annonce> getAnnonces() {
        return annonces;
    }

    public void setAnnonces(Set <Annonce> annonces) {
        this.annonces = annonces;
    }
    
   
    public void afficherCategorie(){
        System.out.println(toString());
        for (Annonce e: annonces){
            System.out.println(e.toString());
        }
    }

    @Override
    public String toString() {
        return "Categorie{" + "nomCategorie=" + nomCategorie  + ", administrateur=" + administrateur.getNom() + '}';
    }

   

  
    
}
