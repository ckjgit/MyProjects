<%-- 
    Document   : data_entry01
    Created on : 16 Jan, 2022, 9:37:10 PM
    Author     : chinm
--%>

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
		</style>
    </head>
    <body bgcolor="lightblue">
    <center>
	
        <font color="green" size="5"><u>&nbsp;&nbsp;&nbsp;Meter Details Entry&nbsp;&nbsp;&nbsp;</u></font>
        <br><br><br><br><br>
	<form actiion="index02.html" method="get">
        <table>
           
                <tr>
                    <td>
                         Consumer Number:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  name="consumer_no"/>
                    </td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        Consumer Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  name="consumer_name"/>
                    </td>
				</tr>
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
				<tr>
                    <td>
                        Meter Number:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Meter No" name="area_code"/>
                    </td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        No Of Digits:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter No. Of Digits" name="meter_reader_code"/>
                    </td>
				</tr>
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
				<tr>
                    <td>
                        Initial Reading:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Initial Reading" name="phase"/>
                    </td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        Connected Load:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Connected Load" name="load"/>
                    </td>
                    
                </tr>
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
			
           
        </table>
               <br><br>
			<input type="submit" value="SUBMIT & PROCEED">
    </form>                
                    
                    
                    
                    
                    
                    
    </center>
    </body>
</html>
