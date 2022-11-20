<!DOCTYPE html>
<html lang="en">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=ISO-8859-1"%>
<head>
    <meta charset="UTF-8">
	<link rel="stylesheet" href="Generate_Salary.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   

</head>

<body>

	<form action="./s019" method="get">
	
	<%!
		String fullname=null;
		String acno=null;
		String designation=null;
		String basicpay=null;
		String salary=null;
		String ta=null;
		String da=null;				double pf;
		String ma=null;				double it;
		String hra=null;			double basic;
		String eid=null;
	%>

	<%
	try{
		 eid=request.getParameter("eid");
		
		//--------------------------------------DataBase Create and Link--------------------------------
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
		
		Statement st=con.createStatement();
		String s="select * from employee where eid='"+eid+"' ";
		
		ResultSet rs=st.executeQuery(s);
		
		
		while(rs.next()!=false)
		{
			  fullname=rs.getString("ename");	  
			  acno=rs.getString("ebankac");
			  designation=rs.getString("edesig");
			  
		}
		
		
		
		Statement st02=con.createStatement();
		ResultSet rs02=st.executeQuery("select * from designation where designation='"+designation+"' ");
		
		while(rs02.next()!=false){
			
				//basicpay=rs02.getString(2);		
				da=rs02.getString(5);
				salary=rs02.getString(3);		ma=rs02.getString(6);
				ta=rs02.getString(4);			hra=rs02.getString(7);
				
		}
		
		//System.out.println(Integer.parseInt(salary));
		
		double sal=(double)Double.parseDouble(salary);
		
		double employeepf=(sal * 8) /100;
		
		double employerpf=(sal * 2.67) /100;
		
		pf=employeepf + employerpf;
		
		 

		
		//System.out.println(pf);
		
		//System.out.println(it);
		
		if(sal<20833.34)
			it=0;
		
		else if(sal>=20833.34 && sal<=41667)
			it= (sal * 3)/100;						// 5% / 12 =0.004167
		
		else if(sal>=41667 && sal<=62500){
			it=(sal * 5)/100;	
			
			
		}
		
		else if(sal>=62500 && sal<=83333)
			it=(sal * 9)/100;
		
		else if(sal>=83333 && sal<=104167)
			it=(sal * 14)/100;
		
		else if(sal>=104167 && sal<=125000)
			it=(sal * 19)/100;
		
		else
			it= (sal * 22)/100;
		
	//	System.out.println(it);
		
	//	System.out.println("=======================");
	
	
		  basic=sal-(pf+it);
		  
//-----------------------------------  Creating  Session and Inserting data to it-------------------		  
		  
		  
		 HttpSession ses=request.getSession(true);
		 ses.setAttribute("ename", fullname);
		 ses.setAttribute("acno", acno);
		 ses.setAttribute("basicpay", basic);
		 ses.setAttribute("salary", salary);
		 ses.setAttribute("pf", pf);
		 ses.setAttribute("it", it);
		 ses.setAttribute("ta", ta);
		 ses.setAttribute("da", da);
		 ses.setAttribute("ma", ma);
		 ses.setAttribute("hra", hra);
		  
	}		
	
	catch(Exception e){out.print(e.getMessage());out.print("<br>Error Throws..");}

	
	%>
	
	<h1 class="Title">Generate Salary</h1>
    <hr><br><br>

	<table>
		<tr>
			<td>
				<label for="input" class="Input-label-01">Selected Month :  </label>
				<input type="month" class="Input-select" name="month" id="" value="<%=request.getParameter("month") %>">
			</td>
			
			<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
			
			<td>
				<label for="input" class="Input-label-01"> Designation :  </label>
				<input type="text" class="Input-select" name="designation" id="" value="<%=designation %>" />
			</td>
				
			<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>		
			
			<td>
				<label for="input" class="Input-label-01">Employee ID :  </label>
				<input type="text" name="eid" class="Input-select" maxlength="3" value="<%=eid %>" />
				
			</td>

			
		</tr>
	</table>

	<br><br>

	<nav>
		<table width = "100%">
			<tr>
				<td class="td1">
					<label for="input" class="Input-label">Name :  </label>
				</td>
				<td class="td2">
					<label for="input" class="Input-label"><%=fullname %></label>
				</td>
	
				<td class="td1">
					<label for="input" class="Input-label">Account No. :  </label>
				</td>
				<td class="td2">
					<label for="input" class="Input-label"><%=acno %></label>
				</td>
			</tr>
		</table>
	</nav>

		<br><br>
		

			<table width = "50%" align="left"  >
				<tr>
					<td class="td1">
						<label for="input" class="Input-label">Basic Pay</label>
					</td>
					<td class="tdm">
						<label for="input" class="Input-label"> : </label>
					</td>
					<td class="td2">
						<label for="input" class="Input-label"><%=basic %></label>
					</td>
				</tr>
		
				<tr>
					<td class="td1">
						<label for="input" class="Input-label">Salary</label>
					</td>
					<td class="tdm">
						<label for="input" class="Input-label"> : </label>
					</td>
					<td class="td2">
						<label for="input" class="Input-label"><%=salary %></label>
					</td>
				</tr>
		
				<tr>
					<td class="td1">
						<label for="input" class="Input-label">Provident Fund</label>
					</td>
					<td class="tdm">
						<label for="input" class="Input-label"> : </label>
					</td>
					<td class="td2">
						<label for="input" class="Input-label"><%=pf %></label>
					</td>
				</tr>
		
				<tr>
					<td class="td1">
						<label for="input" class="Input-label">Income Tax</label>
					</td>
					<td class="tdm">
						<label for="input" class="Input-label"> : </label>
					</td>
					<td class="td2">
						<label for="input" class="Input-label"><%=it %></label>
					</td>
				</tr>
		
				
			</table>
		
			<table width = "50%" align="right" >
				<tr>
					<td class="td1">
						<label for="input" class="Input-label">Travel Allowance</label>
					</td>
					<td class="tdm">
						<label for="input" class="Input-label"> : </label>
					</td>
					<td class="td2">
						<input type="text" name="ta" class="Input-select" value="<%=ta %>"  >
					</td>
				</tr>
				<tr>
					<td class="td1">
						<label for="input" class="Input-label">Medical Allowance</label>
					</td>
					<td class="tdm">
						<label for="input" class="Input-label"> : </label>
					</td>
					<td class="td2">
						<input type="text" name="ma" class="Input-select"  value="<%=ma %>">
					</td>
				</tr>
				<tr>
					<td class="td1">
						<label for="input" class="Input-label">Dearness Allowance</label>
					</td>
					<td class="tdm">
						<label for="input" class="Input-label"> : </label>
					</td>
					<td class="td2">
						<input type="text" name="da" class="Input-select" value="<%=da %> ">Not Applied yet
					</td>
				</tr>
				<tr>
					<td class="td1">
						<label for="input" class="Input-label">House Rent Allowance</label>
					</td>
					<td class="tdm">
						<label for="input" class="Input-label"> : </label>
					</td>
					<td class="td2">
						<input type="text" name="hra" class="Input-select" value="<%=hra %>">
					</td>
				</tr>

			</table>
			<br>	
		
&nbsp; &nbsp;
<br><br><br><br>
		<center>
				<input type="submit" value="Generate Salary" class="btn"></input>
			</center>
	</form>
	
</body>
</html>