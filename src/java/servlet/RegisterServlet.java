/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Register;
import dao.RegisterDao;


/**
 *
 * @author User
 */
public class RegisterServlet extends HttpServlet{
    
    public RegisterServlet(){
    
    }
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String uname = request.getParameter("uname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        Register register = new Register();
        
        register.setFname(fname);
        register.setLname(lname);
        register.setUname(uname);
        register.setEmail(email);
        register.setPassword(password);
        
        RegisterDao registerDao = new RegisterDao();
        
        String userRegistered = registerDao.registerUser(register);
        
        if(userRegistered.equals("SUCCESS")){
            request.getRequestDispatcher("/Home.jsp").forward(request, response);
        }
        else{
            request.setAttribute("errMessage", userRegistered);
            request.getRequestDispatcher("/signup.jsp").forward(request, response);
        }
        
    }
    
}
