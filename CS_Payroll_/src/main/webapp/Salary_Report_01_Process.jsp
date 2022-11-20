<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Generate_Salary.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>

<style>
	body{height : 100%;}
	a{text-decoration: none;}
	
</style>
</head>
<body bgcolor="lightblue"><center>
<h1 class="Title">Salary Report</h1>
    <hr>
    <h4>For Month : <%=request.getParameter("month") %> </h4>
    
    <br><br>

	<table class = "table" style = "width=100%">
		<tr >
			<th>Emp ID</th><td>&nbsp;</td>
			<th>Emp Name</th><td>&nbsp;</td>
			<th>Designation</th><td>&nbsp;</td>
			<th>Salary</th><td>&nbsp;</td>
			<th>Provident Fund</th><td>&nbsp;</td>
			<th>Income Tax</th><td>&nbsp;</td>
			<th>TA</th><td>&nbsp;</td>
			<th>DA</th><td>&nbsp;</td>
			<th>MA</th><td>&nbsp;</td>
			<th>HRA</th><td>&nbsp;</td>
			<th>Net Pay</th>
		</tr>
		
		<tr>
			<%!
			
				String ename=null;
				String edesig=null;
				String esalary=null;
				String epf=null;
				String it=null;
				String ta=null;
				String da=null;
				String ma=null;
				String hra=null;
				
				String month=null;
				String acno=null;
				String netpay=null;
			
			%>
			
			<%
			try{
				 month=request.getParameter("month");
				String eid=request.getParameter("eid");
				
				
				
				//--------------------------------------DataBase Create and Link--------------------------------
			
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
					
					Statement st=con.createStatement();
					String s="select * from generate_salary where eid='"+eid+"' and month='"+month+"'  ";
					
					ResultSet rs=st.executeQuery(s);
					while(rs.next()!=false){
						ename=rs.getString("ename");
						edesig=rs.getString("edesig");
						esalary=rs.getString("salary");
						epf=rs.getString("pf");
						it=rs.getString("it");
						ta=rs.getString("ta");
						da=rs.getString("da");
						ma=rs.getString("ma");
						hra=rs.getString("hra");
						acno=rs.getString("acno");
						
						netpay=rs.getString("basic");
						
						
						HttpSession ses=request.getSession(true);
						ses.setAttribute("eid",eid);
						ses.setAttribute("ename",ename);
						ses.setAttribute("edesig",edesig);
						ses.setAttribute("salary",esalary);
						ses.setAttribute("pf",epf);
						ses.setAttribute("it",it);
						ses.setAttribute("ta",ta);
						ses.setAttribute("da",da);
						ses.setAttribute("ma",ma);
						ses.setAttribute("hra",hra);
						ses.setAttribute("month",month);
						ses.setAttribute("acno",acno);
						ses.setAttribute("netpay",netpay);
						
			%>	
						
		               <td><%=eid %></td><td>&nbsp;&nbsp;</td>
		               <td><%=ename %></td><td>&nbsp;&nbsp;</td>
		               <td><%=edesig %></td><td>&nbsp;&nbsp;</td>
		               <td><%=esalary %></td><td>&nbsp;&nbsp;</td>
		               <td><%=epf %></td><td>&nbsp;&nbsp;</td>
		               <td><%=it %></td><td>&nbsp;&nbsp;</td>
		               <td><%=ta %></td><td>&nbsp;&nbsp;</td>
		               <td><%=da %></td><td>&nbsp;&nbsp;</td>
		               <td><%=ma %></td><td>&nbsp;&nbsp;</td>
		               <td><%=hra %></td><td>&nbsp;&nbsp;</td>
		               <td><%=netpay %></td><td>&nbsp;&nbsp;</td>
		               
		               <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		               <th><a href="Generate_Salary_Report_01.jsp" >Salary Recipt</a></th>
		             
		            </tr>
		          </table>
		     <%        	
					}
					
					
					
					
				}
				//catch(ServletException e){out.print(e.getMessage());}
				catch(Exception e)
					{out.print(e.getMessage());out.print("<br>Error Throws..");}	
			
			
			
			%>
	</center>
</body>
</html>