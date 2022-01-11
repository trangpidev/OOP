package exqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ExQueueBlocking2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using remove()
		ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);
		// Using add()
		animals.add("Dog");
		animals.add("Cat");

		// Using offer()
		animals.offer("Horse");
		System.out.println("ArrayBlockingQueue: " + animals);
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
