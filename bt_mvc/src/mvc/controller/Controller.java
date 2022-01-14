package mvc.controller;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.model.Personnel;
import mvc.view.View;

public class Controller {
	private View view;

	public Controller(View view) {
		this.view = view;
	}

	// insert information personnel
	public void insertPersonnel(ArrayList<Personnel> listPersonnel) {
		System.out.println("Insert information personnel");
		Scanner sc = new Scanner(System.in);
		Personnel personnel = view.inputInformation();
		listPersonnel.add(personnel);
	}

	// update information personnel
	public void updatePersonnel(ArrayList<Personnel> listPersonnel) {
		System.out.println("Update information personnel");
		System.out.println("Enter code personnel want to update ");
		Scanner sc = new Scanner(System.in);
		String codePerson = sc.nextLine();
		for (Personnel personnel : listPersonnel) {
			if (personnel.getidPersonnel().equals(codePerson)) {
				System.out.println("Enter new information Personnel");
				listPersonnel.remove(personnel);
				personnel = view.inputInformation();
				listPersonnel.add(personnel);
				break;
			}
		}
	}

	// delete information personnel
	public void deletePersonnel(ArrayList<Personnel> listPersonnel) {
		System.out.println("Delete information personnel");
		System.out.println("Enter code personnel want to delete ");
		Scanner sc = new Scanner(System.in);
		String codePerson = sc.nextLine();

		listPersonnel.removeIf(s -> s.getidPersonnel().equals(codePerson));
	}

	// Show Personnel by department
	public void viewPersonnelByDepartment(ArrayList<Personnel> listPersonnel) {
		System.out.println("Show personnel by name department");
		System.out.println("Enter name department: ");
		Scanner sc = new Scanner(System.in);
		String department = sc.nextLine();

		listPersonnel.stream().filter(s -> s.getNameDepartment().equals(department))
				.forEach(s -> System.out.println(s.toString()));
	}

	// Show Personnel by skill
	public void viewPersonnelBySkill(ArrayList<Personnel> listPersonnel) {
		System.out.println("Show personnel by skill");
		System.out.println("Enter skill: ");
		Scanner sc = new Scanner(System.in);
		String skill = sc.nextLine();
		listPersonnel.stream().filter(s -> s.getSkillPersonnel().equals(skill))
				.forEach(s -> System.out.println(s.toString()));
	}
}