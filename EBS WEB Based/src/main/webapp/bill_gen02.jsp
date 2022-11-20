<%-- 
    Document   : bill_gen02
    Created on : 22 Jan, 2022, 5:51:23 PM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Generating Bill</title>
        <script>
            
            function printPage(id)
            {
                var html="<html>";
                html+=document.getElementById(id).innerHTML;
                html+="</html>";
                
                var printWin = window.open('','','left=0,top=0,width=1,height=1,toolbar=0,scrollbars=0,status=0');
                printWin.document.write(html);
                printWin.document.close();
                printWin.focus();
                printWin.print();
                printWin.close();
            }
            
            
        </script>
        
        
    </head>
    <body>
    <center>
        <br>
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
            
            double total_units=0;

            %>
        <%
            
            String s1=request.getParameter("combobox");
            String s2=request.getParameter("fr");
            String s3=(String)request.getParameter("dt2");
            //out.print(s);
            
            Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
				Statement st=con.createStatement();
                    
                    String ss=" select * from consumer007 where consumer_no='"+s1+"' ";
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
            <div id="b1">
            <font color="maron" size="6">T P N O D L</font><br><br>
            -----------------------------------------------------------------------------------------------------------------------------------------------
            <br> Bill Of Supply For Electricity &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contact : 1912/1800 345 6719<br>
            PAN - AAICT5132C &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; TAN - BBNT01978P&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; CIN - U40106OR2021SGC035956
            <br>
            -----------------------------------------------------------------------------------------------------------------------------------------------
            <br>
            
            Consumer No : <%=c_no%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Consumer Name : <%=c_name%><br><br>
            Mobile   No : <%=mobile%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Status      : R(REGULAR)<br><br>
            Meter    No : <%=meter_no%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Meter Owner: TPNODL
            <br>
            ***************************************************************************************************************
            <br>
            Previous Units Consumed : <%=init_rd%><br>
            Last Units     Consumed : <%=s2%><br>
            <%
                total_units=Integer.parseInt(s2)-Integer.parseInt(init_rd);

                %>
            Total Units             : <%=total_units%><br>
            ***************************************************************************************************************
                <br>
                <font color="maron" size="4">Bill Slabs<font> <br><br>
                <%! double b1;
                    double b2=40.0;
                    double b3=40.0;
                    double b4=5.89;
                    double b5=10.36;
                    double b6;
                %>
                <%
                    
                if(total_units<=50)
                    b1=total_units * 3;
                else if(total_units<=200 && total_units>50)
                    b1=total_units * 4.80 ;
                else if(total_units<=400 && total_units>200)
                    b1=total_units * 5.80 ;
                else if(total_units>400)
                    b1=total_units * 6.20;
                    
                b6=b1+b2+b3+b4+b5 ;

                    %>
                    Energy Charges : <%=b1%><br>
                    Fixed Charges  : <%=b2%><br>
                    Meter Rent     : <%=b3%><br>
                    Elec. Duty     : <%=b4%><br>
                    *D.P.S         : <%=b5%><br>DPS levied upto last day of the prev month.<br><br><br>
                    Current AMT.   : <%=b6%><br><br>
                    Bill Generate Date : <%=s3%>
                    <br><br>
                    Bill Due Date      : 20.10.2022<br>Amount After Due Date : <%=(b6+7)%><br>
                    -------------------------------------------------------------------------------------
                    <br><br><br><br>
                    
                    <font color="maron" size="3">
                    For New Connection Please Give a missed call to 7411779791<br>
                    Turnoff light and Appliances when not in use.<br>
                    Use Energy efficient appliances.Never touch electrical lines.
                    <br>Never do construction work near or under the lines.<br><br>
                    *************************************************************************************
                    
                    </font>
            </div>
                    <br><br><br>
                    <input type="button" value="Print" onclick="printPage('b1'); " /> 
    </center>
    </body>
</html>
