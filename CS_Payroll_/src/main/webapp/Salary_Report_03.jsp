<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Generate_Salary.css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<style>

	.Input-se {
	    display: inline;
	    margin: 0;
	    padding: 1 em;
	    color: #225671;
	    background-color: #dee8f1;
	    height: 30%;
	    width: 100%;
	    font-family: Monospace, Courier;
	    font-size: 20px;
	    font-weight: 100;
	    line-height: 25px;
	    border: none;
	    border-radius: 0.3rem;

</style>

</head>
<body>
	
	<h1 class="Title">Salary Report</h1>
    <hr><br><br>
	
	<form action="./s020" method="get">
	
	<table>
		<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td>
				<label for="input" class="Input-label-01">Select Month :  </label>
				<input type="month" class="Input-select" name="month" id="">
			</td>
			
			
			
			
				
			<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>		
			
			<td>
						<select  class="Input-se" name="eid" required>
						<%
						

						try
						{
							
						
					
					
						//--------------------------------------DataBase Create and Link--------------------------------
					
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
							
							Statement st=con.createStatement();
							String s="select eid from employee  ";
							
							ResultSet rs=st.executeQuery(s);
							while(rs.next()!=false){
							%>	
								
				               <option><%=rs.getString(1) %></option>
				            <%	
							}
							
							
							
							
						}
						//catch(ServletException e){out.print(e.getMessage());}
						catch(Exception e)
							{out.print(e.getMessage());out.print("<br>Error Throws..");}
				
						
						%>
							</select>
					</td>
					
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>		

			<td>
				<input type="submit" value="NEXT" class="upper-btn"></input>
			</td>
		</tr>
	</table>
	<center>	<br><br><h3><font color="blue" >Salary Not Generated For The Selected Criteria</font></h3></center>

	<br><br>

	
			<br>	<hr>
		
<br><br><br><br><br>
		
	</form>
</body>
</html>