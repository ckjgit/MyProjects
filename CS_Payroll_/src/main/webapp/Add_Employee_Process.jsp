<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ page import="java.sql.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
	<body>
		<center>
			<% 
				String vid=request.getParameter("eid");
				String vname=request.getParameter("ename");
				String vgender=request.getParameter("egender");
				
				String vmstatus=request.getParameter("emstatus");
				String vcountry=request.getParameter("ecountry");
				String vstate=request.getParameter("estate");
				
				String vaddress=request.getParameter("eaddress");
				String vdob=request.getParameter("edob");
				String vemail=request.getParameter("eemail");
				
				String vqlfn=request.getParameter("eqlfn");
				String vdesig=request.getParameter("edesig");
				String vbankac=request.getParameter("ebankac");
				
				String vifsc=request.getParameter("eifsc");
				String vuserid=request.getParameter("euserid");
				String vpass=request.getParameter("epass");
				
				String vmobile=request.getParameter("emobile");		String status="NA";
				
				String ebg=request.getParameter("ebg");
				String edoj=request.getParameter("edoj");
				
				
				try
				{
					
					
			
			
				//--------------------------------------DataBase Create and Link--------------------------------
			
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
					
					Statement st=con.createStatement();
					String s="insert into employee values (  '"+vid+"', '"+vname+"', '"+vgender+"', '"+vmstatus+"', '"+vcountry+"', '"+vstate+"', '"+vaddress+"', '"+vdob+"', '"+vemail+"', '"+vqlfn+"', '"+vdesig+"', '"+vbankac+"', '"+vifsc+"', '"+vuserid+"', '"+vpass+"', '"+vmobile+"', '"+status+"', '"+ebg+"', '"+edoj+"'   )   ";
					
					int i=st.executeUpdate(s);
					
					if(i>=0){
						
						out.print("<font size='5' color='Red'>Congratulations..</font>");
						out.println("<font size='5' color='Red'>Employee Registered..!!</font>");
						
						response.setHeader("refresh", "5;URL=./s05");
					}
					else{
						out.println("<font size='5' color='Red'>Opps...Designation Not Updated..!!</font>");
						
						response.setHeader("refresh", "5;URL=./s05");
					}
						
					
					
				}
				//catch(ServletException e){out.print(e.getMessage());}
				catch(Exception e)
					{out.print(e.getMessage());out.print("<br>Error Throws..");}
				
			
			%>




</center>

</body>
</html>