import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class Servlet07 extends HttpServlet
{
	static int t=10;
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
	
		pw.print("<h2>THIS IS MY SERVLET 07 PAGE</h2>");
	
		pw.print("<br><br>");
		pw.print("<html>");
		pw.print("<head>");
		pw.print("<title>www.MyApp26A.com</title>");
		pw.print("</head>");
		pw.print("<body bgcolor='lightblue'>");
		pw.print("<center>");
		pw.print("<br><br>");
		
		if(t==1)
		{
			t=10;
			
			pw.print("User Data not Found...");
			pw.print("<br><br> Please Enter Valid Details...");
			res.setHeader("refresh","5;URL=forgotpassword.html");
		}
		else
		{
			pw.print("<label><h4>Please Wait </h4></label>"+t);
			res.setHeader("refresh","1;URL=./s07");
			t--;
		}
		
		
		
		pw.print("</center>");
		pw.print("</body>");
		pw.print("</html>");
		
		
		pw.close();
	}
}


