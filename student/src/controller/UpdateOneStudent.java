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
@WebServlet("/updateOneStudent")
public class UpdateOneStudent extends HttpServlet {
	private static final long serialVersionUID = 1;
	StudentDAOimp st = new StudentDAOimp();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Student student = new Student();
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String faculty = req.getParameter("faculty");
		String dob = req.getParameter("DOB");
		if (dob != null) {
			DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			Date date = null;
			try {
				date = (Date) formatter.parse(dob);
				student.setDOB(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		student.setName(name);
		student.setLastname(lastname);
		student.setAddress(address);
		student.setPhone(phone);
		student.setFaculty(faculty);
		
		st.updateStudent(student);
		resp.sendRedirect("list");
	}
}
