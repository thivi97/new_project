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


import model.Login;
import dao.LoginDao;


/**
 *
 * @author User
 */
public class LoginServlet extends HttpServlet {
    
    public LoginServlet(){
    
    }
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        
        String uname = request.getParameter("uname");
        String password = request.getParameter("password");
        
        Login login = new Login();
        
        login.setUname(uname);
        
        LoginDao loginDao = new LoginDao();
        
        String userValidate = loginDao.authenticateUser(login);
        
        if(userValidate.equals("SUCCESS")){
            request.setAttribute("Username", uname);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
        else{
            request.setAttribute("errMessage", userValidate);
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }
        
    }
    
}
