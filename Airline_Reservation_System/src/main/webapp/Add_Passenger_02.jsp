<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Passenger 02</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String berth = request.getParameter("berth");
	
		
		ServletContext context = request.getServletContext();
		
    	context.setAttribute("1",name);
		context.setAttribute("2",age);
		context.setAttribute("3",gender);
		context.setAttribute("4",berth);
		
		RequestDispatcher rd = request.getRequestDispatcher("payment.jsp");
		rd.forward(request, response);
		
		
		
		
		%>
</body>
</html>