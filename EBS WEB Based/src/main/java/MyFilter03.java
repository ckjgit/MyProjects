import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFilter03 implements Filter
{
	public void init(FilterConfig fconfig){}
	
	public void destroy(){}
	
	public void doFilter(ServletRequest freq,ServletResponse fres,FilterChain chain)throws IOException,ServletException
	{
		fres.setContentType("text/html");
		PrintWriter pw=fres.getWriter();
		
		
		
		String s=freq.getParameter("s5");
		//String v=freq.getParameter("mob");
		
		if(s.equals(""))
			pw.print("<br><h4>Please Enter Valid Data....</h4>");
		else
		{
				char a[]=s.toCharArray();
			int x=a.length;   //------------------------------cnd 01
			int y=0;			//----------------------------cnd 02
			for(int i=0;i<a.length;i++)
			{
				if((a[i]>=32 && a[i]<=47) || (a[i]>=91 && a[i]<=96) || (a[i]>=123 && a[i]<=127) || (a[i]>=58 && a[i]<=64)  )
					y=1;
				
			}
			//-------------------------------------------------------------cnd 03
			
			int z=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>=65 && a[i]<=90)
					z=1;
			}
			
			//-------------------------------------------------------------cnd 04
			
			int b=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>=48 && a[i]<57)
					b=1;
			}
			//-------------------------------------------------------------cnd05
			
			int j=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>=97 && a[i]<=122)
					j=1;
			}
			
			
			//----------------------Compilation of Condition--------------
			
		//		length    spcl symbl		A    -	  Z		  0     -    9      a    -     z
		
			if((x==8) && (y>=1 && y<=5) && (z>=1 && z<=5) && (b>=1 && b<=5) && (j>=1 && j<=5)   )
					chain.doFilter(freq,fres);
			else
				{
					pw.print("<br><h3>Invalid Password...<h3>");
					pw.print("<br><h5>Your password Should be 8 Characters long and must contain atleast one special symbol, one capital letter and small letters and digits..</h5>");
					RequestDispatcher rd=freq.getRequestDispatcher("newuser.html");
					rd.include(freq,fres);
				}
		}
		
		
		
		
		
		
	}
}