package exstring_datetime_thread_file;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exthread_c {
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		do {
			es.execute(new PrintBeepCeep());
		} while (!(new Scanner(System.in).nextLine()).equalsIgnoreCase("Stop"));
		System.err.println("Stop now!");
		es.shutdown();
	}
}

class PrintBeepCeep implements Runnable {

	public PrintBeepCeep() {
		super();
	}

	@Override
	public void run() {
		try {
			System.out.println("waiting in 5 seconds ...");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("Beep");
	}
}
