<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*" %>
    <%@page import= "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Airline Reservation System </title>
	
	<style type = "text/css">
	
	<%@include file = "CSS/Add_Passenger.css" %>
	
	td, th{
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
    	<div class="regform"> <h1> Add Passenger </h1></div>
    	<br>
    	
    	<form action="./Add_Passenger_02.jsp" method ="get">
    	<table class = "table1" style = "width=100%">
    		
   		 <tr>
   				
   				<td>
   				
   				
   				</td>
   			</tr>
   			
   			
    	
    	</table>
    	
   		<table class = "table" style = "width=100%" >
   			<tr>
   				<td>Name : <input type ="text" name = "name" required></td>
   			</tr>
   			<tr>
   				<td> Age : <input type ="text" name = "age" required></td>
   			</tr>
   			<tr>
   				<td> 
   					<div class="travel-class"> 
            			<label class="radiobtn"><input type="radio" name="gender" value="Male"> Male </label> &nbsp; &nbsp;
            			<label class="radiobtn"><input type="radio" name="gender" value="Female"> Female </label> &nbsp; &nbsp;
            			<label class="radiobtn"><input type="radio" name="gender" value="Transgender"> TransGender </label>
        			</div>
   				</td>
   			</tr>
   			<tr>
   				<td> Berth Preference : 
   					<select class="option" id="traveller" name = "berth">
		                <option disabled="disabled" selected= "selected">Select Preferences</option>
		                <option>Asile</option>
		                <option>Middle</option>
		                <option>Window</option>
            		</select>
   				</td>
   			</tr>
   			<br>
   			<tr>
   				<br>
   				
   					
   				 <td><input type ="Submit" value = "NEXT"></td>
   			
   				<br><br>
   			</tr>
   		</table>
   		</form>
   		
   		<br>
   		
   		<br><br><br><br><br>
   		
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