<%-- 
    Document   : AdminLog
    Created on : 3 Jan, 2022, 8:23:41 PM
    Author     : chinm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table, th, td{
                border :1px solid black;
                border-color: blueviolet    
            }
            div{
                background-color: lightgrey;
                width: 300px;
                border: 15px solid green;
                padding: 50px;
                margin: 20px;
            }
        </style>
    </head>
    <body>
    <center>
        <form action="./Admin_Validation.jsp" method="get" >
        <h1>Admin Log</h1>
        <div>
            <b>User ID  : </b><input type="text"  placeholder="Enter User Name" name="userid"/>
            <br><hr>
            <b>Password : </b><input type="text"  placeholder="Enter Password" name="pass"/>
            <br><hr>
            <input type="submit" value="Login"/>
        </div>
        <a href="index.jsp"><b>BACK</b></a>
       </form>
    </center>
        
    </body>
</html>
