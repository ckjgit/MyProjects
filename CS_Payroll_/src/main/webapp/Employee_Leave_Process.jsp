<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body bgcolor="lightblue">
	<br><br><br>
	
		<%

			try
			{

				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
				
				
				String leave_type=request.getParameter("ltype");
				String from_date=request.getParameter("lfd");
				String to_date=request.getParameter("ltd");
				String duration=request.getParameter("dleave");
				String reason=request.getParameter("reason");
				
				ServletContext context=request.getServletContext();
				String eid=(String)context.getAttribute("k2");
			
				String status="pending";
				
				String getStatus=null;
				
				Statement st2=con.createStatement();
				ResultSet rs=st2.executeQuery(" select status from employee_lev where e_id="+ eid);
				 while(rs.next()!=false){
					 getStatus=rs.getString(6);
				 }
			if(status.equals(getStatus)){
					RequestDispatcher rd=request.getRequestDispatcher("Employee_Leave_Include_02.jsp");
					rd.forward(request, response);
					response.setHeader("refresh","8;URL=Employee_Leave_Include.jsp");
				}
					
			
			//--------------------------------------DataBase Create and Link--------------------------------
			else{	
				
				Statement st=con.createStatement();
				String s="insert into employee_lev values('"+eid+"', '"+leave_type+"', '"+from_date+"', '"+to_date+"', '"+duration+"', '"+reason+"', '"+status+"'  )		 ";
				
				int i=st.executeUpdate(s);
				
				
				
				if(i>=0)
				{
					
					
					out.print("<center><font color='blue'size='5' bold>Leave Applied..!!</font></center>");
					response.setHeader("refresh","3;URL=Employee_Leave_Include.jsp");
				}
				else
				{
					out.print("<center><font color='red'size='5' bold>Opps..Leave Not Applied...</font></center>");
					response.setHeader("refresh","3;URL=Employee_Leave_Include.jsp");
						
				}
				
				}
			}//try
			catch(Exception e){out.print(e.getMessage());out.print("<br>Opps... You can apply one leave at a time ");
			out.print("<br><center>	<h2>Opps...Seems your last applied leave is not sanctioned yet !!</h2></center>");
			//response.setHeader("refresh","3;URL=Employee_Leave_Include.jsp");
			
			}//catch
			
			
			
			
			
			
			%>
</body>
</html>