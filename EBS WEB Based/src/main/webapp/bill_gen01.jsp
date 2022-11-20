<%-- 
    Document   : bill_gen01
    Created on : 22 Jan, 2022, 5:26:07 PM
    Author     : chinm
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        
        <br>
        <form action="./bill03" method="get">
            
              Choose Consumer Number :
            <select name="combobox" id="s1">
                <option>Select</option>
                
        <%! String s1=null;  %>
        
        <%
        Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
		Statement st=con.createStatement();
                    
                    String ss=" select * from consumer007 ";
                    ResultSet rs=st.executeQuery(ss);
                    
                    while(rs.next()!=false)
                    {
                       %>
                       
                           <option><%=rs.getString("consumer_no") %></option>
                        
                      <%
                         
                   }
                    %>
             
                        
            </select> 
                    <br><br>
                    Enter Final Reading : <input type="text" name="fr" placeholder="Enter Final Reading" /><br><br>
                    Enter Final Reading Date : <input type="date" name="dt2"/><br><br><br>
        
        <input type="submit" value="Next"/>
        </form>
    </center>
       
    </body>
</html>
