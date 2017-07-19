package MyFirstWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

@WebServlet("/BankInfoServlet")
public class BankInfoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String bname =request.getParameter("bank");
	String ac =request.getParameter("account");
	String ssn =request.getParameter("ssn");
	
	PrintWriter out = response.getWriter();
	out.print("bank name : " + bname + "<br/>");
	out.print("account : " + ac + "<br/>");
	out.print("ssn : " + ssn + "<br/>");
	response.sendRedirect("jsp/Sucess.jsp");
	}

}
