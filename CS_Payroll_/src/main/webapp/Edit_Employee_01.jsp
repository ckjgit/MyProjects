<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
			
	<link rel="stylesheet" href="Add_Employee.css">
	<link rel="stylesheet" href="Generate_Salary.css">
	
    
    

    <style>
        .form-submit-button {
        background: #2485cf;
        padding: 10px 20px;
        color: #fff;
        border: 1px solid #eee;
        border-radius: 20px;
        box-shadow: 5px 5px 5px rgb(201, 199, 199);
        text-shadow: none;
        font-size: 15px;
        }
        .form-submit-button:hover {
        background: #d54521;
        padding: 10px 20px;
        color: #fff;
        border: 1px solid #eee;
        border-radius: 20px;
        box-shadow: 5px 5px 5px rgb(177, 106, 106);
        text-shadow: none;
        font-size: 15px;
        }
        
        .Input-select {
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
	  }

    </style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	
	
	
	<form action="./s013" method="get">
		<center><br><br><hr>
			
			<font color="blue" size="6" font-family: Georgia, serif> Edit Employee </font>
			
			
			<br><hr><br><br><br>
			<table>
				<tr>
					<td>
                		<label for="input" class="Input-label-01">Employee ID :</label>
					</td>
					
					<td>
						<select  class="Input-select" name="eid" required>
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
				</tr>
			
			</table>
		
		
	
		 
            
            <br><br>
             <input type="submit" value="Next" class="form-submit-button">
         </center>
        </form>
	</body>
</html>