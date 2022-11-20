import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class Servlet05 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
	

	
			try
			{
				String s11=req.getParameter("r1");
				String s12=req.getParameter("r2");
			
			if(s11.equals("") && s12.equals(""))
			{
				pw.print("<br><h2> Please Enter Valid Details in Appropriate Field...</h2>");
				RequestDispatcher rd=req.getRequestDispatcher("forgotpassword.html");
				rd.include(req,res);
			}
			
			
			//--------------------------------------DataBase Create and Link--------------------------------
			else{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
				
				
				
				Statement st=con.createStatement();
				
				String v="select * from User01 where mobile='"+s12+"' ";
				ResultSet rs=st.executeQuery(v);
				String vpass=null;
				String vmobile=null;
				
				while(rs.next()!=false)
				{
					vpass=rs.getString("pass");
					vmobile=rs.getString("mobile");
				}
				if(s12.equals(vmobile))
				{
					ServletContext cont=req.getServletContext();
					cont.setAttribute("d",vpass);
					RequestDispatcher rd=req.getRequestDispatcher("./s06");
					rd.forward(req,res);
				}
				else
				{
					RequestDispatcher rd=req.getRequestDispatcher("./s07");
					rd.forward(req,res);
					
					
				
				}
				
				
			}
				
				
				
				
			}
			catch(SQLException e){pw.print(e.getMessage());pw.print("<br>Please Enter Valid Details..");}
			catch(ClassNotFoundException e){pw.print(e.getMessage());pw.print("<br>Please Enter Valid Details..");}
			catch(NullPointerException e){pw.print(e.getMessage());pw.print("<br>Please Enter Valid Details..");}
			
			pw.close();
	}
}


