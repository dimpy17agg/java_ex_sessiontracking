package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ValidateServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		res.setContentType("text/html");
	    PrintWriter out=res.getWriter();
	    
    String userName=req.getParameter("userName");
    String userPassword=req.getParameter("userPassword");
    
		if(userName.equals("admin") && userPassword.equals("ducat")) {
			Cookie c1=new Cookie("userName",userName);
			Cookie c2=new Cookie("userPassword",userPassword);
			c1.setMaxAge(60);
			c2.setMaxAge(60);
			res.addCookie(c1);
			res.addCookie(c2);
			res.sendRedirect("wel");
		}
		else {
			out.println("check username and password");
	
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, res);
		}
		
	
	}
	
	
}
