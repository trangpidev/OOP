package exqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ExQueueBlocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);
		// Using add()
		animals.add("Dog");
		animals.add("Cat");

		// Using offer()
		animals.offer("Horse");
		System.out.println("ArrayBlockingQueue: " + animals);
	}
}
