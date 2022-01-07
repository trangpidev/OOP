package modelex1;

import java.util.Scanner;

public class Person {
	private String name;
	private String gender;
	private String address;
	private String dateOfBirth;

	public Person() {
	}

	public Person(String name, String gender, String address, String dateOfBirth) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public void inputInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ho va ten : ");
		name = scan.nextLine();

		System.out.println("Nhap gioi tinh : ");
		gender = scan.nextLine();

		System.out.println("Nhap vào dia chi : ");
		address = scan.nextLine();

		System.out.println("Nhap ngay sinh : ");
		dateOfBirth = scan.nextLine();
	}

	public void showInfo() {
		System.out.print(" Ten : " + name + "; gioi tinh " + gender + "; dia chi : " + address + "; ngay sinh : "
				+ dateOfBirth + "");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
