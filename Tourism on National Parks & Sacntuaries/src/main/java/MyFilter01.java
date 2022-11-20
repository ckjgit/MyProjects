import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFilter01 implements Filter
{
	public void init(FilterConfig fconfig){}
	
	public void destroy(){}
	
	public void doFilter(ServletRequest freq,ServletResponse fres,FilterChain chain)throws IOException,ServletException
	{
		fres.setContentType("text/html");
		PrintWriter pw=fres.getWriter();
		
		try
		{
				String s=freq.getParameter("s3");
			
			//-----------------cnd 01-------------------------------------
			char ch=s.charAt(0);		
			
			//-----------------cnd 02-------------------------------------
			char a[]=s.toCharArray();		
			int k=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==32)
					k=1;
			}
			
			//--------------------cnd 03----------------------------------
			
			String x[]=s.split("@");
			
			char b[]=x[0].toCharArray();
			int z=0;
			for(int i=0;i<b.length;i++)
			{
				if((b[i]>=97 && b[i]<=122) || (b[i]>=48 && b[i]<=57) || (b[i]=='.') || (b[i]=='_') );
				
				else
					z=1;
			}
			//----------------------cnd 04--------------------------------
			
			char c[]=s.toCharArray();
			int p=0;
			for(int i=0;i<c.length;i++)
			{
				if(c[i]>=65 && c[i]<=90)
					p=1;
			}
			
			//----------------------Compilation of Condition--------------
			
			if((p==0) && s.endsWith("mail.com")==true || s.endsWith("inbox.com")==true || s.endsWith("outlook.com")==true || s.endsWith("yahoo.com")==true ||  s.endsWith("gmail.com")==true && (k==0) && (z==0) && (x.length==2) )
					if(ch>=97&& ch<=122)
						chain.doFilter(freq,fres);
					else
						{
							pw.print("<h3>Invalid Email...<h3>");
							pw.print("<h3>1st Character Can not be Number...<h3>");
							RequestDispatcher rd=freq.getRequestDispatcher("newuser.html");
							rd.include(freq,fres);
						}
						
			else
			{
				pw.print("<h3>Invalid Email...<h3>");
				pw.print("<h3>Please Entre Valid Email...<h3>");
				RequestDispatcher rd=freq.getRequestDispatcher("newuser.html");
				rd.include(freq,fres);
			}
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			pw.print("<h3>Please Entre Valid Email...<h3>");
			RequestDispatcher rd=freq.getRequestDispatcher("newuser.html");
			rd.include(freq,fres);
		}
		
		
		
		
	}
}