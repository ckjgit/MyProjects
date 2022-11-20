<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Airline Reservation System </title>
	
	<style type = "text/css">
	<%@include file = "CSS/Printout.css" %>
	
	
	</style>
</head>

<body>
	<header>
        <h1>AIRLINE RESERVATION SYSTEM</h1>
    </header>

    <nav>
        <a href="Login01.jsp">Home</a>
        <a href="index.jsp">LogOut</a>
        
    </nav>

    <main>
		<div id = "printThisDiv">
		<br><br>
		
		<% ServletContext context = request.getServletContext(); %>
		<center>
			<h3>Welcome To CSM Airlines</h3>
			<hr width = 100%><br>
			<table width = '60%'>
				
				<tr>
					<td colspan = '3'>
						<b>Name of Passenger : </b><label><%= (String)context.getAttribute("1") %></label>
					</td>
				</tr>
				
				<tr>
					<td><b>Age : </b><label><%= (String)context.getAttribute("2") %></label></td>
					<td><b>Gender : </b><label><%= (String)context.getAttribute("3") %></label></td>
					<td><b>Berth : </b><label><%= (String)context.getAttribute("4") %></label></td>
				</tr>
				
				<tr>
					<td><b>Carrier : </b>CSM AIRLINES PVT. LTD. </td>
					<td colspan = '2'><b>Flight Name : </b><label><%= (String)context.getAttribute("f_name") %></label></td>
				</tr>
				
				<tr>
					<td><b>From : </b><label><%= (String)context.getAttribute("from") %></label></td>
					<td><b>To : </b><label><%= (String)context.getAttribute("to") %></label></td>
					<td><b>Class : </b><label><%= (String)context.getAttribute("t_class") %></label></td>
				</tr>
				
				<tr>
					<td><b>Date : </b><label><%= (String)context.getAttribute("date") %></label></td>
					<td><b>Boarding Time : </b><label><%= (String)context.getAttribute("boarding") %></label></td>
					<td><b>Gate : </b>K23</td>
				</tr>
				
				<tr>
					
					<td><b>ETKT</b> <b  id = "demo"></b></td>
					<td colspan = '2'><b>Price : </b><label><%=context.getAttribute("final_price") %></label></td>
				</tr>
			</table>
		
			<script type="text/javascript">
				let x= Math.floor((Math.random() * 100000000) + 1);
				document.getElementById("demo").innerHTML = x;
			</script>
			
			<br>
			<hr width = 100%>
			<h4> Gate Closes 40 minutes Before Departure </h4>
			<hr width = 100%>
			<h4> HAVE A NICE JOURNEY</h4>
			<hr width = 100%>
			<br>
        </center>
		</div>
		
		<input type="button" value="Print" onclick="printDiv('printThisDiv')" /> 
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

		<script>
            
            function printDiv(csm)
            {
            	var mywindow = window.open();
            	var content = document.getElementById(csm).innerHTML;
            	var realContent = document.body.innerHTML;
            	mywindow.document.write(content);
            	mywindow.document.close();
            	mywindow.focus();
            	mywindow.print();
                document.body.innerHTML = realContent;
                mywindow.close();
                return true;
            }
            
            
		</script>	
</html>