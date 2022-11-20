<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" >
<link rel="stylesheet" href="Employee_Report.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    
    <style>
    	
    	a {
  outline: none;
  text-decoration: none;
  padding: 2px 1px 0;
		}
		
		a:link {
		  color: #265301;
		}
		
		a:visited {
		  color: #437A16;
		}
		
		a:focus {
		  border-bottom: 1px solid;
		  background: #BAE498;
		}
		
		a:hover {
		  border-bottom: 1px solid;
		  background: #CDFEAA;
		}
		
		a:active {
		  background: #265301;
		  color: #CDFEAA;
		}
		    
    </style>
</head>
<body>


    <h1 class="Title">Employee Report</h1><br><br>
    <hr>
		




		<%!
			String edesig=null;
			String eid=null;
			
			String ename=null;		String emstatus=null;
			String eadd=null;		String edob=null;
			String ecountry=null;	String eemail=null;
			String estate=null;		String emobile=null;
			String ebankac=null;	String epass=null;
			String eifsc=null;		String estatus=null;  String ebg=null;
			String egender=null;	String edoj=null;
		
			String vname=null;		String vmstatus=null;
			String vadd=null;		String vdob=null;
			String vcountry=null;	String vemail=null;
			String vstate=null;		String vmobile=null;
			String vbankac=null;	String vpass=null;
			String vifsc=null;		String vstatus=null;
			String vgender=null;	String vdesig=null;
			String vbg=null;		String vdoj=null;
			
			

		%>
		
		<%
		
			edesig=request.getParameter("Designation");
			eid=request.getParameter("id");
			
			String vid=null;

			try{
				
			//--------------------------------------DataBase Create and Link--------------------------------

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
			
			Statement st=con.createStatement();
			String s="select * from employee where eid='"+eid+"'  and edesig='"+edesig+"'         ";		
			ResultSet rs=st.executeQuery(s);
			
			while(rs.next()!=false){
				vid=rs.getString(1);
				
				System.out.print("-------------------");
				System.out.println(vid);
				

				System.out.println("while stmt worked...");		
				
				vname=rs.getString(2);
				vadd=rs.getString(7);
				vcountry=rs.getString(5);
				System.out.println("ecountry");
				
				vstate=rs.getString(6);
				vbankac=rs.getString(12);
				vifsc=rs.getString(13);
				
				
				vgender=rs.getString(3);
				vmstatus=rs.getString(4);
				vdob=rs.getString(8);
				vemail=rs.getString(9);
				
				vmobile=rs.getString(16);
				vpass=rs.getString(15);
				vstatus=rs.getString(17);
				vdesig=rs.getString(11);
				
				vbg=rs.getString(18);
				vdoj=rs.getString(19);
				
			
			}
			
			
			if(eid.equals(vid)){
				
				System.out.println("if stmt worked...mmm");
				
			
				ename=vname;
				eadd=vadd;
				ecountry=vcountry;
				estate=vstate;
				ebankac=vbankac;
				eifsc=vifsc;
				egender=vgender;
				emstatus=vmstatus;
				edob=vdob;
				eemail=vemail;
				emobile=vmobile;
				epass=vpass;
				estatus=vstatus;
					
				ebg=vbg;
				edoj=vdoj;
				}
				
				
			

			else{

				
				RequestDispatcher rd=request.getRequestDispatcher("Employee_Report_Include03.jsp");
				rd.forward(request,response);
				out.println("Record Not Found...kkk");
								
			}
			
			
			

			
			
		
		
		
		
	}
	
	catch(Exception e){out.print(e.getMessage());
		e.printStackTrace();
	
	out.print("<br>Error Throws..");}
	
			

		%>

			<table width = "100%">
	        <tr>
	            <td>
	                <div class="Input">
	                    <label for="input" class="Input-label">Selected Designation :  </label>
	                    <label><%= vdesig %></label>
	                    
	                </div>
	            </td>
	
	            <td>
	                <div class="Input">
	                    <label for="input" class="Input-label">Selected ID :  </label>
						<label><%= eid %></label>
	                </div>
	            </td>
	
	            <td class="tdb">
	                
	             <a href="Employee_Report_Include01.jsp"><font color="" size="4" ><b>  Search Another</b></font></a>  
	            </td>
	        </tr>
    </table>

    <hr>
    <br>

    

    <table width = "50%" align="left">
        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Employee ID</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= eid %> </label>
            </td>
        </tr>

        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Name</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= ename %> </label>
            </td>
        </tr>

        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Address</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= eadd %> </label>
            </td>
        </tr>

        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Country</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= ecountry %> </label>
            </td>
        </tr>

        <tr>
            <td class="td1">
                <label for="input" class="Input-label">State</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= estate %> </label>
            </td>
        </tr>

        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Bank A/C</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= ebankac %> </label>
            </td>
        </tr>

        <tr>
            <td class="td1">
                <label for="input" class="Input-label">IFSC Code</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= eifsc %> </label>
            </td>
        </tr>
        
        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Blood Group</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= ebg %> </label>
            </td>
        </tr>
    </table>

    <table width = "50%" align="right">
        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Gender</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= egender %> </label>
            </td>
        </tr>
        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Marital Status</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= emstatus %> </label>
            </td>
        </tr>
        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Date of Birth</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= edob %> </label>
            </td>
        </tr>
        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Email</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= eemail %> </label>
            </td>
        </tr>
        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Mobile</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= emobile %> </label>
            </td>
        </tr>
        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Password</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= epass %> </label>
            </td>
        </tr>
        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Status</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= estatus %> </label>
            </td>
        </tr>
        
        <tr>
            <td class="td1">
                <label for="input" class="Input-label">Date of Joining</label>
            </td>
            <td class="tdm">
                <label for="input" class="Input-label"> : </label>
            </td>
            <td class="td2">
                <label for="input" class="Input-label"><%= edoj %> </label>
            </td>
        </tr>
    </table>
    <br>
        <br><br>
        <hr>
        <br>


</body>
</html>