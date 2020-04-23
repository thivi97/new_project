/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Login;
import com.connection.DBConnection;


/**
 *
 * @author User
 */
public class LoginDao {
    
    public String authenticateUser(Login login){
        String uname = login.getUname();
        String password = login.getPassword();
        
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        String userNameDB = "";
        String passwordDB = "";
        
        try{
            con = DBConnection.getConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select uname,pwd from login");
            
            while(resultSet.next()){
                userNameDB = resultSet.getString("uname");
                passwordDB = resultSet.getString("pwd");
                
                if(uname.equals(userNameDB) && password.equals(passwordDB)){
                    return "SUCCESS"; 
                }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return "Invalid user credentials";
    }
    
}
