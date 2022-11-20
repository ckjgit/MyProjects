<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Employee_Leave.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 class="Title">Leave Report</h1>
	<center>
	
    <hr><br>
		<table class = "table" style = "width=100%">
		<tr>
	   				<th> Emp. ID</th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	   				<th> Leave Type</th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	   				<th> From Date </th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	   				<th> To Date</th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	   				<th> Duration</th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	   				<th> Status   </th>
	   				<th>     </th>
	   	</tr>
	   	<%!String vid=null; %>
	
			<%
				ServletContext con1=request.getServletContext();
				vid=(String)con1.getAttribute("k2");
				try
				{
					
				//--------------------------------------DataBase Create and Link--------------------------------
				
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
					
					Statement st=con.createStatement();
					String s="select * from employee_lev where status='"+"pending"+"' and e_id="+vid;
					
					ResultSet rs=st.executeQuery(s);
					while(rs.next()!=false){
					 vid=rs.getString(1);
			%>
			<tr>
					<td><%=rs.getString(1)%></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><%=rs.getString(2)%></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><%=rs.getString(3)%></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><%=rs.getString(4)%></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><%=rs.getString(5)%> &nbsp; days</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><%=rs.getString(7)%></td>
	   				
			</tr>
		
			<% 
					}
					
					
					
					
					
					
				}
				catch(Exception e){out.print(e.getMessage());out.print("<br>Error Throws..");}
				
				
				
				
				
			%>
			</table><br>
	</center>
	
</body>
</html>