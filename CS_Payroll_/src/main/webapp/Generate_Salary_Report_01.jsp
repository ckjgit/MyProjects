<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.text.DecimalFormat" %>    
<%@ page import="converter.EnglishNumberToWords" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
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
    <meta charset="UTF-8">
    <link rel="stylesheet" href="Generate_Salary_Report.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    
    

</head>
<body>

	<%!
		String eid=null;
		String ename=null;
		String edesig=null;
		String esalary=null;
		String epf=null;
		String it=null;
		String ta=null;
		String da=null;
		String ma=null;
		String hra=null;
		
		String month=null;
		String acno=null;
		String netpay=null;
		
	
	%>
	
	<%
		HttpSession ses=request.getSession(false);
		eid=(String)ses.getAttribute("eid");
		ename=(String)ses.getAttribute("ename");
		edesig=(String)ses.getAttribute("edesig");
		
		esalary=(String)ses.getAttribute("salary");
		epf=(String)ses.getAttribute("pf");
		it=(String)ses.getAttribute("it");
		
		ta=(String)ses.getAttribute("ta");
		da=(String)ses.getAttribute("da");
		ma=(String)ses.getAttribute("ma");
		
		hra=(String)ses.getAttribute("hra");
		month=(String)ses.getAttribute("month");
		acno=(String)ses.getAttribute("acno");
		netpay=(String)ses.getAttribute("netpay");
	
		
		double netpaylong=Double.parseDouble(netpay);
		
		double pf1=Double.parseDouble(epf);
		double it1=Double.parseDouble(it);
		
		double td=pf1+it1;
	
	
	%>


    <h2>CS PAYROLL PVT. LTD.</h2>
    <h4>JK 32, Bidanasi, Cuttack, Odisha, 753014</h4>
    <br><br>

    <h3>Payslip for the month of <%=month %></h3>

    <div class="row">
        <div class="column" style="background-color: ;">
            <table class="table01">
                <tr>
                    <td><b>Name </b></td>
                    <td>
                        <label for=""><%=ename %></label>
                    </td>
                </tr>
                <tr>
                    <td><b>Designation </b></td>
                    <td>
                        <label for=""><%=edesig %></label>
                    </td>
                </tr>
                <tr>
                    <td><b>Effective Work Days </b></td>
                    <td>
                        <label for="">30</label>
                    </td>
                </tr>
            </table>
        </div>

        <div class="vl"></div>

        <div class="column" style="background-color: ;">
            <table class="table01">
                <tr>
                    <td><b>Employee ID. </b></td>
                    <td>
                        <label for=""><%=eid %></label>
                    </td>
                </tr>
                <tr>
                    <td><b>Bank A/C No. </b></td>
                    <td>
                        <label for=""><%=acno %></label>
                    </td>
                </tr>
                <tr>
                    <td><b>IFSC Code </b></td>
                    <td>
                        <label for=""><%="HDFC00009058" %></label>
                    </td>
                </tr>
            </table>
        </div>
    </div>

    <br>


    <center>
    <table class="table02">
        <tr>
            <th class="th1">Earning</th>
            <th class="th1">Amount</th>
            <th class="th3">Deduction</th>
            <th class="th1">Amount</th>
        </tr>

        <tr>
            <td>
                <label for="">Salary</label>
            </td>
            <td>
                <label for=""><%=esalary %></label>
            </td>
            <td class="th4">
                <label for="">PF</label>
            </td>
            <td>
                <label for=""><%=epf %></label>
            </td>
        </tr>
        <tr>
            <td>
                <label for="">HRA</label>
            </td>
            <td>
                <label for=""><%=hra %></label>
            </td>
            <td class="th4">
                <label for="">Income Tax</label>
            </td>
            <td>
                <label for=""><%=it %></label>
            </td>
        </tr>
        <tr>
            <td>
                <label for="">TA</label>
            </td>
            <td>
                <label for=""><%=ta %></label>
            </td>
            <td class="th4">
                <label for="">Prof. Tax</label>
            </td>
            <td>
                <label for="">0</label>
            </td>
        </tr>
        <tr>
            <td>
                <label for="">DA</label>
            </td>
            <td>
                <label for=""><%=da %></label>
            </td>
            <td class="th4"></td>
        </tr>
        <tr>
            <td>
                <label for="">MA</label>
            </td>
            <td>
                <label for=""><%=ma %></label>
            </td>
            <td class="th4"></td>
        </tr>

        <tr>
            <th class="th2">
                <b>Total Earning :-</b>
            </th>
            <th class="th2">
                <b><label for=""><%=netpay %></label></b>
            </th>
            <th class="th5">
                <b>Total Deduction :-</b>
            </th>
            <th class="th2">
                <b><label for=""><%=td %></label></b>
            </th>
        </tr>
    </table>
    </center>

    <h3 class="lab01">Net Pay : <%=netpay %></h3>
    <%
		
		out.println(EnglishNumberToWords.convert(netpaylong)+" Rupees Only");
	
	%>
    

    <hr>
    <h4>This is a System Generated Payslip does not require a Signature</h4>
    <br>
    <center>
        <button onclick="window.print()">Print</button> 
    </center>
</body>
</html>