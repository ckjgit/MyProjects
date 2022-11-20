<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
	try{
	
		 	String month=request.getParameter("month");
			String eid=request.getParameter("eid");
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
			
			Statement st1=con1.createStatement();
			String s1="select * from generate_salary where eid='"+eid+"' and month='"+month+"'  ";
			
			String aid=null;
			String amonth=null;
			ResultSet rs1=st1.executeQuery(s1);
			while(rs1.next()!=false){
				aid=rs1.getString("eid");
				amonth=rs1.getString("month");
			}
			
			if(eid.equals(aid) && month.equals(amonth)){
				RequestDispatcher rd=request.getRequestDispatcher("Salary_Report_Include_02.jsp");
				rd.include(request,response);
			}
			else{
				RequestDispatcher rd=request.getRequestDispatcher("Salary_Report_Includde_03.jsp");
				rd.forward(request,response);
			}
	}
		
	catch(Exception e){out.print(e.getMessage());out.print("<br>Error Throws..");}	
	
	%>

</body>
</html>