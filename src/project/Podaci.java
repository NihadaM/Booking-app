/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class Podaci {
  
    static String korisnik = "";
    static String username = "";
    static String email = "";
    static int id = -1;
    static int id_smjestaj = -1;
    
    public static void setKorisnik(String k) {
        korisnik = k;
    }
  
    public static void setUsername(String u) {
        username = u;
    }
    public static void setEmail(String e) {
        email = e;
    }
    public static void setId(int i) {
        id = i;
    }
    public static void setId_smjestaj(int i) {
        id_smjestaj = i;
    }
    public static void skiniNovacSaRacuna(int id, double cijena) {
        double balans = getBalans(id);
        balans -= cijena;
        InsertUpdateDelete.setData("update kartica set balans = " + balans + " where id_korisnik = " + id, "");

    }
    
    public static void vratiNovac(int id, double povrat_novca) {
        double balans = getBalans(id);
        balans += povrat_novca;
        
        InsertUpdateDelete.setData("update kartica set balans = " + balans + " where id_korisnik = " + id, "");
       
        
    }
    
    public static int getId_smjestaj() {
        return id_smjestaj;
    }
    
    public static double getBalans(int id) {
        double balans = 0;
        
        ResultSet rs = Select.getData("select balans from kartica where id_korisnik = " + id);
        try {
            if (rs.next()) {
                balans = rs.getDouble(1);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return balans;
    }
    
    public static String getKorisnik() {
        return korisnik;
    }
 
    public static String getUsername() {
        return username;
    }
    public static String getEmail() {
        return email;
    }
    public static int getId() {
        return id;
    }
}
