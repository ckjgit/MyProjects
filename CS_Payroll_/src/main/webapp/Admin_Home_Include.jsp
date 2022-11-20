
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        
        <title>Admin Home</title>
        <link rel = "icon" href = "images/NicePng.png" 
        type = "image/x-icon">
    
    </head>
    <body>
        
        <table width="100%" height="780">
            <tr height="10%" width="100%">
                <td colspan="2" >
                    <%@include file="Admin_Header.html" %>
                </td>
            </tr>
            
            <tr height="85%">
                <td width="20%" bgcolor="lightyellow"> <%@include file="Admin_Menu.jsp" %> </td>
                <td width="80%" bgcolor="lightcyan"> <%@include file="Admin_Home.jsp" %> </td>
            </tr>
            
            <tr height="5%">
                <td colspan="2" bgcolor="lightblue">
                    <%@include file="Admin_Footer.html" %>
                </td>
            </tr>
        </table>   
    </body>
</html>