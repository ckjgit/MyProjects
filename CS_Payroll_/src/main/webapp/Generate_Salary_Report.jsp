<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.text.DecimalFormat" %>    
<%@ page import="converter.EnglishNumberToWords" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="Generate_Salary_Report.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    

</head>
<body>
    <h2>CS PAYROLL PVT. LTD.</h2>
    <h4>JK 32, Bidanasi, Cuttack, Odisha, 753014</h4>
    <br><br>

    <h3>Payslip for the month of </h3>

    <div class="row">
        <div class="column" style="background-color: ;">
            <table class="table01">
                <tr>
                    <td><b>Name </b></td>
                    <td>
                        <label for="">Sachin Parida</label>
                    </td>
                </tr>
                <tr>
                    <td><b>Designation </b></td>
                    <td>
                        <label for="">Software Developer</label>
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
                    <td><b>Employee No. </b></td>
                    <td>
                        <label for="">001</label>
                    </td>
                </tr>
                <tr>
                    <td><b>Employee No. </b></td>
                    <td>
                        <label for="">Software Developer</label>
                    </td>
                </tr>
                <tr>
                    <td><b>IFSC Code </b></td>
                    <td>
                        <label for="">30</label>
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
                <label for="">Basic Pay</label>
            </td>
            <td>
                <label for="">15000</label>
            </td>
            <td class="th4">
                <label for="">PF</label>
            </td>
            <td>
                <label for="">4500</label>
            </td>
        </tr>
        <tr>
            <td>
                <label for="">HRA</label>
            </td>
            <td>
                <label for="">3500</label>
            </td>
            <td class="th4">
                <label for="">Income Tax</label>
            </td>
            <td>
                <label for="">980</label>
            </td>
        </tr>
        <tr>
            <td>
                <label for="">TA</label>
            </td>
            <td>
                <label for="">0</label>
            </td>
            <td class="th4">
                <label for="">Prof. Tax</label>
            </td>
            <td>
                <label for="">200</label>
            </td>
        </tr>
        <tr>
            <td>
                <label for="">DA</label>
            </td>
            <td>
                <label for="">0</label>
            </td>
            <td class="th4"></td>
        </tr>
        <tr>
            <td>
                <label for="">MA</label>
            </td>
            <td>
                <label for="">0</label>
            </td>
            <td class="th4"></td>
        </tr>

        <tr>
            <th class="th2">
                <b>Total Earning :-</b>
            </th>
            <th class="th2">
                <b><label for="">18500.00</label></b>
            </th>
            <th class="th5">
                <b>Total Deduction :-</b>
            </th>
            <th class="th2">
                <b><label for="">10000.00</label></b>
            </th>
        </tr>
    </table>
    </center>

    <h3 class="lab01">Net Pay :- 18,500.00</h3>
    <%=
	
		out.print(EnglishNumberToWords.convert(4557)+" Rupees Only");
	
	%>
    

    <hr>
    <h4>This is a System Generated Payslip does not require a Signature</h4>
    <br>
    <center>
        <input type="button" value="Print" onclick="printDiv('printThisDiv')" /> 
    </center>
</body>
</html>