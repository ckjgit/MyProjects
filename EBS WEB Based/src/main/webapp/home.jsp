<%-- 
    Document   : home
    Created on : 16 Jan, 2022, 8:51:43 PM
    Author     : chinm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
            ServletContext con=request.getServletContext();
		String cc=(String)con.getAttribute("k1");
		out.print("Welcome&nbsp;&nbsp;");		
            %>
            <b>
                <%= cc  %>
            </b>
    </center>
        
    </body>
</html>
