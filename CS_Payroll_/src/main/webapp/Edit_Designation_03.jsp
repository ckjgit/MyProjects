<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<center>
	
	
		
	
		<%
			String vdesig=request.getParameter("designation_02");
			
			String vbasicpay=request.getParameter("basicpay");
			String vsalary=request.getParameter("salary");
			String vta=request.getParameter("travel");
			String vda=request.getParameter("dearness");
			String vma=request.getParameter("medical");
			String vhra=request.getParameter("hra");
			
			
			try
			{
				
			

		
			//--------------------------------------DataBase Create and Link--------------------------------
		
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
				
				Statement st=con.createStatement();
				String s="update designation set   basic_pay='"+vbasicpay+"', salary='"+vsalary+"', travel='"+vta+"', dearness='"+vda+"', medical='"+vma+"', hra='"+vhra+"'  where  designation='"+vdesig+"' ";
				
				int i=st.executeUpdate(s);
				
				if(i>=0){
					
					out.print("<font size='5' color='Red'>Congratulations..</font>");
					out.println("<font size='5' color='Red'>Designation Updated..!!</font>");
					
					response.setHeader("refresh", "5;URL=Edit_Designation_Include_01.jsp");
				}
				else{
					out.println("<font size='5' color='Red'>Opps...Designation Not Updated..!!</font>");
					
					response.setHeader("refresh", "5;URL=Edit_Designation_Include_01.jsp");
				}
					
				
				
			}
			//catch(ServletException e){out.print(e.getMessage());}
			catch(Exception e)
				{out.print(e.getMessage());out.print("<br>Error Throws..");}
			
		
		
		
		%>
	
	
	
	</center>


</body>
</html>