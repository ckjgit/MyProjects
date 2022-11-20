<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Airline Reservation System </title>
	
	<style type = "text/css">
	
	<%@include file = "CSS/search2.css" %>
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

    <main>
		<div class="regform"> <h1> SEARCH FLIGHT </h1></div>
     <div class="main">
     
        <form  action="book01.jsp" method="post">
            
            <div class="row">
            <div class="col-sm-6">
            <h2 class="name">FROM : </h2>
            	<select class="option" id="select" name="from" required = "">
                    <option value="" disabled="" selected="">City/Airport</option>
                    <option value="New Delhi">New Delhi</option>
                    <option value="Mumbai">Mumbai</option>
                    <option value="Bangalore">Bangalore</option>
                    <option value="Bhubaneswar">Bhubaneswar</option>
                    <option value="Kolkata">Kolkata</option>
                    <option value="Lucknow">Lucknow</option>
                    <option value="Hyderabad">Hyderabad</option>
                </select> 
            </div>
            <div class="col-sm-6">
            <h2 class="name">TO : </h2> 
            	<select class="option" id="select" name="to" required = "">
                    <option value="" disabled="" selected="">City/Airport</option>
                    <option value="New Delhi">New Delhi</option>
                    <option value="Mumbai">Mumbai</option>
                    <option value="Bangalore">Bangalore</option>
                    <option value="Bhubaneswar">Bhubaneswar</option>
                    <option value="Kolkata">Kolkata</option>
                    <option value="Lucknow">Lucknow</option>
                    <option value="Hyderabad">Hyderabad</option>
                </select> 
        	</div>
        	
        	<div class="col-sm-6">
        	 	<h2 class="name" >Depart On : </h2> 
            	<input placeholder="&#xf073; Departure Date" type="date" id="date-picker-example" name="date" class="option" style="font-family:Arial, FontAwesome" required = ""> 
            </div>
        </div>

            <h2 class="name">Traveller :</h2>
            <select class="option" id="traveller" name="traveller" required = "">
                <option disabled="disabled" selected= "selected">Traveller</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
            </select>
			<br><br><br>
		<div class="travel-class"> 
            <label class="radiobtn"><input type="radio" name="t_class" value="Economy" required = ""> Economy </label> &nbsp; &nbsp;
            <label class="radiobtn"><input type="radio" name="t_class" value="Business" required = ""> Business </label>
        </div>

            <button type="submit">SEARCH</button>
        </form>
     </div>
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