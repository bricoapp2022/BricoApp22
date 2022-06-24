/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bricoapp22;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author fadi
 */
public class NewClass {
    static Connection con=null;
    static PreparedStatement stm=null;
    static ResultSet rs=null;
    
    public void insertUser(int userId, String nom,String prenom, String courriel,String telephone,String login,String motDePasse,String numeroCompte,char typeCompte, String adresse ){
        try {
            createConnectionDatabase();
            String sql="Insert into Utilisateur values(?,?,?,?,?,?,?,?,?,?)";
            stm=con.prepareStatement(sql);
            stm.setInt(1, userId);
            stm.setString(2, nom);
            stm.setString(3, prenom);
            stm.setString(4, courriel);
            stm.setString(5, telephone);
            stm.setString(6, login);
            stm.setString(7, motDePasse);
            stm.setString(8, numeroCompte);
            stm.setString(9, String.valueOf(typeCompte));
            stm.setString(10, adresse);
            
            
             int resultat=stm.executeUpdate();
             if (resultat>0){
                 System.out.println("Insertion reussie");
             }else{
                 System.out.println("Insertion echouée");
             }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
    public void createConnectionDatabase() throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        con=DriverManager.getConnection("jdbc:oracle:thin:@144.217.163.57:1521:XE", "e22_103_Equipe6", "ahmedanypw");
    }
}
