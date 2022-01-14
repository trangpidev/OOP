package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import view.StudentDAOimp;

	@WebServlet("/list")
	public class Liststudent extends HttpServlet {
	     /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		StudentDAOimp studentDAO = new StudentDAOimp();
	     
	     @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	// TODO Auto-generated method stub
	          List<Student> Student =  studentDAO.getstudent();
	          RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/List-student.jsp");
	          req.setAttribute("Student", Student);
	          rd.forward(req, resp);
	    }
	     
	}

