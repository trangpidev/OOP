package excollectionlistarray;

import java.util.ArrayList;

public class DArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai báo 1 ArrayList có tên là list
		// có kiểu là String
		ArrayList<String> list = new ArrayList<String>();
		// add các phần tử vào list
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Java");
		list.add("C#");
		list.add("Python");

		// sử dụng phương thức toArray() chuyển list thành mảng
		// kết quả của phương thức này sẽ trả về mảng arr
		Object[] arr = list.toArray();

		// hiển thị các phần tử có trong mảng arr
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Phần tử tại vị trí " + i + " " + "trong arr là " + arr[i]);

			// hiển thị các phần tử của list
			System.out.println("Các phần tử có trong list là: ");
			System.out.println(list);

			// add(all) các phần tử của list vào listA
			ArrayList<String> listA = new ArrayList<String>();
			listA.addAll(list);
			System.out.print("listA:");
			showList(listA);
			System.out.println("\n retainAll()");
			System.out.println("-----------------------------------");

			// khởi tạo listB
			ArrayList<String> listB = new ArrayList<String>();
			listB.add("Java");

			// clear ptu ko thuộc listB khỏi listA
			listA.retainAll(listB);
			System.out.print("listA:");
			showList(listA);
			System.out.println("\n removeAll()");
			System.out.println("-----------------------------------");
			// clear ptu thuộc listB khỏi list
			list.removeAll(listB);
			System.out.print("list:");
			showList(list);
		}
	}

	public static void showList(ArrayList<String> list) {
		// Show list through for-each
		for (String obj : list) {
			System.out.print("\t" + obj + ", ");
		}
		System.out.println();
	}
}
