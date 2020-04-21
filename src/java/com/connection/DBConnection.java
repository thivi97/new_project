/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author User
 */
public final class DBConnection {
    static Connection con = null;
    
    public static Connection getConnection()throws SQLException{
        if(con != null){
            return con;
        }
        
        String database = "codecomplexity";
        String username = "root";
        String password = "";
        return getConnection(database,username,password);
    }

    private static Connection getConnection(String database, String username, String password)throws SQLException {
       if(con == null || con.isClosed()){
           try{
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database + "?user=" + username + "&password=" + password);
           }catch(Exception e){
               e.printStackTrace();
           }
       }
       return con;
    }
}
