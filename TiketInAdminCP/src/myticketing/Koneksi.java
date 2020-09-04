/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myticketing;
import java.sql.*;
/**
 *
 * @author FAIZAL
 */
public class Koneksi {
    public Connection conn;
    public Statement st;
    public ResultSet rs;
    
    public void koneksi()
    {
        connecting("localhost", "selfticket_bioskop", "root","");
    }


    public void connecting(String server, String db, String user, String pass)
    {
        System.out.println("Keterangan");
        try  //memanggil driver
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
         System.out.println(
         "Driver JDBC tidak berhasil Load");
         return;
        }
        
        
        System.out.println("Mysql JDBC Driver berhasil di Load");
        conn = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/selfticket_bioskop","root","");
        }
        catch (SQLException e) {
            System.out.println("tidak bisa koneksi ke database");
            return;
        }
        
        if (conn != null)
        {
            System.out.println("berhasil koneksi!");
             }
        else
        {
            System.out.println("koneksi gagal");
        }
    }        
}
