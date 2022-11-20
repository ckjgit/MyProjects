import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class Servlet04 extends HttpServlet
{
	static int count=10;
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
	
		pw.print("<h2>THIS IS MY SERVLET 04 PAGE</h2>");
	
		pw.print("<br><br>");
		pw.print("<html>");
		pw.print("<head>");
		pw.print("<title>www.MyApp26.com</title>");
		pw.print("</head>");
		pw.print("<body bgcolor='lightblue'>");
		pw.print("<center>");
		pw.print("<br><br>");
		
		if(count==1)
		{
			count=10;
			
			pw.print("<label>User Created...</label>");
			res.setHeader("refresh","4;URL=newuser.html");
		}
		else
		{
			pw.print("<label><h4>Please Wait </h4></label>"+count);
			count--;
			res.setHeader("refresh","1;URL=./s04");
		}
		
		
		
		
		
		pw.print("</center>");
		pw.print("</body>");
		pw.print("</html>");
		//ses.invalidate();
		
		pw.close();
	}
}


