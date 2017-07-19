package raam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/sessionEx")
public class sessionEx extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("t1");
		HttpSession session = request.getSession();
		javax.servlet.ServletContext context = request.getServletContext();
		
		if(name != null){
		session.setAttribute("peru", name);
		context.setAttribute("peru", name);
		}
		out.print("<html><body>");
		out.print("the request op is " + name + "</br>");
		out.print("the session op is " + session.getAttribute("peru") + "</br>");
		out.print("the context op is " + context.getAttribute("peru"));
		out.print("</body></html>");
	}

	

}
