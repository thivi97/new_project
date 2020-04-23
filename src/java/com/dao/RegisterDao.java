/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.model.Register;


/**
 *
 * @author User
 */
public class RegisterDao {
    
    public String registerUser(Register register){
        String fname = register.getFname();
        String lname = register.getLname();
        String uname = register.getUname();
        String email = register.getEmail();
        String password = register.getPassword();
        
        Connection con = null;
        PreparedStatement preparedStatement = null;
        
        try{
            con = DBConnection.getConnection();
            String query = "insert into userinfo(fname,lname,uname,email,password) values(?,?,?,?,?)";
            
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,fname);
            preparedStatement.setString(2,lname);
            preparedStatement.setString(3,uname);
            preparedStatement.setString(4,email);
            preparedStatement.setString(5,password);
            
            int i = preparedStatement.executeUpdate();
            
            if(i != 0)
                return "SUCCESS";
        
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return "Oops.. Something went wrong there...!";
        
        
    }
    
}
