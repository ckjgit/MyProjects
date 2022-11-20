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
        <title>Consumer Data Entry</title>
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
    <body>
    <center>
	
        <font color="red" size="5"><u>&nbsp;&nbsp;&nbsp;Consumer Data Entry&nbsp;&nbsp;&nbsp;</u></font>
        <br><br><br><br><br>
	<form action="./jsp02" method="get">
        <table>
           
                <tr>
                    <td>
                         Consumer Number:&nbsp;&nbsp;<input type="text"  placeholder="Enter Consumer Number" name="consumer_no"/>
                    </td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        Consumer Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Consumer Name" name="consumer_name"/>
                    </td>
				</tr>
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
				<tr>
                    <td>
                        Area Code:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Consumer Area Code" name="area_code"/>
                    </td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        Meter Reader Code:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Consumer MR Code" name="meter_reader_code"/>
                    </td>
				</tr>
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
				<tr>
                    <td>
                        Phase:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Phase" name="phase"/>
                    </td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        Connected Load:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Connected Load" name="load"/>
                    </td>
                    
                </tr>
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
				<tr>
					<td>
                        Post Number:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Post Number" name="post"/>
                    </td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>
                        Tariff ID:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  placeholder="Enter Tariff ID" name="tariff"/>
                    </td>
				</tr>
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
				<tr>
					<td>
                        Consumer Address:&nbsp;&nbsp;&nbsp;&nbsp;<textarea  placeholder="Enter Consumer Address" name="address"></textarea>
                    </td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        Date Of Connection:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="date"  name="consumer_no"/>
                    </td>
				</tr>
            
           
        </table>
               <br><br>
			<input type="submit" name="s1"  value="SUBMIT & PROCEED" />
    </form>                
                    
                    
                    
                    
                    
                    
    </center>
    </body>
</html>
