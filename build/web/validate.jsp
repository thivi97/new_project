<%-- 
    Document   : validate
    Created on : 26-Mar-2020, 22:25:12
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
            try{
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CodeComplexity" + "user=root&password=");
                PreparedStatement pst = conn.prepareStatement("Select uname,pwd from login where uname=? and pwd=?");
                pst.setString(1,username);
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();
                if(rs.next())
                    out.println("Valid login");
                else
                    out.println("Invalid login");
                       
            
            }
            catch(Exception e){
                out.println("Something went wrong!! Please try again");
                e.printStackTrace();
            }
            
            
            
            
            
            
            
            
            %>
    </head>
    <body>
        
    </body>
</html>
