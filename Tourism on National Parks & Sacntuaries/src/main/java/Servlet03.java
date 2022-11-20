import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class Servlet03 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
	

	
			try
			{
				String s11=req.getParameter("s1");
				String s12=req.getParameter("s2");
				String s13=req.getParameter("s3");
				String s14=req.getParameter("s4");
				String s15=req.getParameter("s5");
				
				if(s11.equals("") || s12.equals("") || s13.equals("") || s14.equals("") || s15.equals("") )
				{
					pw.print("<br><h2> Please Enter Valid Details in Appropriate Field...</h2>");
					RequestDispatcher rd=req.getRequestDispatcher("newuser.html");
					rd.include(req,res);
					
				}
					
			
			//--------------------------------------DataBase Create and Link--------------------------------
				else{
					
				
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
					
				
				
				Statement st=con.createStatement();
				
				String v="select * from User01 where uname='"+s14+"' ";
				ResultSet rs=st.executeQuery(v);
				String nuname=null;
				String nfullname=null;
				
				while(rs.next()!=false)
				{
					nuname=rs.getString("uname");
					nfullname=rs.getString("name");
				}
				if(s14.equals(nuname))
				{
					pw.print("Username or Name Exists...!!");
					RequestDispatcher rd=req.getRequestDispatcher("newuser.html");
					rd.include(req,res);
				}
				else
				{
					
					String s="insert into User01 values('"+s11+"', '"+s12+"', '"+s13+"',  '"+s14+"',  '"+s15+"')  ";
					
					int k=st.executeUpdate(s);
					if(k>=1)
					{
						
						RequestDispatcher rd=req.getRequestDispatcher("./s04");
						rd.forward(req,res);
					}	
					
					else
					{pw.print("User Not Created...");
					
					
					pw.print("<br>Else Execute..");
					pw.print("<br>S11 value is"+s11);
					pw.print("<br>S12 value is"+s12);
					pw.print("<br>S13 value is"+s13);
					pw.print("<br>S14 value is"+s14);
					pw.print("<br>S15 value is"+s15);  }
					
					
				}		//else end
				
				
				
				
				}			//try end
				
		}
			
			
			catch(SQLException e){pw.print(e.getMessage());pw.print("<br>Error Throws..");}
			catch(ClassNotFoundException ex){pw.print(ex.getMessage());pw.print("<br>nn");}
			catch(NullPointerException exx){pw.print(exx.getMessage());pw.print("<br>Please Enter Valid Details..");}
			
			pw.close();
	}
}


