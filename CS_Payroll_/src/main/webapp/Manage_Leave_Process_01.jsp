<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Change_Password.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body bgcolor="lightblue">
	<form action="GR_Leave.jsp" method="get">
	<center>
	<h1 class="Title">Pending Leaves</h1>
    <hr><br>
		<table class = "table" style = "width=100%">
		<tr>
	   				<th> Emp. ID</th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	   				<th> Leave Type</th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	   				<th> From Date </th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	   				<th> To Date</th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	   				<th> Duration</th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	   				<th>     </th>
	   				<th>     </th>
	   	</tr>
	   	<%!
	   		String vid=null;
	   		String ltype=null;
	   	
	   	%>
	
			<%
			
				try
				{
					
				//--------------------------------------DataBase Create and Link--------------------------------
				
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
					
					Statement st=con.createStatement();
					String s="select * from employee_lev where status='"+"pending"+"'   ";
					
					ResultSet rs=st.executeQuery(s);
					while(rs.next()!=false){
					 vid=rs.getString(1);
					 ltype=rs.getString(2);
					 
			%>
			<tr>
					<td><%=rs.getString(1)%>&nbsp;&nbsp;&nbsp;</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><%=rs.getString(2)%></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><%=rs.getString(3)%></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><%=rs.getString(4)%></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><%=rs.getString(5)%> &nbsp; days</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>
	   				
	   				<input type="radio" name="LGR" required value="granted"><label>GRANT</label>
	   				<input type="radio" name="LGR" required value="revoked"><label>REVOKE</label>
	   				</td>
	   					
		   			
		   			<td>	
		   				<input type="hidden" readonly name="eid" value='<%= rs.getString(1) %>' />
		   				<input type="hidden" readonly name="ltype" value='<%= rs.getString(3) %>' />
		   				&nbsp;&nbsp;&nbsp;
	   					<input type="submit" value="SUBMIT"  />
	   				</td>
			</tr>
		
			<% 
					}
					
					
					
					
					
					
				}
				catch(Exception e){out.print(e.getMessage());out.print("<br>Error Throws..");}
				
				
				
				
				
			%>
			</table><br>
	</center>
	</form>
</body>
</html>