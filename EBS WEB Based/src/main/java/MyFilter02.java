import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFilter02 implements Filter
{
	public void init(FilterConfig fconfig){}
	
	public void destroy(){}
	
	public void doFilter(ServletRequest freq,ServletResponse fres,FilterChain chain)throws IOException,ServletException
	{
		fres.setContentType("text/html");
		PrintWriter pw=fres.getWriter();
		
		
		

		String s=freq.getParameter("s2");
		if(s.equals(""))
			pw.print("<br><h4>Please Enter Valid Data....</h4>");
		else
		{
					char a[]=s.toCharArray();
				
				int k=0;
				for(int i=0;i<a.length;i++)
				{
					if((a[i]>=48 && a[i]<=57) && a.length==10 );
					else
						k=1;
				}
					
					if(k==0)
						chain.doFilter(freq,fres);
					else
					{
						pw.print("<br><h4>Please Enter a Valid Mobile Number....</h4>");
						RequestDispatcher rd=freq.getRequestDispatcher("newuser.html");
						rd.include(freq,fres);
					}
			
		
		}	
		
		
		
	}
}