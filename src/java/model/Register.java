/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class Register {
    
    private String fname;
    private String lname;
    private String uname;
    private String email;
    private String password;
    
    public String getFname(){
        return fname;
    }
    
    public void setFname(String fname){
        this.fname = fname;
    }
    
    public String getLname(){
        return lname;
    }
    
    public void setLname(String lname){
        this.lname = lname;
    }
    
    public String getUname(){
        return uname;
    }
    
    public void setUname(String uname){
        this.uname = uname;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
}
