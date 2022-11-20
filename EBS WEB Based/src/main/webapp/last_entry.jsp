<%-- 
    Document   : last_entry
    Created on : 17 Jan, 2022, 8:44:01 PM
    Author     : chinm
--%>

<%@page import="java.util.Date"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="lightgreen">
        
    <center>
        <%! static int a=5;

            String s1;
            String s2;
            String s3;
            String s4;
        
        %>
        
       
        <% 
              s1=request.getParameter("mn");
              s2=request.getParameter("nd");
              s3=request.getParameter("ir");
              s4=request.getParameter("load01");
              
            //  session.setAttribute("k11", s1);
            //  session.setAttribute("k12",s2);
             // session.setAttribute("k13",s3);
           
            
               
                   
                    String con_no=(String) session.getAttribute("k1");
                    String con_name=(String) session.getAttribute("k2");
                    String ar_code=(String) session.getAttribute("k3");
                    String mr_code=(String) session.getAttribute("k4");
                    String phase=(String) session.getAttribute("k5");
                    String load=(String) session.getAttribute("k6");
                    String post=(String) session.getAttribute("k7");
                    String tariff=(String) session.getAttribute("k8");
                    String addr=(String) session.getAttribute("k9");
                    String dt=(String)session.getAttribute("k10");
                  //  String d1=(String)session.getAttribute("k11");
                    //String d2=(String)session.getAttribute("k12");
                    //String d3=(String)session.getAttribute("k13");
                    
                   
                    Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909"); Statement st=con.createStatement();
                    String ss="insert into consumer007 values('"+con_no+"', '"+con_name+"', '"+ar_code+"', '"+mr_code+"', '"+phase+"', '"+s4+"', '"+post+"', '"+tariff+"', '"+addr+"', '"+dt+"', '"+s1+"', '"+s2+"', '"+s3+"' ,'"+load+"' )  ";
                    int k=st.executeUpdate(ss);
                   
                   if(k>=1)
                   {
                       out.print(  "<br><br><br><br><br><br><br><br><br><font size='5'> Consumer Data Recorded Successfully..!</font> ");
                       response.setHeader("refresh","5;URL=./s02");
                   }
                   else
                    {
                         out.print(  "<br><br><br><br><br><font size='5'> Oppss..Seems Something went Wront..! </font>");
                         out.print("<br><br><br><font size='5'> Consumer Data Not Recorded </font> ");
                         response.setHeader("refresh","5;URL=./s02");
                    }
                   
                   
                
               
            
            
            
            

            %>
       
        
    </center>
        
    </body>
</html>
