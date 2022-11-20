<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <%@page import= "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Airline Reservation System </title>
	
	<style type = "text/css">
		<%@include file = "CSS/payment.css" %>
		table, th, td{
			border : 1px solid black;
		}
		td{
	        height : 40px;
	    }
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
    	<div class="regform"> <h1> Make Payment </h1></div>
    	<br><br><br><br>
    	
    	<b>Total Payable Amount : </b>
    	<%! String s1="";
			int d=0;
			int traveller01=0; 
			int price=0;    	
    	
    	%>
    	
    	<%
    	
    	try
    	{
    		 	
    		 ServletContext context = request.getServletContext();
    		 	
    	    	String from=(String)context.getAttribute("from");
    	    	String to=(String)context.getAttribute("to");
    	    	String t_class=(String)context.getAttribute("t_class");
    	    	
    	    	

    	    	Class.forName("com.mysql.jdbc.Driver");
    	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
    	    	
    			Statement st = con.createStatement();
    			
    			String ss="select f_price from Search_Flight where f_from='"+from+"' and f_to='"+to+"' and f_class='"+t_class+"'   ";
    	    	
    			
    			ResultSet rs=st.executeQuery(ss);
    			while(rs.next()!=false)
    			{
    				
    				s1=rs.getString("f_price");
    				
    				price=Integer.parseInt(s1);
        	    	
    			}
    			
    			int x=Integer.parseInt((String)context.getAttribute("traveller"));
    	    	
    	    	d=x * price;
    			
    	    	context.setAttribute("final_price",d);
    	}
    	
    	catch(Exception e){
    		out.print(e);
    	}
    	
    	%>
    	
    	<%=d%>
    	<br><br><br>
    	<form action="./Printout.jsp" method = "get">
    	
   		<table class = "table" style = "width=100%" >
   			<tr>
   				<td>Card No. : * <input type ="text" required></td>
   			</tr>
   			<tr>
   				<td> Name On Card : * <input type ="text" required></td>
   			</tr>
   			<tr>
   				<td> Expiry : * <input type ="text" required></td>
   			</tr>
   			<tr>
   				<td> CVV : * <input type ="password" required></td>
   			</tr>
   		</table>
   		<br><br>
   		<br><br>
   		
   				<td><input type ="Submit" value = "Pay Now"></td>
   		<br>
   		
   		</form>
   		<br>
   		<div class="regform2"> <a href="#"></a></div>
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