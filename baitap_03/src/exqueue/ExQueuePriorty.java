package exqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExQueuePriorty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> numbers1 = new PriorityQueue<>();
		// Chèn phần tử chỉ định vào Queue bằng phương thức offer
		numbers1.offer(1);
		numbers1.offer(5);
		numbers1.offer(3);
		numbers1.offer(2);
		numbers1.offer(4);
		numbers1.offer(6);

		System.out.println("Queue: " + numbers1);
		// Truy cập các phần tử trong Queue
		int accessedNumber = numbers1.peek();
		System.out.println("Truy cập phần tử: " + accessedNumber);
		// Loại bỏ các phần tử tron Queue
		int removedNumber = numbers1.poll();
		System.out.println("Loại bỏ phần tử: " + removedNumber);
		System.out.println("Cập nhật Queue: " + numbers1);

	}

}
