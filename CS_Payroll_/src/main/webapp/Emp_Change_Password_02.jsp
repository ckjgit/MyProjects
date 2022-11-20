<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body bgcolor="lightblue"><br><br><br><hr>

<center>


	<%!
			String uname=null;
			String old_pass=null;
			String new_pass=null;
			String cnfm_pass=null;
	%>
	
	
	<%
	
		uname=request.getParameter("uname");
		old_pass=request.getParameter("cpass");
		new_pass=request.getParameter("npass01");
		cnfm_pass=request.getParameter("npass02");
		
		String uuname=null;
		String uupass=null;
		
		try
		{
			
			


		//--------------------------------------DataBase Create and Link--------------------------------

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(" select * from employee where euserid='"+uname+"'    ");
			while(rs.next()!=false){
				 uuname=rs.getString("euserid");
				 uupass=rs.getString("epass");
			}
			
			
			if(uname.equals(uuname) && old_pass.equals(uupass)){
				
				
				String s="update employee  set epass='"+cnfm_pass+"' where euserid='"+uname+"' ";
				
				int i=st.executeUpdate(s);
				
				if(i>=0){
					
					out.print("<font size='5' color='blue'>Congratulations..</font>");
					out.println("<font size='5' color='blue'>Password Updated..!!</font>");
					response.setHeader("refresh", "5;URL=Emp_Change_Password_Include01.jsp");
				}
				else{
					out.println("<font size='5' color='red'>Opps...Password Not Updated..!!</font>");
					response.setHeader("refresh", "5;URL=Emp_Change_Password_Include01.jsp");
				}
			}
			
			else{
				out.println("<font size='5' color='red'>Opps...Either Username or Old Password Mismatch..!!</font>");
				response.setHeader("refresh", "5;URL=Emp_Change_Password_Include01.jsp");
			
			}
				
			
				
			
			
		}
		//catch(ServletException e){out.print(e.getMessage());}
		catch(Exception e){out.print(e.getMessage());out.print("<br>Error Throws..");}
		
	
	%>
	
	</center>

</body>
</html>