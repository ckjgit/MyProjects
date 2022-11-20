<%-- 
    Document   : data_entry01
    Created on : 16 Jan, 2022, 9:37:10 PM
    Author     : chinm
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Meter Details  Entry</title>
		<style>
			input[type=submit]{
				 background-color: lightgrey;
                color: blue;
                border: 2px solid blueviolet;
                padding: 10px 20px;
                margin: 2px 2px;
				cursor: pointer;
			}
        
                a{text-decoration: none;}
        
		</style>
    </head>
    <body bgcolor="lightblue">
    <center>
	
        <font color="green" size="5"><u>&nbsp;&nbsp;&nbsp;Meter Details Entry&nbsp;&nbsp;&nbsp;</u></font>
        <br><br><br><br><br>
	<form action="./lastentry" method="get">
            <%!
                
                String con_no=null;
                String con_na=null;
                String ar_code=null;
                String mr_code=null;
                String phase=null; String mobile=null; String post=null; String tariff=null; String addr=null; String date_of_connection =null;
                
                SimpleDateFormat sdf;
                Date dt;
                %>
            
              <%  
            
            con_no=request.getParameter("consumer_no");
            con_na=request.getParameter("consumer_name");
            ar_code=request.getParameter("area_code");
            mr_code=request.getParameter("meter_reader_code");
            phase=request.getParameter("phase");
            mobile=request.getParameter("load");
            post=request.getParameter("post");
            tariff=request.getParameter("tariff");
            addr=request.getParameter("address");
            date_of_connection=(String)request.getParameter("date");
           
           // sdf=new SimpleDateFormat("dd-mm-yyyy");
           
           //dt=sdf.parse(date_of_connection);
           
            session.setAttribute("k1", con_no);
            session.setAttribute("k2", con_na);
            session.setAttribute("k3", ar_code);
            session.setAttribute("k4", mr_code);
            session.setAttribute("k5", phase);
            session.setAttribute("k6", mobile);
            session.setAttribute("k7", post);
            session.setAttribute("k8", tariff);
            session.setAttribute("k9", addr);
            session.setAttribute("k10", date_of_connection);
            
            %>
            
            
        <table>
           
                <tr>
                    <td>
                        Consumer Number:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  name="consumer_no" value='<%= con_no %>' readonly/>
                    </td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        Consumer Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  name="consumer_name" value='<%= con_na %>' readonly  />
                    </td>
				</tr>
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
				<tr>
                    <td>
                        Meter Number:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Meter No" name="mn"/>
                    </td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        No Of Digits:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter No. Of Digits" name="nd"/>
                    </td>
				</tr>
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
				<tr>
                    <td>
                        Initial Reading:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Initial Reading" name="ir"/>
                    </td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        Connected Load:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  value="Enter Load Connected"  name="load01" />
                    </td>
                    
                </tr>
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
			
           
        </table>
               <br><br>
               	<input type="submit" value="SUBMIT & PROCEED">
    </form>      
                    
                  
                    
                    
                    
                    
                    
    </center>
                    <center><a href="./dataentry">BACK</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</center>
    </body>
</html>
