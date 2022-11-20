<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import= "java.sql.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Airline Reservation System </title>
	
	<style type = "text/css">
	
	<%@include file = "CSS/book01.css" %>
	<%-- table, th, td{
		border : 1.5px solid black;
	}
	td,th{
        		height : 40px;
        	}   --%>
	a{text-decoration : none;}
	</style>
</head>

<body>
	<header>
        <h1>AIRLINE RESERVATION SYSTEM</h1>
    </header>

    <nav>
        <a href="Index02.jsp">Home</a>
        <a href="index.jsp">Logout</a>
    </nav>

    <main class = "main">
    
   
    
    	<div class="regform"> <h1> FLIGHT DETAILS </h1></div>
    	<br><br><br><br><br><br><br><br><br><br>
   		<table class = "table" style = "width=100%">
   			<tr>
   				<td>From : <input type ="text" value="<%=request.getParameter("from") %> "></td>
   				<td> To : <input type ="text" value="<%=request.getParameter("to") %> "></td>
   				<td> Traveller : <input type ="text" value="<%=request.getParameter("traveller") %> "></td>
   				<td colspan = "2"> Class : <input type ="text" value="<%=request.getParameter("t_class") %> "></td>
   			</tr>
   			<tr colspan = '4' rowspan = '4' >A</tr>
   			<tr colspan = '4' rowspan = '4' >B</tr>
   			<tr colspan = '4' rowspan = '4' >C</tr>
   			<tr colspan = '4' rowspan = '4' >D</tr>
   			<tr>
   				<th> Flight Name </th>
   				<th> Boarding At</th>
   				<th> Arrived At </th>
   				<th> Price </th>
   				<th>       </th>
   			</tr>
   			
   			
   			
   			<%!
   			ResultSet rs;
   			ResultSet rs2;
   			
   			
   			%>
   			
   			 <%
    try{
    	String from=request.getParameter("from");
    	String to=request.getParameter("to");
    	String date=request.getParameter("date");
    	String traveller=request.getParameter("traveller");
    	String t_class=request.getParameter("t_class");
    	
			
		ServletContext context = request.getServletContext();
			context.setAttribute("from",from);
			context.setAttribute("to",to);
			context.setAttribute("date",date);
			context.setAttribute("t_class",t_class);
			context.setAttribute("traveller",traveller);
			
		
    	
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
		
		Statement st1 = con.createStatement();
		
		Statement st2 = con.createStatement();
		
		String ss="select * from Search_Flight where f_from='"+from+"' and f_to='"+to+"' and f_class='"+t_class+"'   ";
    	
	
		 rs=st1.executeQuery(ss);
		
		 rs2=st2.executeQuery(ss);
		
		String from1=null;

		String to1=null;
		
		
		String v1=null;
		
		while(rs2.next()!=false){
			
			from1=rs2.getString(1);
			to1=rs2.getString(2);
			
			
		}
		
		rs2.close();
		
		
		
		
		
		
		if(from.equals(from1) && to.equals(to1))
		{
			System.out.print(rs);
			
			while(rs.next()!=false){
			
			context.setAttribute("f_name",rs.getString(3));
			context.setAttribute("boarding",rs.getString(4));
    %>
   			
   			<tr>
   				<td><%=rs.getString(3) %></td>
   				<td><%=rs.getString(4) %></td>
   				<td><%=rs.getString(5) %></td>
   				<td><%=rs.getString(6) %></td>
   				<td>
   				
   				
   					<form action="Add_Passenger.jsp" method="post">
   					
   					<%!
   					String s1=null;
   					String s2=null; String s3=null; String s4=null;
   					
   					%>
	   					
	   				<%
	   					
	   					 s1=rs.getString(3);
	   					 s2=rs.getString(4);
	   					 s3=rs.getString(5);
	   					 s4=rs.getString(6);
	   					
	   						
	   				%>
	   				<input type="hidden" readonly name="f_name" value='"+s1+"' />
	   				<input type="hidden" readonly name="f_arrival" value='"+s2+"' />
	   				<input type="hidden" readonly name="f_departure" value='"+s3+"' />
	   				<input type="hidden" readonly name="f_price" value='"+s4+"' />
	   				
   					<input type="submit" value="BOOK"/>
   				</form>
   				
   				</td>
   			</tr>
   			
   			<%
			}
			

		}
		else
		{
			out.print("There is no Flight Between Source And Destintion...");
		}
		
   	 }
    catch(Exception e)
    {out.print(e);e.printStackTrace();}
   			
   			%>
   			
   		</table>
   		<br><br><br><br><br><br>
   		<a href="search2.jsp">Go Back</a>
   		<br><br><br>
   		<div class="regform2"> <h1></h1></div>
    </main>

    <footer>
        <a href="#">FAQ</a>
        <a href="#">Contact Us</a>
        <a href="#">Terms of Use</a>
        <a href="#">Privacy Policy</a>
        <a href="#">Refund Policy</a>
        <a href="#">&copy; CSM ENTITY Pvt. Ltd. </a>
    </footer>
</body>
</html>