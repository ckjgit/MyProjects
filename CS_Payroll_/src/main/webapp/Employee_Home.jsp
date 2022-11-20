<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Employee_Home.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
		 <br>
    <h1 class="Title">Employee Home</h1>
    <hr>
    
    <%!
    	String name=null;
    	int total_leave=0;
    	int approved_leave=0;
    	int cancelled_leave=0;
    
    %>
    
    <%
    
    ServletContext cont=request.getServletContext();
	
	
    name=(String)cont.getAttribute("k1");
	
	out.print("<h2 class='lb1'>Welcome  "+name+"</h2>");%>
	
	
	<%
	
		try
		{
			
			
		
		
		//--------------------------------------DataBase Create and Link--------------------------------
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
			
			Statement st2=con.createStatement();
			ResultSet rs2=st2.executeQuery(" select * from generate_salary where ename='"+name+"'  ");
			String eid=null;
			while(rs2.next()!=false)
				eid=rs2.getString(1);
			
			
			/* Statement st3=con.createStatement();
			ResultSet rs3=st3.executeQuery(" select ename from generate_salary where eid='"+eid+"'  ");
			String ename=null;
			while(rs2.next()!=false)
				ename=rs2.getString("2"); */
			
			
			
			
		
			
			
			
			Statement st3=con.createStatement();
			ResultSet rs3=st3.executeQuery(" select count(*) from employee_lev where e_id='"+eid+"'  ");
			while(rs3.next()!=false)
				total_leave=rs3.getInt(1);
			
			String granted2="granted";
			
			Statement st4=con.createStatement();
			ResultSet rs4=st4.executeQuery(" select count(*) from employee_lev where e_id='"+eid+"' and status='"+granted2+"' ");
			while(rs4.next()!=false)
				approved_leave=rs4.getInt(1);
			
			
			String revoked="revoked";
			
			Statement st5=con.createStatement();
			ResultSet rs5=st5.executeQuery(" select count(*) from employee_lev where e_id='"+eid+"' and status='"+revoked+"' ");
			while(rs5.next()!=false)
				cancelled_leave=rs5.getInt(1);
			
			
		}
		//catch(ServletException e){out.print(e.getMessage());}
		catch(Exception e)
			{out.print(e.getMessage());out.print("<br>Error Throws..");e.printStackTrace();}
		
		
		
		
		
		
	%>
	
   
    
<center>

<table class="table01">
    <tr>
        <td>
            <div class="box">
                <h3 class="lb1">Total Leave</h3>
                <hr>
                <h1 class="lb1"><%=total_leave %></h1>
            </div>
        </td>

        <td>
            <div class="box">
                <h3 class="lb1">Approved Leave</h3>
                <hr>
                <h1 class="lb1"><%=approved_leave %></h1>
            </div>
        </td>

        <td>
            <div class="box">
                <h3 class="lb1">Cancelled Leave</h3>
                <hr>
                <h1 class="lb1"><%=cancelled_leave %></h1>
            </div>
        </td>
    </tr>

    <tr>
        <td>
            <div class="box">
                <h3 class="lb1">Last Salary</h3>
                <hr>
                <h1 class="lb1">30550</h1>
            </div>
        </td>

        <td>
            <div class="box">
                <h3 class="lb1">Allowance</h3>
                <hr>
                <h1 class="lb1">5100</h1>
            </div>
        </td>

        <td>
            <div class="box">
                <h3 class="lb1">Deduction</h3>
                <hr>
                <h1 class="lb1">2700</h1>
            </div>
        </td>
    </tr>
</table>

</center>
</body>
</html>