/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;

import static bricoapp22.NewClass.con;
import static bricoapp22.NewClass.stm;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fadi
 */
public class Utilisateur {

    public static int getIdUser() {
        return idUser;
    }
    protected String nom;
    protected String prenom;
    protected String courriel;
    protected String telephone;
    protected String login;
    protected String motDePasse;
    protected String numeroCompte;
    protected TypeCompte typeCompte;
    protected String adresse;
    protected Set <Message> messageRecu = new HashSet(0);
    protected Set <Message> messageEnvoye = new HashSet(0);
    private static int idUser=0;
    public static NewClass conn=new NewClass();

    public Utilisateur(String nom, String prenom, String courriel, String telephone, String login, String motDePasse, TypeCompte typeCompte, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.courriel = courriel;
        this.telephone = telephone;
        this.login = login;
        this.motDePasse = motDePasse;
       
        this.typeCompte = typeCompte;
        this.adresse = adresse;
        this.idUser++;
        insertUser();
    }

    public Utilisateur() {
    }

    public void insertUser(){
        try {
            conn.createConnectionDatabase();
            String sql="Insert into Utilisateur values(?,?,?,?,?,?,?,?,?,?)";
            stm=con.prepareStatement(sql);
            stm.setInt(1, this.idUser);
            stm.setString(2, this.nom);
            stm.setString(3, this.prenom);
            stm.setString(4, this.courriel);
            stm.setString(5, this.telephone);
            stm.setString(6, this.login);
            stm.setString(7, this.motDePasse);
            stm.setString(8, formatNumCompte(String.valueOf(this.typeCompte)));
            stm.setString(9, String.valueOf(this.typeCompte));
            stm.setString(10, this.adresse);
            int resultat=stm.executeUpdate();
             if (resultat>0){
                 System.out.println("Insertion reussie");
             }else{
                 System.out.println("Insertion echouée");
             }
        } catch (SQLException ex) {
            Logger.getLogger(Utilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String formatNumCompte(String typeCompte){
        numeroCompte= "B"+ typeCompte + idUser;
        return numeroCompte;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(TypeCompte typeCompte) {
        this.typeCompte = typeCompte;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Set<Message> getMessageRecu() {
        return messageRecu;
    }

    public void setMessageRecu(Set<Message> messageRecu) {
        this.messageRecu = messageRecu;
    }

    public Set<Message> getMessageEnvoye() {
        return messageEnvoye;
    }

    public void setMessageEnvoye(Set<Message> messageEnvoye) {
        this.messageEnvoye = messageEnvoye;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "nom=" + nom + ", prenom=" + prenom + ", courriel=" + courriel + ", telephone=" + telephone + ", login=" + login + ", motDePasse=" + motDePasse + ", numeroCompte=" + numeroCompte + ", typeCompte=" + typeCompte + ", adresse=" + adresse + ", messageRecu=" + messageRecu + ", messageEnvoye=" + messageEnvoye + '}';
    }

    public void afficherUtilisateur(){
        System.out.println(toString());
        System.out.println("Messages recu: ");
          
        if(!messageRecu.isEmpty()){
        for (Message e: messageRecu){
            System.out.println( e.toString());
        }}
          System.out.println("Messages Envoye: ");
          if(!messageEnvoye.isEmpty()){
          for (Message e: messageEnvoye){
            System.out.println( e.toString());
        }}
    }


}
