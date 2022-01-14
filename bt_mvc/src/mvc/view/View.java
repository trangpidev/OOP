package mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.model.Personnel;

public class View {
	// output information personnel
	public void outputInformation(ArrayList<Personnel> listPersonnel) {
		listPersonnel.stream().forEach(System.out::println);
	}

	// input information personnel
	public Personnel inputInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------Enter Information---------------");

		Personnel personnel = new Personnel();

		System.out.println("Enter code Department");
		personnel.setCodeDepartment(sc.nextLine());
		System.out.println("Enter name Department");
		personnel.setNameDepartment(sc.nextLine());

		System.out.println("Enter code Personnel");
		personnel.setCodePersonnel(sc.nextLine());
		System.out.println("Enter name Personnel");
		personnel.setNamePersonnel(sc.nextLine());
		System.out.println("Enter skill of Personnel");
		personnel.setSkillPersonnel(sc.nextLine());
		
		return personnel;
	}
}
