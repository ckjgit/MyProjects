<%-- 
    Document   : data_view
    Created on : 20 Jan, 2022, 9:33:09 PM
    Author     : chinm
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>JSP Page</title>
    </head>
    <body >
    <center>
        
        <%! 
            String c_no=null;
            String c_name=null;
            String ar_code=null;
            String mr_code=null;
            String phase=null;
            String c_load=null;
            String post_no=null;
            String tariff=null;
            String address=null;
            String date=null;
            String meter_no=null; String noof_digits=null;
            String init_rd=null;
            String mobile=null;

            %>
        <%
            
            String s=request.getParameter("combobox");
            //out.print(s);
            
            Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
				Statement st=con.createStatement();
                    
                    String ss=" select * from consumer007 where consumer_no='"+s+"' ";
                    ResultSet rs=st.executeQuery(ss);
                    while(rs.next()!=false)
                    {
                        c_no=rs.getString(1);
                        c_name=rs.getString(2);
                        ar_code=rs.getString(3);
                        mr_code=rs.getString(4);  phase=rs.getString(5); c_load=rs.getString(6); post_no=rs.getString(7); 
                        tariff=rs.getString(8); address=rs.getString(9); date=rs.getString(10); meter_no=rs.getString(11); noof_digits=rs.getString(12);
                        init_rd=rs.getString(13); mobile=rs.getString(14);
                    }
                    


            %>
            
            <font size="5" color="maron"><u>&nbsp;&nbsp;Consumer Details&nbsp;&nbsp;</u></font><br><br><br><br>
            Consumer Number : <%=c_no%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Consumer Name : <%=c_name%><br><br>
            Area Code : <%=ar_code%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Meter Reader Code : <%=mr_code%><br><br>
            Phase : <%=phase%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Connected Load : <%=c_load%><br><br>
            Post Number : <%=post_no%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tariff ID : <%=tariff%><br><br>
            Date Of Connection : <%=date%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Meter Number : <%=meter_no%><br><br>
            No Of Digits : <%=noof_digits%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Initial Reading : <%=init_rd%><br><br>
            Address : <%=address%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Mobile No : <%=mobile%>
            
            
            
    </center>
    </body>
</html>
