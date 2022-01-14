package mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.controller.Controller;
import mvc.model.Personnel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Personnel> listPersonnel = new ArrayList<>();
		View view = new View();
		Controller controller = new Controller(view);

		Scanner sc = new Scanner(System.in);

		int choose = 0;

		do {
			System.out.println("1: View information personnel");
			System.out.println("2: Insert information personnel");
			System.out.println("3: Update information personnel");
			System.out.println("4: Delete information personnel");
			System.out.println("5: Show personnel by department");
			System.out.println("6: Show personnel by skill");
			System.out.println("choose function");
			try {
				choose = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println(" You must enter number");
			}

			switch (choose) {
			case 1:
				view.outputInformation(listPersonnel);
				break;
			case 2:
				controller.insertPersonnel(listPersonnel);
				break;
			case 3:
				controller.updatePersonnel(listPersonnel);
				break;
			case 4:
				controller.deletePersonnel(listPersonnel);
				break;
			case 5:
				controller.viewPersonnelByDepartment(listPersonnel);
				break;
			case 6:
				controller.viewPersonnelBySkill(listPersonnel);
				break;
			case 7:
				System.out.println("Exit!");
				break;
			default:
				System.out.println("Choose again");
				break;
			}
		} while (choose != 7);
	}
}
