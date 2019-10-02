package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LogoutServlet extends HttpServlet {

public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		res.setContentType("text/html");
	    PrintWriter out=res.getWriter();
	
	Cookie c1=new Cookie("userName","");
	Cookie c2=new Cookie("userPassword","");
	
	c1.setMaxAge(0);
	c2.setMaxAge(0);
	
	res.addCookie(c1);
	res.addCookie(c2);
	
	out.println("signout.....");
	
}	
	
}
