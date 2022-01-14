package controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import view.StudentDAOimp;

	@WebServlet("/saveStudent")
	public class Savestudent extends HttpServlet {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1;
		StudentDAOimp studentDAO = new StudentDAOimp();
	  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  System.out.println("insert");
		Student st = new Student();
		Date date = new Date();
		String id =  req.getParameter("studentnumber");
		String name =  req.getParameter("name");
		String lastname =  req.getParameter("lastname");
		String phone = req.getParameter("phone");
		String strdate =  req.getParameter("DOB");
		DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		try {
			date = (Date) formatter.parse(strdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String address = req.getParameter("address");
		String faculty = req.getParameter("faculty");
		st.setStudentnumber(id);
		st.setName(name);
		st.setLastname(lastname);
		st.setPhone(phone);
		st.setDOB(date);
		st.setAddress(address);
		st.setFaculty(faculty);
		studentDAO.insertStudent(st);
		resp.sendRedirect("list");
	  }
	}
