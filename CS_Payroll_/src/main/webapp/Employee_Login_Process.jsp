<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.sql.*" %>
    <%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%

			try
			{
				String vname=request.getParameter("uname");
				String vpass=request.getParameter("pass");
			
			
			//--------------------------------------DataBase Create and Link--------------------------------
			
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
				
				Statement st=con.createStatement();
				String s="select euserid, epass, ename, eid from employee where euserid='"+vname+"' ";
				
				ResultSet rs=st.executeQuery(s);
				
				String fullname=null;
				String aname=null;
				String apass=null;
				String aid = null;
				
				while(rs.next()!=false)
				{
					  fullname=rs.getString("ename");	  
					  aname=rs.getString("euserid");
					  apass=rs.getString("epass");
					  aid=rs.getString("eid");
				}
				
				//pw.print("<br>fullname=&nbsp;"+fullname);
			//	pw.print("<br>uname=&nbsp;"+aname);
				//pw.print("<br>pass=&nbsp;"+apass);
				
				if(vname.equals(aname) && vpass.equals(apass))
				{
					ServletContext cont=request.getServletContext();
				
					cont.setAttribute("k1",fullname);
					
					ServletContext cont2=request.getServletContext();
					cont2.setAttribute("k2",aid);
					
					
					RequestDispatcher rd=request.getRequestDispatcher("./s015");
					rd.forward(request,response);
				}
				else
				{
					out.print("<font color='red'size='5' bold>  Invalid Credentials...</font>");
					RequestDispatcher rd=request.getRequestDispatcher("./s016");
					rd.include(request,response);
				}
				
				
			}
			catch(ServletException e){out.print(e.getMessage());}
			catch(IOException e){out.print(e.getMessage());out.print("<br>Error Throws..");}
			
			
			
			
			
			%>

</body>
</html>