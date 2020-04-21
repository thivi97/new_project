/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


import model.FileToAnalyze;
import model.Inheritance;
import service.InheritanceService;



/**
 *
 * @author User
 */
@WebServlet(name = "UploadFileServlet", urlPatterns = {"/UploadFileServlet"})
public class UploadFileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public UploadFileServlet(){
        super();
    }
    
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Working...");
        
        try{
            String submitBtn = request.getParameter("submitBtn");
            
            InputStream inputStream = null;
            
            Part filePart = request.getPart("inheritance");
            Part filePart1 = request.getPart("size");
            Part filePart2 = request.getPart("method");
            Part filePart3 = request.getPart("variable");
            Part filePart4 = request.getPart("control");
            Part filePart5 = request.getPart("coupling");
            if(filePart != null || filePart1 != null || filePart2 != null || filePart3 != null || filePart4 != null || filePart5 != null){
                System.out.println(filePart.getName());
                System.out.println(filePart.getSize());
                System.out.println(filePart.getContentType());
                
                System.out.println(filePart1.getName());
                System.out.println(filePart1.getSize());
                System.out.println(filePart1.getContentType());
                
                System.out.println(filePart2.getName());
                System.out.println(filePart2.getSize());
                System.out.println(filePart2.getContentType());
                
                System.out.println(filePart3.getName());
                System.out.println(filePart3.getSize());
                System.out.println(filePart3.getContentType());
                
                System.out.println(filePart4.getName());
                System.out.println(filePart4.getSize());
                System.out.println(filePart4.getContentType());
                
                System.out.println(filePart5.getName());
                System.out.println(filePart5.getSize());
                System.out.println(filePart5.getContentType());
                
                inputStream = filePart.getInputStream();
                inputStream = filePart1.getInputStream();
                inputStream = filePart2.getInputStream();
                inputStream = filePart3.getInputStream();
                inputStream = filePart4.getInputStream();
                inputStream = filePart5.getInputStream();
                
                if(filePart.getSize() == 0 || filePart1.getSize() == 0 || filePart2.getSize() == 0 || filePart3.getSize() == 0 || filePart4.getSize() == 0 || filePart5.getSize() == 0){
                    request.setAttribute("msg","Selected file is empty or you have not selected a file");
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
                
            }
            
            InputStreamReader isReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(isReader);
            
            if("By Inheritance".equals(submitBtn)){
                System.out.println("inheritance");
                List<Inheritance> inheritance = new ArrayList<>();
                
                String linei;
                int x = 1;
                while((linei = reader.readLine()) != null){
                    Inheritance lineObj = new Inheritance();
                    lineObj.setLineNumber(x);
                    lineObj.setStatement(linei);
                    inheritance.add(lineObj);
                    x++;
                }
                
                InheritanceService inheritanceService = new InheritanceService();
                inheritance = inheritanceService.calculateCi(inheritance);
                request.setAttribute(statementList, inheritance);
                request.getRequestDispatcher("resultinheritance.jsp").forward(request, response);
            }
            
            else{
                System.out.println("Error");
                request.setAttribute("msg","Please try again");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
        catch(Exception e){
            System.out.println("Exception => UploadFileServlet");
            e.printStackTrace();
            
            request.setAttribute("msg", "Error in uploading");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

   

}
