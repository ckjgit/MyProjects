<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Employee_Login.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Login</title>
<link rel = "icon" href = "images/NicePng.png" 
        type = "image/x-icon">
    
</head>
<body>
		 <br><br><br><br><br><br>
     <div class="regform"> <h1>Sign In</h1></div>
     <div class="main">
        <form action="./s017" method="get">
        
            <h2 class="name">USER NAME</h2> 
            <input type="text" name="uname" class="number">
            
        
            <h2 class="name">PASSWORD</h2>
            <input type="password" name="pass" class="password">
            
            <input type="submit" class="button" value="LOG IN">

            <div class="anchor">
                <a href="">Forget Password ?<br></a>
            </div>
            <div class="anchor">
                <a href="index.html"><br>HOME</a>
            </div>
            
        </form>
     </div>
     <br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>