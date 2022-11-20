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
		String eid=request.getParameter("eid");					String edesig=request.getParameter("edesig");
		String ename=request.getParameter("ename");				String ebankac=request.getParameter("ebankac");
		String egender=request.getParameter("egender");			String eifsc=request.getParameter("eifsc");
		String emstatus=request.getParameter("emstatus");		String euserid=request.getParameter("euserid");
		String ecountry=request.getParameter("ecountry");		String epass=request.getParameter("epass");
		String estate=request.getParameter("estate");			String emobile=request.getParameter("emobile");
		String eaddress=request.getParameter("eaddress");		String ebg=request.getParameter("ebg");
		String edob=request.getParameter("edob");				String edoj=request.getParameter("edoj");
		String eemail=request.getParameter("eemail");			String eqlfn=request.getParameter("eqlfn");
		
		try
		{
			
		
	
	
		//--------------------------------------DataBase Create and Link--------------------------------
	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
			
			String s="update employee set ename=?, egender=?, emstatus=?, ecountry=?, estate=?, eaddress=?, edob=?, eemail=?, eqlfn=?, edesig=?, ebankac=?, eifsc=?, euserid=?, epass=?, emobile=?, ebg=?, edoj=? where eid=? ";
			PreparedStatement pst=con.prepareStatement(s);
			
			pst.setString(1,ename);
			pst.setString(2,egender);
			pst.setString(3,emstatus);
			pst.setString(4,ecountry);
			pst.setString(5,estate);
			pst.setString(6,eaddress);
			pst.setString(7,edob);
			pst.setString(8,eemail);

			pst.setString(9,eqlfn);
			pst.setString(10,edesig);
			pst.setString(11,ebankac);
			pst.setString(12,eifsc);
			pst.setString(13,euserid);
			
			pst.setString(14,epass);
			pst.setString(15,emobile);
			pst.setString(16,ebg);
			pst.setString(17,edoj);
			
			pst.setString(18,eid);
			
			
			pst.executeUpdate();
			
			out.print("<br><br><br><hr><br><br><br>");
			out.print("<center>");
			out.println("<font size='5' color='Red'>Exellent...Employee Updated..!!</font>");
			
			
			out.print("</center>");
			response.setHeader("refresh","3;URL=Edit_Employee_Include_01.jsp");
		}
		//catch(ServletException e){out.print(e.getMessage());}
		catch(Exception e)
			{out.print(e.getMessage());out.print("<br>Error Throws..");}
		

		
	%>
	
	<%
			
	
	%>

</body>
</html>