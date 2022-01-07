package service;

import java.util.List;
import modelex1.Student;

public interface StudentService {
	public List<Student> getStudent();

	public void insertStudent(Student Student);

	public void deleteStudent(String code);

	public void updateStudent(Student Student);

	public Student selectStudent(String code);
}
