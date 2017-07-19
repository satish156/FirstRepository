package MyFirstWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.RequestDispatcher;


public class PersonalInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String first_name = request.getParameter("fname");
		String middle_name = request.getParameter("mname");
		String last_name = request.getParameter("lname");
		String sex = request.getParameter("gender");
		
		HttpSession session = request.getSession();
		session.setAttribute("fname", first_name);
		session.setAttribute("mname", middle_name);
		session.setAttribute("lname", last_name);
		session.setAttribute("gender", sex);

		PrintWriter out = response.getWriter(); 
		
		out.println(" first name : " + first_name + "<br/>");
		out.println(" middle name : " + middle_name + "<br/>");
		out.println(" last name : " + last_name + " <br/>");
		out.println(" gender :" + sex + "<br/>");
		response.sendRedirect("contactInfo.html");
	}

}
