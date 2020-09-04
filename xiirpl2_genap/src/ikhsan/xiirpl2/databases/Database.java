/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikhsan.xiirpl2.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author FAIZAL
 */
public class Database {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAIZAL
 */

        private static Connection mysqlconfig;
    
        public static Connection configDatabase()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/ujikom_ikhsan";
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
