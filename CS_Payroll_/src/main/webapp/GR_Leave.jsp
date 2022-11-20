<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body bgcolor="lightgreen">
 		<%
 			String eid=request.getParameter("eid");
 			String lgr=request.getParameter("LGR");
 			String ltype=(String)request.getParameter("ltype");
 			
 			System.out.println(ltype);
 		

			try
			{
				
				
			
			//--------------------------------------DataBase Create and Link--------------------------------
			
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
				
				Statement st=con.createStatement();
				String s="update employee_lev set status='"+lgr+"' where e_id='"+eid+"' ";
				
				int i=st.executeUpdate(s);
				
				
				
				if(i>=0 && lgr.equals("granted"))
				{
					
					
					out.print("<center><font color='blue'size='5' bold>Leave Granted..!!</font></center>");
					response.setHeader("refresh","2;URL=Manage_Leave_Include_02.jsp");
				}
				else
				{
					out.print("<center><font color='red'size='5' bold>Leave Rejected...!!</font></center>");
					response.setHeader("refresh","2;URL=Manage_Leave_Include_02.jsp");
						
				}
				
				
			}
			catch(Exception e){out.print(e.getMessage());e.printStackTrace();out.print("<br>Error Throws..");
			//response.setHeader("refresh","3;URL=Manage_Leave_Include_02.jsp");
			
			}
			
			
			
			
			
			
			%>
 		
 		
</body>
</html>