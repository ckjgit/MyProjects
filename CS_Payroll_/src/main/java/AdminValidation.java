

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminValidation extends HttpServlet {
	
	private static final long serialVersionUID = 1576567L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
	
		
			try
			{
				String vname=req.getParameter("username");
				String vpass=req.getParameter("pass");
			
			
			//--------------------------------------DataBase Create and Link--------------------------------
		
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
				
				Statement st=con.createStatement();
				String s="select * from User01 where uname='"+vname+"' ";
				
				ResultSet rs=st.executeQuery(s);
				
				String fullname=null;
				String aname=null;
				String apass=null;
				
				while(rs.next()!=false)
				{
					  fullname=rs.getString("name");
					  aname=rs.getString(4);
					  apass=rs.getString(5);
				}
				
				//pw.print("<br>fullname=&nbsp;"+fullname);
			//	pw.print("<br>uname=&nbsp;"+aname);
				//pw.print("<br>pass=&nbsp;"+apass);
				
				if(vname.equals(aname) && vpass.equals(apass))
				{
					ServletContext cont=req.getServletContext();
				
					cont.setAttribute("k1",fullname);
					RequestDispatcher rd=req.getRequestDispatcher("./s02");
					rd.forward(req,res);
				}
				else
				{
					pw.print("<br> Invalid Credentials...");
					RequestDispatcher rd=req.getRequestDispatcher("./s03");
					rd.include(req,res);
				}
				
				//-------------------Pass Data to Servlet 02 by Context----------------------
				
				//ServletContext cont=req.getServletContext();
				
					//req.setAttribute("k1","kkkkkk");
					
				//	HttpSession ses=req.getSession(true);
				//	ses.setAttribute("k1",fullname);

			}
			catch(ServletException e){pw.print(e.getMessage());}
			catch(SQLException e){pw.print(e.getMessage());pw.print("<br>Error Throws..");}
			catch(ClassNotFoundException e){pw.print(e.getMessage());pw.print("<br>nn ckjjjj");e.printStackTrace();}
			catch(NullPointerException e){pw.print(e.getMessage());pw.print("<br>NullPointerException throws");}
			pw.close();

		
		
	}

}
