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
				<h3 class="tittle-w3ls three">Sign Up <span>Now</span></h3>
			</div>
			<div class="inner_sec_info_wthree_agile">
				<div class="signin-form">
					<div class="login-form-rec">
						<form action="./Signup02.jsp" method="post">
							<input type="text" name="name" placeholder="Name" required="">
							<input type="text" name="mobile" placeholder="Mobile" required="">
							<input type="text" name="user_id" placeholder="User Id" required="">
							<input type="password" name="password" id="password" placeholder="Password" required="">
							<input type="submit" value="Sign Up">
						</form>
					</div>
					<p class="reg"><a href="#"> By clicking Signup, I agree to your terms</a></p>

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