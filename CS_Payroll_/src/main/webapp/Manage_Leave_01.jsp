<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<head>
    
    <link rel="stylesheet" href="Manage_Leave.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8" />


</head>

<body>
    <br>
    <h1 class="Title">Employee Leave</h1><br>
    <hr><br>
    <%!
    	int pending=0;
    	int granted=0;
    	int deactive=0;
    
    %>
<%
	
		try
		{
			
			
		
		
		//--------------------------------------DataBase Create and Link--------------------------------
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
			
			
			
			
		
			
			String granted2="granted";
			
			Statement st3=con.createStatement();
			ResultSet rs3=st3.executeQuery(" select count(*) from employee_lev where status='"+granted2+"'  ");
			while(rs3.next()!=false)
					granted=rs3.getInt(1);
			
			

			String revoked2="revoked";
			Statement st4=con.createStatement();
			ResultSet rs4=st4.executeQuery(" select count(*) from employee_lev where status='"+revoked2+"'  ");
			while(rs4.next()!=false)
					deactive=rs4.getInt(1);
			
			String pending2="pending";
			Statement st5=con.createStatement();
			ResultSet rs5=st5.executeQuery(" select count(*) from employee_lev where status='"+pending2+"'  ");
			while(rs5.next()!=false)
					pending=rs5.getInt(1);
			
			
			
		}
		//catch(ServletException e){out.print(e.getMessage());}
		catch(Exception e)
			{out.print(e.getMessage());out.print("<br>Error Throws..");e.printStackTrace();}
		
		
		
		
		
		
	%>

    <center>

        <table class="table01">
            <tr>
                <td>
                    <a href="Manage_Leave_Include_02.jsp" >
                        <div class="box">
                            <h3 class="lb1">PENDING LEAVE</h3>
                            <hr>
                            <h1 class="lb1"><%=pending %></h2>
                        </div>
                    </a>
                </td>

                <td>
                   
                        <div class="box">
                            <h3 class="lb1">APPROVED LEAVE</h3>
                            <hr>
                            <h1 class="lb1"><%=granted %></h1>
                        </div>
                   
                </td>

                <td>
                    
                        <div class="box">
                            <h3 class="lb1">CANCELLED LEAVE</h3>
                            <hr>
                            <h1 class="lb1"><%=deactive %></h1>
                        </div>
                   
                </td>
            </tr>

        </table>

    </center>
</body>

</html>