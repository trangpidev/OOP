package view;

import java.util.List;

import model.Student;

public interface StudentDAO {
	public List<Student> getstudent();

	public void insertStudent(Student Student);

	public void deleteStudent(String studentnumber);

	public void updateStudent(Student student);

	public Student getOneStudent(String id);
}
