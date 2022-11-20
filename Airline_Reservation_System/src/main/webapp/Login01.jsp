<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Airline Reservation System </title>
	
	<style type = "text/css">
	<%@include file = "CSS/Login01.css" %>
	</style>
</head>

<body>
	<header>
        <h1>AIRLINE RESERVATION SYSTEM</h1>
    </header>

    <nav>
        <a href="index.jsp">Home</a>
        
    </nav>

    <main>
			<div class="banner_bottom">
		<div class="container">
				<div class="tittle-w3ls_head">
				<h3 class="tittle-w3ls three">LogIn to <span>Your Account</span></h3>
			</div>
			<div class="inner_sec_info_wthree_agile">
				<div class="signin-form">
					<div class="login-form-rec">
						<form action="Index02.jsp" method="post">
							<input type="text" name="uid" placeholder="User Id" required="">
							<input type="password" name="password" placeholder="Password" required="">
							<div class="tp">
								<input type="submit" value="LogIn">
							</div>
						</form>
					</div>
					<br><br><br>
					<p><a href="Signup.jsp"> Don't have an account?</a></p>
				</div>
			</div>
		</div>
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