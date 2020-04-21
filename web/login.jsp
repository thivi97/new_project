<%-- 
    Document   : login
    Created on : 24-Mar-2020, 19:53:29
    Author     : User
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/log.css" type="text/css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Play">
           
    </head>
    
        <div class="signin">
            <form name="form" method="post" action="LoginServlet" onsubmit="return validate()">
                <h2 style="color: #fff;">Log In</h2>
                <input type="text" name="uname" placeholder="Username" required><br /><br />
                <input type="password" name="password" placeholder="Password" required><br /><br />
                
                  <input type="submit" value="Log In" /><br /><br />
                <div id="container">
                    <a href="reset.jsp" style="margin-right: 0px; font-size: 13px; font-family: Tahoma, Geneva, sans-serif;">Reset Password</a>
                    <a href="forget.jsp" style="margin-left: 30px; font-size: 13px; font-family: Tahoma, Geneva, sans-serif;">Forget Password</a>
                </div><br /><br /><br /><br /><br /><br />
                Don't have account?<a href="signup.jsp" style="font-family:'Play',sans-serif;">&nbsp;Sign Up</a>
            </form>
                
        </div>
        
        <script type="text/javascript">
            function validate(){
                
                var uname = document.form.uname.value;
                var password = document.form.password.value;
                
                if(uname == "" || uname == null){
                    alert("Username cannot be blank");
                    return false;
                }
                
                else if(password == "" || password == null){
                    alert("Password cannot be blank");
                    return false;
                }
                
            }
        </script>
              
    

