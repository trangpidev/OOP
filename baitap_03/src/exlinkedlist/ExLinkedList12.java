package exlinkedlist;

import java.util.LinkedList;

public class ExLinkedList12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		// Add objects to list
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Java");
		// truy cập phần tử có chỉ số 3 của list GET
		System.out.println(list.get(3));

		System.out.println("\n addAll()");
		System.out.println("-----------------------------------");
		// add all các phần tử của list vào listA
		LinkedList<String> listA = new LinkedList<String>();
		listA.addAll(list);
		System.out.print("listA:");
		showList(listA);

		System.out.println("\n retainAll()");
		System.out.println("-----------------------------------");
		// khởi tạo listB
		LinkedList<String> listB = new LinkedList<String>();
		listB.add("Java");
		// xóa những phần tử không thuộc listB khỏi listA
		listA.retainAll(listB);
		System.out.print("listA:");
		showList(listA);

		System.out.println("\n removeAll()");
		System.out.println("-----------------------------------");
		// xóa những phần tử thuộc listB khỏi list
		list.removeAll(listB);
		System.out.print("list:");
		showList(list);
	}

	public static void showList(LinkedList<String> list) {
		// Show list through for-each
		for (String obj : list) {
			System.out.print("\t" + obj + ", ");
		}
		System.out.println();
	}

}
