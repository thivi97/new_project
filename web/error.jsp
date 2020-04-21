<%-- 
    Document   : error
    Created on : 31-Mar-2020, 21:43:48
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <% String msg = (String)request.getAttribute("msg"); %>
        <h1>Upload Error</h1>
        <h2>Message: <%=msg %></h2>
    </body>
</html>
