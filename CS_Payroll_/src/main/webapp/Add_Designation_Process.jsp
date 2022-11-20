<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.sql.*" %>
    <%@ page import="java.io.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Designation Submitted</title>

	<style>
	a{
		text-decoration:none;
	}
	
	table, th, td {
	  border: 1px solid white;
	  border-collapse: collapse;
	  border: 1px solid black;
  	border-radius: 10px;
	}
	
	</style>
	
	<link href="//fonts.googleapis.com/css?family=Righteous" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Mukta+Mahee:200,300,400,500,600,700,800" rel="stylesheet">
    <!-- //web-fonts -->

</head>
<body>

<center>

		
		
	<%! 
	
	public static int count=5;
	
	
	%>

	<%
	
	String vdesig=request.getParameter("designation");
	String vbasic=request.getParameter("basicpay");
	String vsalary=request.getParameter("salary");
	String vtravel=request.getParameter("travel");
	String vdearness=request.getParameter("dearness");
	String vmedical=request.getParameter("medical");
	 String vhra=request.getParameter("hra");
	
	 
	try
	{
		
		


	//--------------------------------------DataBase Create and Link--------------------------------

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
		
		Statement st=con.createStatement();
		String s="insert into designation values (  '"+vdesig+"', '"+vbasic+"', '"+vsalary+"', '"+vtravel+"', '"+vdearness+"','"+vmedical+"', '"+vhra+"')   ";
		
		int i=st.executeUpdate(s);
		
		if(i>=0){
			
			out.print("<font size='5' color='violet'>Congratulations..</font>");
			out.println("<font size='5' color='violet'>Designation Updated..!!</font>");
		}
		else{
			out.println("Opps...Designation Not Updated..!!");
		}
			
		
		
	}
	//catch(ServletException e){out.print(e.getMessage());}
	catch(Exception e){out.print(e.getMessage());out.print("<br>Error Throws..");}
	

	
	
	
	
	%>
<hr><br><br>
		<table width="80%">
		
			<tr>
				<th>Designation</th>
				<th>Basic Pay</th>
				<th>Salary</th>
				<th>Travel Allowance</th>
				<th>Dearness Allowance</th>
				<th>Medical Allowance</th>
				<th>HRA</th>
			</tr>
			
						
			
			<tr>
				<td><%= vdesig %></td>
				<td><%= vbasic %></td>
				<td><%= vsalary %></td>
				<td><%= vtravel %></td>
				<td><%= vdearness %></td>
				<td><%= vmedical %></td>
				<td><%= vhra %></td>
			</tr>
			
		
		</table>
		
		
		<br><br><br>
		
		
		<a href="./s04" ><font color="blue" size="5">BACK</font></a>
		</center>
</body>
</html>