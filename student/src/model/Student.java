package model;

import java.sql.Date;

	public class Student  {
	    private String studentnumber;
	    private String name;
	    private String lastname;
	    private String phone;
	    private String address;
	    private String faculty;
	    private java.util.Date DOB;
	    
		public String getStudentnumber() {
			return studentnumber;
		}
		public void setStudentnumber(String studentnumber) {
			this.studentnumber = studentnumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getFaculty() {
			return faculty;
		}
		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}
		public java.util.Date getDOB() {
			return DOB;
		}
		public void setDOB(java.util.Date date) {
			DOB = date;
		}
		@Override
		public String toString() {
			return "student [studentnumber=" + studentnumber + ", name=" + name + ", lastname=" + lastname + ", phone="
					+ phone + ", address=" + address + ", faculty=" + faculty + ", DOB=" + DOB + "]";
		}
		public Student(String studentnumber, String name, String lastname, String phone, String address, String faculty,
				Date dOB) {
			super();
			this.studentnumber = studentnumber;
			this.name = name;
			this.lastname = lastname;
			this.phone = phone;
			this.address = address;
			this.faculty = faculty;
			DOB = dOB;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
