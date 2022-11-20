<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body bgcolor="lightblue"><br><br><br><br><br><br>

		<%
				String eid=request.getParameter("eid");
				String edesig=request.getParameter("designation");
				String month=request.getParameter("month");
				
				HttpSession ses=request.getSession(false);
				
				String ename=(String)ses.getAttribute("ename");
				String acno=(String)ses.getAttribute("acno");
				String basic=Double.toString((Double)ses.getAttribute("basicpay"));
				String salary=(String)ses.getAttribute("salary");
				
			
				String pf=Double.toString((Double)ses.getAttribute("pf"));
				
				String it=Double.toString((Double)ses.getAttribute("it"));
				String ta=request.getParameter("ta");
				String da=request.getParameter("da");
				String ma=request.getParameter("ma");
				String hra=request.getParameter("hra");
				
				try{
					
					
					//--------------------------------------DataBase Create and Link--------------------------------
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
					
					String s=" insert into generate_salary values(?,?,?,?,?,?,?,?,?,?,?,?,?)  ";
					PreparedStatement pst=con.prepareStatement(s);
					
					pst.setString(1, eid);
					pst.setString(2, ename);
					pst.setString(3, edesig);
					
					pst.setString(4, month);		pst.setString(9, it);
					pst.setString(5, acno);			pst.setString(10, ta);
					pst.setString(6, basic);		pst.setString(11, da);
					pst.setString(7, salary);		pst.setString(12, ma);
					pst.setString(8, pf);			pst.setString(13, hra);
					
					int i=pst.executeUpdate();
					
					if(i>=1){
						
						out.print("<center>");
						out.print("<font color=blue size=5>");
						
						out.println("Congratulation..Salary Generated..");
						out.print("</font>");out.print("</center>");
						response.setHeader("refresh", "3;URL=Generate_Salary_Include01.jsp");
					}
					else{
						out.print("<center>");
						out.print("<font color=blue size=5>");
						
						out.println("Opps..Salary Not Generated..");
						out.print("</font>");out.print("</center>");
						response.setHeader("refresh", "3;URL=Generate_Salary_Include01.jsp");
						
					}
					
				}		
				
				catch(Exception e){
				
				out.print("<center>");
				out.print("<font color=blue size=4>");
				out.print(e.getMessage());
				out.print("</font>");
				
				out.print("<font color=red size=5>");
				out.println("<br><br><br><br>Opps..Salary already Generated for the Selected month..");
				out.print("</font>");out.print("</center>");
				
				}
				response.setHeader("refresh", "5;URL=Generate_Salary_Include01.jsp");

		
		%>

</body>
</html>