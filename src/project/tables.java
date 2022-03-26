/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Nihada
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class tables {
    public static void main(String[] args)
    {
        ResultSet ispis;
        Connection con=null;
        Statement st=null;
        try
        {
            con= ConnectionProvider.getCon();
            st=con.createStatement();
            System.out.println("Medjukorak");
            ispis= st.executeQuery("SELECT * FROM vrsta_smjestaja");
    
            while(ispis.next()) {
                System.out.println(ispis.getInt("id_vrsta_smjestaja"));
                System.out.println(ispis.getString("naziv"));
            }
            
            JOptionPane.showMessageDialog(null, "Uspjesan unos");
        }
        catch(Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Ne radi");
        }
        finally {
            try{ 
                con.close();
                st.close();
            }
            catch(Exception e) {}
        }
    }    

}
