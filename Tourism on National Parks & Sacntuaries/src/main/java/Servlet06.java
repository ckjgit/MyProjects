import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class Servlet06 extends HttpServlet
{
	static int c=10;
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
	
		pw.print("<h2>THIS IS MY SERVLET 06 PAGE</h2>");
	
		pw.print("<br><br>");
		pw.print("<html>");
		pw.print("<head>");
		pw.print("<title>www.MyApp26A.com</title>");
		pw.print("</head>");
		pw.print("<body bgcolor='lightblue'>");
		pw.print("<center>");
		pw.print("<br><br>");
		
		
		
		if(c==1)
		{
			
			
			ServletContext con=req.getServletContext();
					pw.print("Password Is :"+(String)con.getAttribute("d"));
					c=10;
			res.setHeader("refresh","4;URL=forgotpassword.html");
		}
		else
		{
			pw.print("<label><h4>Please Wait </h4></label>"+c);
			res.setHeader("refresh","1;URL=./s06");
			c--;
		}
		
		
		
		pw.print("</center>");
		pw.print("</body>");
		pw.print("</html>");
		
		pw.close();
	}
}


