package modelex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// qly mang
		ArrayList<Student> studentList = new ArrayList<>();
		int choose;
		Scanner scan = new Scanner(System.in);

		do {
			showMenu();
			System.out.println("Choose : ");
			choose = Integer.parseInt(scan.nextLine());

			switch (choose) {
			case 1:
				int n;
				System.out.println("Nhap so sv can them : ");
				n = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < n; i++) {
					Student std = new Student();
					std.inputInfo();
					studentList.add(std);
				}
				break;
			case 2:
				for (int i = 0; i < studentList.size(); i++) {
					studentList.get(i).showInfo();
				}
				break;
			case 3:
				List<Student> sortedByNamestudent = new ArrayList<Student>(studentList);
				Collections.sort(sortedByNamestudent, new Comparator<Student>() {
					public int compare(Student p1, Student p2) {
						return String.valueOf(p1.getName()).compareTo(p2.getName());
					}
				});
			case 4:
				Collections.sort(studentList, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getAverageScore() >= o2.getAverageScore() ? -1 : 1;
					}
				});

				for (int i = 0; i < studentList.size(); i++) {
					if (studentList.get(i).checkAverageScore()) {
						studentList.get(i).showInfo();
					}
				}
				System.out.println("sv duoc hoc bong : ");
				break;
			default:
				System.err.println("Nhap sai !!!");
				break;
			}
		} while (choose != 4);
	}

	static void showMenu() {
		System.out.println("1. Nhap vao N sinh vien ");
		System.out.println("2. Hien thi thong tin sinh vien ");
		System.out.println("3. Sap xep max-min DTB ");
		System.out.println("4. Hien thi sinh vien duoc hoc bong ");
	}

}
