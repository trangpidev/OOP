package exqueue;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class ExQueueBlocking1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);
		// Add elements
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		System.out.println("ArrayBlockingQueue: " + animals);

		// Using peek()
		String element = animals.peek();
		System.out.println("Accessed Element: " + element);

		// Using iterator()
		Iterator<String> iterate = animals.iterator();
		System.out.print("ArrayBlockingQueue Elements: ");

		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
			
			// Using remove()
	        String element1 = animals.remove();
	        System.out.println("Removed Element:");
	        System.out.println("Using remove(): " + element1);

	        // Using poll()
	        String element2 = animals.poll();
	        System.out.println("Using poll(): " + element2);

	        // Using clear()
	        animals.clear();
	        System.out.println("Updated ArrayBlockingQueue: " + animals);
		}
	}

}
