/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nihada
 */
public class ConnectionProvider {
    public static Connection getCon() {
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingBaza", "root", "hotmail7110");
    return con;
    }
    catch(Exception e) {
    System.out.println(e);
    return null;
    }
    }
    
}
