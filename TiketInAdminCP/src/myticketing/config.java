/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myticketing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FAIZAL
 */
public class config {
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/selfticket_bioskop";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        }
        catch (Exception e){
            System.err.println("Failed Connection : "+e.getMessage());
        }
        return mysqlconfig;
    }
}
