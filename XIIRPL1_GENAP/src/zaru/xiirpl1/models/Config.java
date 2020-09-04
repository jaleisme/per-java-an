/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaru.xiirpl1.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FAIZAL
 */
public class Config {
    static final  String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    protected static final String url ="jdbc:mysql://localhost/minimarket";
    protected static final String user="root";
    protected static final String pass="";
    
    private static Connection mysqlconfig;
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

    
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/minimarket";
            String user="root";    
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("connection failure :  "+e.getMessage());
        }
        return mysqlconfig;
    }
}

