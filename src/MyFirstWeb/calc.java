package MyFirstWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

@WebServlet("/addition")
public class calc extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));

		double c=a+b;
		double d= a-b;
		double e =a*b;

		PrintWriter out = response.getWriter();
		out.println(c + "<br/>");
		out.println(d + " <br/>");
		out.println(e);

	}

}
