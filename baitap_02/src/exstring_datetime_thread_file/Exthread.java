package exstring_datetime_thread_file;

public class Exthread extends Thread {
	public static void main(String[] args) {
		Exthread exthread = new Exthread();
		exthread.start();
	}

	// Tạo 1 thread sẽ print tiếng “Beep” sau 5s.
	@Override
	public void run() {
		System.out.println("waiting in 5 seconds ...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Beep");
	}
}
