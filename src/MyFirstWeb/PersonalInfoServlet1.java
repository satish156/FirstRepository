package MyFirstWeb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.RequestDispatcher;

@WebServlet("/PersonalInfoServlet1")
public class PersonalInfoServlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Personal personal = new Personal();	
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		personal.setFirst_name(fname);
		personal.setMiddle_name(mname);
		personal.setLast_name(lname);
		String error = "";
		if(checkFieldBlank(personal.getFirst_name())){
			error  += "first name is blank <br/>"; 
		}
		if(checkFieldBlank(personal.getMiddle_name())){
			error  += "middle name is blank <br/>"; 
		}
		if(checkFieldBlank(personal.getLast_name())){
			error  += "last name is blank <br/>"; 
		}
		if(checkFieldBlank(error)){
			HttpSession session = request.getSession();
			session.setAttribute("pinfo", personal);
			response.sendRedirect("PersonalInfo1.jsp");
		} 
		else{
			request.setAttribute("errors", error);
			javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("PersonalInfo12.jsp ");
			rd.forward(request, response);
		}
		
		
		
	}

	private boolean checkFieldBlank(String fieldValue) {
		// TODO Auto-generated method stub
		return fieldValue == null || fieldValue.length() ==0;
	}

}
