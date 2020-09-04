/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikhsan.xiirpl2.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FAIZAL
 */
public class Configuration {
  
    static final  String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    protected static final String url ="jdbc:mysql://localhost/ujikom_ikhsan";
    protected static final String user="root";
    protected static final String pass="";
    public static Connection connection;
    public static Statement statement;
    public static ResultSet result;
            
    public static void RunConnection(){
         try{
                    Class.forName(JDBC_DRIVER);
                    connection = DriverManager.getConnection(url,user,pass);
                    statement = connection.createStatement();
                    System.out.println("Koneksi berhasil ");
                } catch (ClassNotFoundException | SQLException e){
                    System.out.println("Koneksi gagal " + e.getMessage());
                }
            }


}
