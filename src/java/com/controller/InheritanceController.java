/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.InheritanceDTO;
import com.model.InheritanceMethod;
import com.connection.DBConnection;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;



/**
 *
 * @author User
 */
public class InheritanceController {
    
    private static Connection connection;
    private static PreparedStatement ps;
    private static ResultSet rs;
    
    public static ArrayList<InheritanceMethod> getInheritance(){
        ArrayList<InheritanceMethod> list = new ArrayList<InheritanceMethod>();
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement("select * from inheritance");
            rs = ps.executeQuery();
            
            while(rs.next()){
                InheritanceMethod inheritanceMethod = new InheritanceMethod();
                inheritanceMethod.setId(rs.getString("ID"));
                inheritanceMethod.setInheritancePattern(rs.getString("Inheritance Pattern"));
                inheritanceMethod.setWeight(rs.getInt("Weight"));
                
                list.add(inheritanceMethod);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            
        }
        try{
            if(ps != null){
                ps.close();
            }
            if(connection != null){
                connection.close();
            }
        }catch(SQLException e){
            System.err.format("SQL State: %s\n%s",e.getSQLState(),e.getMessage());
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    public int updateInheritance(ArrayList<InheritanceMethod> inheritance){
        int result = 0;
        
        try{
            connection = DBConnection.getConnection();
            for(InheritanceMethod inheritance1 : inheritance){
                ps = connection.prepareStatement("UPDATE inheritance SET weight=? where id=?");
                
                ps.setInt(1, inheritance1.getWeight());
                ps.setString(2, inheritance1.getId());
                
                result = ps.executeUpdate();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(ps != null){
                    ps.close();
                }
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                System.err.format("SQL State: %s\n%s",e.getSQLState(),e.getMessage());
            }
        }
        return result;
    }
    
    
    public static ArrayList<InheritanceDTO> measureInheritance(String filename)throws FileNotFoundException,IOException{
    ArrayList<InheritanceDTO> inheritanceList = new ArrayList<>();
    
    FileReader fr = new FileReader("C://Users/User/Desktop/codes"+ filename);
    
    BufferedReader br = new BufferedReader(fr);
    ArrayList<InheritanceMethod> alist = new ArrayList<>();
    alist = getInheritance();
    String s = null;
    String[] words = null;
    String input = "class";
    String[] check = null;
    int direct = 0;
    int indirect = 0;
    
    
    while((s = br.readLine()) != null){
        words = s.split("\\w+");
        List<String> cls = Arrays.asList(words);
        
        for(String word : words){
            int nDI = 0;
            int i = cls.indexOf(word);
            InheritanceDTO inhert = new InheritanceDTO();
            if(word.equals(input)){
                for(int j = 0; j < words.length; j++){
                    if(words[j].equals("extends")){
                        nDI++;
                        if(words[i+1].endsWith(" {"))
                            indirect++;
                    }
                }
                
                inhert.setClassName(words[i+1]);
                inhert.setDirectInheritance(nDI);
                inhert.setIndirectInheritance(indirect);
                inheritanceList.add(inhert);
            }else{
            
            }
        }
        
    }
    
    br.close();
    fr.close();
    return inheritanceList;
    
    }
    
    
    
}
