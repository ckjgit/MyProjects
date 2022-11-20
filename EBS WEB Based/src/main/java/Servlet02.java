import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class Servlet02 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
	
		pw.print("<h2>THIS IS MY SERVLET 02 PAGE</h2>");
	
		pw.print("<br><br>");
		pw.print("<html>");
		pw.print("<head>");
		pw.print("<title>www.MyApp26.com</title>");
		pw.print("</head>");
		pw.print("<body bgcolor='lightblue'>");
		pw.print("<center>");
		pw.print("<br><br>");
		
		ServletContext con=req.getServletContext();
		String cc=(String)con.getAttribute("k1");
				pw.print("Welcome&nbsp;&nbsp;"+cc);
		
		//HttpSession ses=req.getSession(false);
		//pw.print("Welcome&nbsp;&nbsp;"+(String)ses.getAttribute("k1"));
		
		//ses.invalidate();
		
		
		
		pw.print("</center>");
		pw.print("</body>");
		pw.print("</html>");
		//ses.invalidate();
		
		pw.close();
	}
}


