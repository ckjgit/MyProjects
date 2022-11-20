<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%@ page import="java.sql.*" %>
    <%@ page import="java.io.*" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
<%

try
{
	String vname=request.getParameter("username");
	String vpass=request.getParameter("pass");


//--------------------------------------DataBase Create and Link--------------------------------

	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
	
	Statement st=con.createStatement();
	String s="select * from User01 where uname='"+vname+"' ";
	
	ResultSet rs=st.executeQuery(s);
	
	String fullname=null;
	String aname=null;
	String apass=null;
	
	while(rs.next()!=false)
	{
		  fullname=rs.getString("name");
		  aname=rs.getString(4);
		  apass=rs.getString(5);
	}
	
	//pw.print("<br>fullname=&nbsp;"+fullname);
//	pw.print("<br>uname=&nbsp;"+aname);
	//pw.print("<br>pass=&nbsp;"+apass);
	
	if(vname.equals(aname) && vpass.equals(apass))
	{
		ServletContext cont=request.getServletContext();
	
		cont.setAttribute("k1",fullname);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("./s02");
		rd.forward(request,response);
	}
	else
	{
		out.print("<br> Invalid Credentials...");
		RequestDispatcher rd=request.getRequestDispatcher("./s03");
		rd.include(request,response);
	}
	
	
}
catch(ServletException e){out.print(e.getMessage());}
catch(IOException e){out.print(e.getMessage());out.print("<br>Error Throws..");}





%>

</body>
</html>