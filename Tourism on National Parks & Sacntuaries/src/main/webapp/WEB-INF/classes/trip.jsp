<%@ page language="java" contentType="text/html" %>

<html>
	<head><title>Make My Trip</title></head>
	
		<body bgcolor="lightgreen">
			<center>
				<%
					ServletContext con=request.getServletContext();
					String cc=(String)con.getAttribute("k1");
					out.print("<marquee><h2>Welcome&nbsp;&nbsp;"+cc+"</h2></marquee>");
				%>
				<br><br>
				<h2>Welcome &nbsp;&nbsp;</h2>
			</center>
			<hr><hr>
			<center><font color="red" size="6">Pick Out Your Trip</font></center>
			<br><br><p><font color="red" size="6">UNESCO</font><font color="green" size="4"> World Heritage Wildlife Sites in India</font></p>	
	
			
			<table>
            <tc>
                <td><a href="trip02.jsp" target="blank"><img src="HIM.jpg" width="300" height="200" alt="The Great Himalayan National Park"><br>The Great Himalayan National Park</a></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
            </tc>
			
			<tc> <td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
			
			<tc>
				<td><a href="trip02.jsp"  target="blank"><img src="NAND.jpg" width="300" height="200" alt="The Nanda Devi National Park"><br>The Nanda Devi National Park</a></td>
			</tc>
			
			<tc> <td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
			
			<tc>
				<td><a href="trip02.jsp"  target="blank"><img src="manas.jpg" width="300" height="200" alt="The Manas National Park"><br>The Mansa National Park</a></td>
			</tc>
			
			<tc> <td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
			
			<tc>
				<td><a href="trip02.jsp" target="blank"><img src="keoladeo.jpg" width="300" height="200" alt="The Keoladeo National Park"><br>The Keoladeo National Park</a></td>
			</tc>
			
			<tc> <td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>  
			
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
			
			<tr>
				<td><a href="trip02.jsp" target="blank"><img src="kanchana.jpg" width="300" height="200" alt="The Kanchana National Park"><br>The Khangchendzonga National Park</a></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
				<td><a href="trip02.jsp" target="blank"><img src="sunderban.jpg" width="300" height="200" alt="The Sunderban National Park"><br>The Sunderban National Park</a></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
				<td><a href="trip02.jsp" target="blank"><img src="valley_of_flower.jpg" width="300" height="200" alt="The Sunderban National Park"><br>The Valley of Flower National Park</a></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
				<td><a href="trip02.jsp" target="blank"><img src="kaziranga.jpg" width="300" height="200" alt="The Sunderban National Park"><br>The Kaziranga National Park</a></td>
			</tr>
			
			
        </table>
		<br><br>
			<hr>
			<br><br><p><font color="red" size="6">UNESCO</font><font color="green" size="4"> Recognised Wildlife Sanctuaries in India</font></p>	
	<br><p>Some of India's Sanctuaries have been recognized by UNESCO as World Heritage Sites.</p>
			
			<table>
            <tc>
                <td><a href="trip02.jsp" target="blank"><img src="interview.jpg" width="300" height="200" alt="The Great Himalayan National Park"><br>Interview Island Wild-Life Sanctuary, Andaman</a></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
            </tc>
			
			<tc> <td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
			
			<tc>
				<td><a href="trip02.jsp" target="blank"><img src="chinnar.jpg" width="300" height="200" alt="The Nanda Devi National Park"><br>Chinnar Wild-Life Sanctuary, Kerala&nbsp;&nbsp;&nbsp;Save Wild Save Earth</a></td>
			</tc>
			
			<tc> <td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
			
			<tc>
				<td><a href="trip02.jsp" target="blank"><img src="karakoram.jpg" width="300" height="200" alt="The Manas National Park"><br>Karakoram Wild-Life Sanctuary, Jammu & Kashmir</a></td>
			</tc>
			
			<tc> <td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
			
			<tc>
				<td><a href="trip02.jsp" target="blank"><img src="rollapadu.jpg" width="300" height="200" alt="The Keoladeo National Park"><br>Rollapadu Wild-Life Sanctuary, AndhraPradesh</a></td>
			</tc>
			
			<tc> <td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>  
			
				<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
			
			<tr>
				<td><a href="trip02.jsp" target="blank"><img src="Bhitarkanika.jpg" width="300" height="200" alt="The Kanchana National Park"><br>Bhitarkanika Wild-Life Sanctuary, Odisha View the Soul Source of Birds</a></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
				<td><a href="trip02.jsp" target="blank"><img src="grizzled.jpg" width="300" height="200" alt="The Sunderban National Park"><br>Grizzled Squirrel Wild-Life Sanctuary, TamilNadu</a></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
				<td><a href="trip02.jsp" target="blank"><img src="chilika.jpg" width="300" height="200" alt="The Sunderban National Park"><br>Chillika Wild-Life Sanctuary, Odisha&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tc>
				<td><a href="trip02.jsp" target="blank"><img src="ushakothi.jpg" width="300" height="200" alt="The Sunderban National Park"><br>Ushakothi Wild-Life Sanctuary, Odisha&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></td>
			</tr>
			
			
        </table><br><br><br>
		<center><a href="index.html"><font color="red" size="5">LogOut</font></a>    </center><br><br>
		</body>
</html>