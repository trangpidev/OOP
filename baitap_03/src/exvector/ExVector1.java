package exvector;

import java.util.Vector;

public class ExVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<>();
		vector.add("cat");
		vector.add("dog");
		vector.add("fish");
		vector.add("mouse");
		System.out.println(" data " + vector);
		System.out.println("size data l1 : " + vector.size());
		vector.setSize(100);
		System.out.println("size data l2 : " + vector.size());
	}
}
