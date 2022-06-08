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
public class Utilisateur {
    protected String nom;
    protected String prenom;
    protected String courriel;
    protected int telephone;
    protected String login;
    protected String motDePasse;
    protected String numeroCompte;
    TypeCompte typeCompte;
    protected String adresse;
    Set <String> messageRecu = new HashSet(0);
    Set <String> messageEnvoye = new HashSet(0);




}
