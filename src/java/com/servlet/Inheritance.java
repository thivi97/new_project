/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.model.InheritanceMethod;
import com.controller.InheritanceController;


/**
 *
 * @author User
 */
@WebServlet(name = "Inheritance", urlPatterns = {"/Inheritance"})
public class Inheritance extends HttpServlet {
    
    InheritanceController inheritance = new InheritanceController();
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Inheritance</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Inheritance at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       ArrayList<InheritanceMethod> lists = new ArrayList<InheritanceMethod>();
       
       response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       for(int i = 1; i <= 5; i++){
           InheritanceMethod inheritanceMethod = new InheritanceMethod();
           inheritanceMethod.setId("I" + i);
           
           inheritanceMethod.setWeight(Integer.parseInt(request.getParameter("I" + i)));
           
           lists.add(inheritanceMethod);
           
           out.println("I" + i + " = " + request.getParameter("I" + i));
       }
       
       for(InheritanceMethod inheritance1 : lists){
           out.println(inheritance1.getId() + " " + inheritance1.getWeight());
       }
       
       int result = inheritance.updateInheritance(lists);
       System.out.println("res- "+request);
       if(result == 1){
           response.sendRedirect("inheritanceweight.jsp");
       }
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
