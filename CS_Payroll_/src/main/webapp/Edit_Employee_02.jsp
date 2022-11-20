<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="Add_Employee.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
</head>
<body>

		<%!
		String eid=null;			String edesig=null;
		String ename=null;			String ebankac=null;
		String egender=null;		String eifsc=null;
		String emstatus=null;		String euserid=null;
		String ecountry=null;		String epass=null;
		String estate=null;			String emobile=null;
		String eaddress=null;		String ebg=null;
		String edob=null;			String edoj=null;
		String eemail=null;			String eqlfn=null;
		
			
		
		%>
		
		<%
		eid=request.getParameter("eid");
	
	
	
			
			try
			{
				
			
		
		
			//--------------------------------------DataBase Create and Link--------------------------------
		
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
				
				Statement st=con.createStatement();
				String s="select * from employee where eid='"+eid+"' ";
				
				ResultSet rs=st.executeQuery(s);
				while(rs.next()!=false){
					
					ename=rs.getString(2);				euserid=rs.getString(14);
					egender=rs.getString(3);			epass=rs.getString(15);
					emstatus=rs.getString(4);			emobile=rs.getString(16);
					ecountry=rs.getString(5);			ebg=rs.getString(18);
					estate=rs.getString(6);				edoj=rs.getString(19);
					eaddress=rs.getString(7);					
					edob=rs.getString(8);					
					eemail=rs.getString(9);					
					eqlfn=rs.getString(10);					
					edesig=rs.getString(11);					
					ebankac=rs.getString(12);
					eifsc=rs.getString(13);
					
				}
				
				
				System.out.println(eid+" "+egender);
				
			}
			//catch(ServletException e){out.print(e.getMessage());}
			catch(Exception e)
				{out.print(e.getMessage());out.print("<br>Error Throws..");}
			
	
	
	%>



		


		<h1 class="Title">Edit Employee Details</h1><br>

    <hr><br><br>
    <form action="./s014" method="get">

    <table width = "50%" align="left">
        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Employee ID :  </label>
            </td>
            <td class = "td2">
                <input type="number" name="eid" class="Input-text" readonly maxlength="3" value="<%=eid %>" required>
            </td>
        </tr>
        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Name :  </label>
            </td>
            <td class = "td2">
                <input type="text" name="ename" class="Input-text" value="<%=ename %>"required>
            </td>
        </tr>
        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Gender :  </label>
            </td>
            <td class = "td2">
                <select name="egender" class="Input-select" required>
                    <option><%=egender %></option>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                    <option value="Transgender">Transgender</option>
                </select>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Marital Status : </label>
            </td>
            <td class = "td2">
                <select name="emstatus" class="Input-select" required>
                    <option><%=emstatus %></option>
                    <option value="Unmarried">Unmarried</option>
                    <option value="Married">Married</option>
                    <option value="Widowed">Widowed</option>
                    <option value="Divorced">Divorced</option>
                </select>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Country :  </label>
            </td>
            <td class = "td2">
                <select name="ecountry" class="Input-select" required>
                    <option><%=ecountry %></option>
                    <option value="India">India</option>
                    <option value="Indonesia">Indonesia</option>
                    <option value="Bangladesh">Bangladesh</option>
                    <option value="Sri Lanka">Sri Lanka</option>
                    <option value="Pakistan">Pakistan</option>
                    <option value="Nepal">Nepal</option>
                    <option value="Bhutan">Bhutan</option>
                </select>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; State :  </label>
            </td>
            <td class = "td2">
                <select class="Input-select" name="estate">
                    <option><%=estate %></option>
                    <option value="Andra Pradesh">Andra Pradesh</option>
                    <option value="Arunachal Pradesh">Arunachal Pradesh</option>
                    <option value="Assam">Assam</option>
                    <option value="Bihar">Bihar</option>
                    <option value="Chhattisgarh">Chhattisgarh</option>
                    <option value="Goa">Goa</option>
                    <option value="Gujarat">Gujarat</option>
                    <option value="Haryana">Haryana</option>
                    <option value="Himachal Pradesh">Himachal Pradesh</option>
                    <option value="Jammu and Kashmir">Jammu and Kashmir</option>
                    <option value="Jharkhand">Jharkhand</option>
                    <option value="Karnataka">Karnataka</option>
                    <option value="Kerala">Kerala</option>
                    <option value="Madya Pradesh">Madya Pradesh</option>
                    <option value="Maharashtra">Maharashtra</option>
                    <option value="Manipur">Manipur</option>
                    <option value="Meghalaya">Meghalaya</option>
                    <option value="Mizoram">Mizoram</option>
                    <option value="Nagaland">Nagaland</option>
                    <option value="Orissa">Orissa</option>
                    <option value="Punjab">Punjab</option>
                    <option value="Rajasthan">Rajasthan</option>
                    <option value="Sikkim">Sikkim</option>
                    <option value="Tamil Nadu">Tamil Nadu</option>
                    <option value="Telangana">Telangana</option>
                    <option value="Tripura">Tripura</option>
                    <option value="Uttaranchal">Uttaranchal</option>
                    <option value="Uttar Pradesh">Uttar Pradesh</option>
                    <option value="West Bengal">West Bengal</option>
                  </select>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Address :  </label>
            </td>
            <td class = "td2">
                <input type="text" name="eaddress" class="Input-text" value="<%=eaddress %>" required>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Date of Birth :  </label>
            </td>
            <td class = "td2">
                <input type="date" name="edob" class="Input-date" value="<%=edob %>" required>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Blood Group :  </label>
            </td>
            <td class = "td2">
                <select name="ebg" id="" class="Input-select">
                    <option><%=ebg %></option>
                    <option value="A+">A+</option>
                    <option value="A-">A-</option>
                    <option value="B+">B+</option>
                    <option value="B-">B-</option>
                    <option value="AB+">AB+</option>
                    <option value="AB-">AB-</option>
                    <option value="O+">O+</option>
                    <option value="O-">O-</option>
                </select>
            </td>
        </tr>
    </table>

    <table width = "50%" align="right">
        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Email :  </label>
            </td>
            <td class = "td2">
                <input type="email" name="eemail" class="Input-text" value="<%=eemail %>" required>
            </td>
        </tr>
        
        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Mobile :  </label>
            </td>
            <td class = "td2">
                <input type="number" name="emobile" class="Input-text" minlength="10" value="<%=emobile %>" required>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Qualification :  </label>
            </td>
            <td class = "td2">
                <select name="eqlfn" class="Input-select" required>
                    <option><%=eqlfn %></option>
                    <option value="BSc">Bachelor Of Science</option>
                    <option value="BCom">Bachelor Of Commerce</option>
                    <option value="BA">Bachelor Of Arts</option>
                    <option value="BCA">BCA</option>
                    <option value="BBA">BBA</option>
                    <option value="MSc">Master Of Science</option>
                    <option value="MCom">Master Of Commerce</option>
                    <option value="MA">Master Of Arts</option>
                    <option value="MCA">MCA</option>
                    <option value="MBA">MBA</option>
                </select>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Designation :  </label>
            </td>
            <td class = "td2">
                <select name="edesig" class="Input-select" required>
                    <option><%=edesig %></option>
                    <option value="Software Engineer">Software Engineer</option>
                    <option value="Sr. Software Engineer">Sr. Software Engineer</option>
                    <option value="Project Manager">Project Manager</option>
                    <option value="Finance Manager">Finance Manager</option>
                    <option value="Web Developer">Web Developer</option>
                    <option value="Full Stack Developer">Full Stack Developer</option>
                    <option value="Business Analytics">Business Analytics</option>
                    <option value="Account Executive">Account Executive</option>
                </select>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Date of Joining :  </label>
            </td>
            <td class = "td2">
                <input type="date" name="edoj" class="Input-date" value="<%=edoj %>" required>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Bank Account No :  </label>
            </td>
            <td class = "td2">
                <input type="number" name="ebankac" class="Input-text" minlength="12" value="<%=ebankac %>" required>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; IFSC Code :  </label>
            </td>
            <td class = "td2">
                <input type="text" name="eifsc" class="Input-text" minlength="11" value="<%=eifsc %>" required >
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; User ID :  </label>
            </td>
            <td class = "td2">
                <input type="text" name="euserid" class="Input-text" value="<%=euserid %>" required>
            </td>
        </tr>

        <tr>
            <td class = "td1">
                <label for="input" class="Input-label">&nbsp; Password :  </label>
            </td>
            <td class = "td2">
                <input type="password" name="epass" class="Input-text" minlength="8" value="<%=epass %>" required>
            </td>
        </tr>
    </table>
    &nbsp;
    <hr>
    <br><br>

    <table width = "30%" align="center">
        <tr>
            <th rowspan="2">
                <a href="Edit_Employee_Include_01.jsp"><font class="button" color="Blue" size=5>BACK</font></a>
            </th>
            <th><input type="submit" value="SUBMIT" class="btn"></input></th>
        </tr>
    </table>

    </form>
    
		

</body>
</html>