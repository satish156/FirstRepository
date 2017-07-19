package MyFirstWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactInfoServlet
 */
@WebServlet("/ContactInfoServlet")
public class ContactInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String address = request.getParameter("add");
		String city = request.getParameter("cit");
		String state = request.getParameter("st");
		String country = request.getParameter("count");
		String phone = request.getParameter("ph");
		
		PrintWriter out = response.getWriter();
		
		out.println("address : " + address +"<br/> ");
		out.println("city : " + city +"<br/> ");
		out.println("state : " + state +"<br/> ");
		out.println("country : " + country +"<br/> ");
		out.println("phone : " + phone +"<br/> ");
		response.sendRedirect("bankInfo1.html");
	}

}
