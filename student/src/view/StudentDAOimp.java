package view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDAOimp implements StudentDAO {
	@Override
	public List<Student> getstudent() {
		// TODO Auto-generated method stub
		Connection conn = Studentregister.connect();
		Statement stmt;
		List<Student> ls = new ArrayList<Student>();
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM t_student";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Student st = new Student();
				st.setStudentnumber(rs.getString("studentID"));
				st.setName(rs.getString("name"));
				st.setLastname(rs.getString("lastname"));
				st.setPhone(rs.getString("phone"));
				st.setAddress(rs.getString("address"));
				st.setFaculty(rs.getString("faculty"));
				st.setDOB(rs.getDate("DOB"));
				ls.add(st);

			}
			System.out.println(ls.size());
			return ls;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insertStudent(Student Student) {
		// TODO Auto-generated method stub
		Connection conn = Studentregister.connect();
		Statement stmt;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		String dateofbirth = dateFormat.format(Student.getDOB());

		String sql = "Insert into t_student values(" + Student.getStudentnumber() + ",'" + Student.getName() + "','"
				+ Student.getLastname() + "','" + Student.getPhone() + "','" + Student.getAddress() + "','"
				+ Student.getFaculty() + "','" + dateofbirth + "')";
		System.out.println(sql);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Already inserted data");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(String ID) {
		// TODO Auto-generated method stub
		Connection conn = Studentregister.connect();
		Statement stmt;
		String sql = "delete from t_student where studentID=" + ID;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Delete data");
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		Connection conn = Studentregister.connect();
		Statement stmt;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		String dateofbirth = dateFormat.format(student.getDOB());

		String sql = "UPDATE t_student set name = '" + student.getName() + "',lastname = '" + student.getLastname()
				+ "',phone = '" + student.getPhone() + "',address = '" + student.getAddress() + "',faculty = '"
				+ student.getFaculty() + "',dob = '" + dateofbirth + "'";
		System.out.println(sql);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Already update data");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Student getOneStudent(String id) {
		Connection conn = Studentregister.connect();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM t_student WHERE studentID = " + id;
			System.out.println("getOne " + sql);
			ResultSet rs = stmt.executeQuery(sql);
			Student st = new Student();
			while (rs.next()) {
				st.setStudentnumber(rs.getString("studentID"));
				st.setName(rs.getString("name"));
				st.setLastname(rs.getString("lastname"));
				st.setPhone(rs.getString("phone"));
				st.setAddress(rs.getString("address"));
				st.setFaculty(rs.getString("faculty"));
				st.setDOB(rs.getDate("DOB"));
				System.out.println(st.getName() + st.getDOB());
			}
			return st;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
