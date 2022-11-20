
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
      
        
        
      
        
        <table width="1450" height="700">
            <tr height="10%">
                <td colspan="2" bgcolor="lightgreen">
                    <%@include file="header.jsp" %>
                </td>
            </tr>
            
            <tr height="85%">
                <td width="20%" bgcolor="lightyellow"> <%@include file="menu.jsp" %> </td>
                <td width="80%" bgcolor="lightcyan"> <%@include file="meter_entry.jsp" %> </td>
            </tr>
            
            <tr height="5%">
                <td colspan="2" bgcolor="lightblue">
                    <%@include file="footer.jsp" %>
                </td>
            </tr>
        </table>   
    </body>
</html>