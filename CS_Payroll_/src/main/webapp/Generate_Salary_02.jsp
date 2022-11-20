<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Generate_Salary.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>

	<%!
		String fullname=null;
		String acno=null;
		String designation=null;
		String basicpay=null;
		String salary=null;
		String ta=null;
		String da=null;
		String ma=null;
		String hra=null;
		String eid=null;
	%>


		<%
		 eid=request.getParameter("eid");
		
		//--------------------------------------DataBase Create and Link--------------------------------
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
		
		Statement st=con.createStatement();
		String s="select * from employee where eid='"+eid+"' ";
		
		ResultSet rs=st.executeQuery(s);
		
		
		while(rs.next()!=false)
		{
			  fullname=rs.getString("ename");	  
			  acno=rs.getString("euserid");
			  designation=rs.getString("11");
		}
		
		
		
		Statement st02=con.createStatement();
		ResultSet rs02=st.executeQuery("select * from designation where designation='"+designation+"' ");
		
		while(rs02.next()!=false){
				basicpay=rs.getString("2");		da=rs.getString("5");
				salary=rs.getString("3");		ma=rs.getString("6");
				ta=rs.getString("4");			hra=rs.getString("7");
				
		}
		
		
		Statement st03=con.createStatement();
		ResultSet rs03=st.executeQuery("select * from employee_leave where e_id='"+eid+"' ");
		while(rs03.next()!=false){
			
		}
		
		
	}
	
	catch(Exception e){out.print(e.getMessage());out.print("<br>Error Throws..");}

	
	%>
</body>
</html>