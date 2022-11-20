
<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<html>
<head>
	<title>Admin Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8" />
    
    <!-- Add bootstrap cdn code link to the code -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

	<!-- Add awesome font CSS link to the code -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

	<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
	 
    <style>
	    
     /* provide styling to icons */
	     .fa { 
			float: left;
			font-size: 50px; 
			padding: 8px; 
			border: 1px solid #fff;
	     } 
	     
</style>
    
    
    
</head>

<body bgcolor="blue">

	<%! int eno=0;
		int active=0;
		int deactive=0;
		int deactive2=0;
		int pending3=0;
	
	
	
	%>
	
	<%
	
		try
		{
			
			
		
		
		//--------------------------------------DataBase Create and Link--------------------------------
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
			
			Statement st=con.createStatement();
			String s="SELECT COUNT(*) FROM EMPLOYEE";
			
			
			
			ResultSet rs=st.executeQuery(s);
			
			while(rs.next()!=false)
			{
				eno=rs.getInt(1);
			}
			
			String pending="pending";
			String revoked="revoked";
			
			int active02=0;
			Statement st2=con.createStatement();
			ResultSet rs2=st.executeQuery(" select count(*) from employee_lev where status='"+pending+"' or status='"+revoked+"' ");
			while(rs2.next()!=false)
					active02=rs2.getInt(1);
			
			
			
			
			String granted="granted";
			Statement st3=con.createStatement();
			ResultSet rs3=st.executeQuery(" select count(*) from employee_lev where status='"+granted+"'  ");
			while(rs3.next()!=false)
					deactive=rs3.getInt(1);
			
			active=eno-deactive;

			String revoked2="revoked";
			Statement st4=con.createStatement();
			ResultSet rs4=st.executeQuery(" select count(*) from employee_lev where status='"+revoked2+"'  ");
			while(rs4.next()!=false)
					deactive2=rs4.getInt(1);
			
			String pending2="pending";
			Statement st5=con.createStatement();
			ResultSet rs5=st.executeQuery(" select count(*) from employee_lev where status='"+pending2+"'  ");
			while(rs5.next()!=false)
					pending3=rs5.getInt(1);
			
			//  Creating Session object and passing value to it..
			HttpSession ses=request.getSession(true);
			ses.setAttribute("pending", pending3);
			ses.setAttribute("granted", deactive);
			ses.setAttribute("deactive", deactive2);
			
		}
		//catch(ServletException e){out.print(e.getMessage());}
		catch(Exception e)
			{out.print(e.getMessage());out.print("<br>Error Throws..");e.printStackTrace();}
		
		
		
		
		
		
	%>
	


<center>
<table>

	<tr>
		<td>
			<section class="row">
				<section class="col-md-3">
					<i class="fa fa-users"> </i><br>
					<h4 class="counter"> &nbsp;<%= eno %> </h4><br>
					<p> Employees</p>
				</section>
			</section>
			
		</td>
		
		<td>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</td>
		
		<td>
			<section class="row">
				<section class="col-md-3">
					<i class="fa fa-user-circle-o"> </i><br>
					<h4 class="counter"> <%=active %> </h4>
					<p>  &nbsp;&nbsp;&nbsp;&nbsp; Active </p>
				</section>
			</section>
		</td>
		
		<td>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</td>
		
		
		<td>
				<section class="row">
					<section class="col-md-3">
						<i class="fa fa-user-times"> </i><br>
						<h4 class="counter"> <%=deactive %></h4><br>
						<p> Deactive </p>
					</section>
				</section>
			</td>
		
		
		
		
	</tr>
	
	
	
	<tr>
		<td>
		<br><br>
		<br><br>
		</td>
	</tr>
	
	
	
	<tr>
		
		
		<td>
			
				<section class="row">
					<section class="col-md-3">
						<i class="fa fa-briefcase  "> </i><br>
						<h4 class="counter"> <%=deactive %> </h4><br>
						<p> Leave </p>
					</section>
				</section>
			</td>
		
		<td>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
		
		<td>
			<section class="row">
				<section class="col-md-3">
					<i class="fa fa-check-square-o"> </i><br>
					<h4 class="counter"> <%=deactive %> </h4><br>
					<p> Approved</p>
				</section>
			</section>
		</td>
			
			
			<td>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			
			<td>
			
				<section class="row">
					<section class="col-md-3">
						<i class="fa fa-window-close"> </i><br>
						<h4 class="counter"> <%=deactive2 %> </h4><br>
						<p> Rejected </p>
					</section>
				</section>
			</td>
			
			
			
			
			
	
	</tr>
</table>
	
	<section class="container counter-section">
		
	


		

		

	</section>
</center>
</body>
</html>