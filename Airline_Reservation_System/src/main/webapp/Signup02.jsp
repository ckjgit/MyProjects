<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import= "java.sql.*" %>
<%@ page import="java.io.*" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Verify Page</title>
</head>
<body>
	<%
	try
	{
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String userid = request.getParameter("user_id");
		String password = request.getParameter("password");
		

    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
    	
		Statement st = con.createStatement();
		String q = "insert into ars_user values('"+name+"','"+mobile+"', '"+userid+"', '"+password+"')";
		int k = st.executeUpdate(q);
		
		if(k>=1)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Login01.jsp");
			rd.forward(request, response);
		}	
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("Signup.jsp");
			rd.forward(request, response);
		}
	
	}
	catch(Exception e){
		
		out.print(e);
	}
	
	%>
</body>
</html>