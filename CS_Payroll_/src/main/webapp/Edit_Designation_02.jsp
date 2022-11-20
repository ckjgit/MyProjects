<%@ page import="java.sql.*" %>
   
<!DOCTYPE html>
<html>
	<head>
	
	<link rel="stylesheet" href="Add_Designation.css">
    

    <style>
        .form-submit-button {
        background: #2485cf;
        padding: 18px 32px;
        color: #fff;
        border: 1px solid #eee;
        border-radius: 20px;
        box-shadow: 5px 5px 5px rgb(201, 199, 199);
        text-shadow: none;
        font-size: 20px;
        }
        .form-submit-button:hover {
        background: #d54521;
        padding: 18px 32px;
        color: #fff;
        border: 1px solid #eee;
        border-radius: 20px;
        box-shadow: 5px 5px 5px rgb(177, 106, 106);
        text-shadow: none;
        font-size: 20px;
        }

    </style>
	</head>
	
	<body>
	
	<%!
	
		
		String vdesig=null;
	
		String vbasicpay=null;
		String vsalary=null;
		String vta=null;
		String vda=null;
		String vma=null;
		String vhra=null;
			
		
		
	%>
	
	<%
		vdesig=request.getParameter("designation");
	
	
	
			
			try
			{
				
			
		
		
			//--------------------------------------DataBase Create and Link--------------------------------
		
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
				
				Statement st=con.createStatement();
				String s="select * from designation where designation='"+vdesig+"' ";
				
				ResultSet rs=st.executeQuery(s);
				while(rs.next()!=false){
					
					vbasicpay=rs.getString(2);
					vsalary=rs.getString(3);
					vta=rs.getString(4);
					vda=rs.getString(5);
					vma=rs.getString(6);
					vhra=rs.getString(7);
				}
				
				
				
				
			}
			//catch(ServletException e){out.print(e.getMessage());}
			catch(Exception e)
				{out.print(e.getMessage());out.print("<br>Error Throws..");}
			
	
	
	%>
	<br><br><br><br>
	<h1 class="Title">Edit Designation</h1>
    <hr><br>
		
	
		 <form action="./s011" method="get">
            <table class="table01">
            <tr>
                <td class="td1">
                    <label for="">Designation : </label>
                </td>
                <td class="td2">
                    <div class="col-3">
                        <select class="effect-9" name="designation_02" id="">
                            <option><%=vdesig %></option>
                            <option value="software engineer">Software Engineer</option>
                            <option value="Sr. Software Engineer">Sr. Software Engineer</option>
                            <option value="Project Manager">Project Manager</option>
                            <option value="Finance Manager">Finance Manager</option>
                            <option value="Web Developer">Web Developer</option>
                            <option value="Full Stack Developer">Full Stack Developer</option>
                            <option value="Business Analytics">Business Analytics</option>
                            <option value="Account Executive">Account Executive</option>
                        </select>
                          <span class="focus-border">
                            <i></i>
                          </span>
                    </div>
                </td>

                <td  class="td1">
                    <label for="">Basic Pay : </label>
                </td>
                <td class="td2">
                    <div class="col-3">
                        <input class="effect-9" type="number" step="0.01" name="basicpay" value="<%=vbasicpay%>" required>
                          <span class="focus-border">
                            <i></i>
                          </span>
                    </div>
                </td>

                <td class="td1">
                    <label for="">Salary : </label>
                </td>
                <td class="td2">
                    <div class="col-3">
                        <input class="effect-9" type="number" step="0.01" name="salary" value="<%=vsalary %>" required>
                          <span class="focus-border">
                            <i></i>
                          </span>
                    </div>
                </td>
            </tr>

            <tr>
                <td class="td1">
                    <label for="">TA : </label>
                </td>
                <td class="td2">
                    <div class="col-3">
                        <input class="effect-9" type="number" step="0.01" name="travel" value="<%=vta %>"  required>
                          <span class="focus-border">
                            <i></i>
                          </span>
                    </div>
                </td>

                <td class="td1">
                    <label for="">DA : </label>
                </td>
                <td class="td2">
                    <div class="col-3">
                        <input class="effect-9" type="number" step="0.01" name="dearness" value="<%=vda %>"  required>
                          <span class="focus-border">
                            <i></i>
                          </span>
                    </div>
                </td>

                <td class="td1">
                    <label for="">MA : </label>
                </td>
                <td class="td2">
                    <div class="col-3">
                        <input class="effect-9" type="number" step="0.01" name="medical" value="<%=vma %>"  required>
                          <span class="focus-border">
                            <i></i>
                          </span>
                    </div>
                </td>
            </tr>

            <tr>
                <td class="td1">
                    <label for="">HRA : </label>
                </td>
                <td class="td2">
                    <div class="col-3">
                        <input class="effect-9" type="number" step="0.01" name="hra" value="<%=vhra %>"  required>
                          <span class="focus-border">
                            <i></i>
                          </span>
                    </div>
                </td>
            </tr>
        </table>

        <br><br>
        
            
            <center>
             <input type="submit" value="Submit" class="form-submit-button">
           </center>
        </form>
	</body>
</html>