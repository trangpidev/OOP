package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addstudent")

	
	public class Addstudent extends HttpServlet {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher =  getServletContext().getRequestDispatcher("/WEB-INF/Student-form.jsp");
		dispatcher.forward(req, resp);
}
}

