package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WelcomeServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		res.setContentType("text/html");
	    PrintWriter out=res.getWriter();
	    
	Cookie arr[]=req.getCookies();
	if(arr==null) {
		out.println("first login");
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, res);
		
	}else {
		out.println("Welcome : "+arr[0].getValue());
	
	    out.println("<html>");
	    out.println("<hr>");
	    out.println("<form method='post' action='logout' >");
	    out.println("<input type='submit' value='signout' >");
	    out.println("</form>");
	    out.println("<hr>");
	    out.println("</html>");
	    
	
	}
	      
	}
}
