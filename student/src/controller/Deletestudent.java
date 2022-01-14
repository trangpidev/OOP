package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import view.StudentDAOimp;


	@WebServlet("/deleteStudent")
	public class Deletestudent extends HttpServlet {
	   /**
		 * 
		 */
		private static final long serialVersionUID = 1;
	StudentDAOimp studentDAO = new StudentDAOimp();
	   @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String id = req.getParameter("studentID");
			studentDAO.deleteStudent(id);
			resp.sendRedirect("list");
		}

	}

