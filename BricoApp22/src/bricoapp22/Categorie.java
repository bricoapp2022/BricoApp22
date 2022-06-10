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
    private Set <String> nomCategorie= new HashSet();
    private Set <String> annonces= new HashSet();
    private Administrateur administrateur;

    public Categorie(Administrateur administrateur) {
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

    public Set <String> getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(Set <String> nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public Set <String> getAnnonces() {
        return annonces;
    }

    public void setAnnonces(Set <String> annonces) {
        this.annonces = annonces;
    }

    @Override
    public String toString() {
        return "Categorie{" + "nomCategorie=" + nomCategorie + ", annonces=" + annonces + ", administrateur=" + administrateur + '}';
    }
    

   

  
    
}
