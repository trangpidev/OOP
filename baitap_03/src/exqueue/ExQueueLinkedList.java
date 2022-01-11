package exqueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExQueueLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo Queue sử dụng class LinkedList
		Queue<Integer> numbers = new LinkedList<>();
		Queue<Integer> numbers1 = new PriorityQueue<>();

		// Chèn phần tử chỉ định vào Queue bằng phương thức offer
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		System.out.println("Queue: " + numbers);

		// Truy cập các phần tử trong Queue
		int accessedNumber = numbers.peek();
		System.out.println("Truy cập phần tử: " + accessedNumber);

		// Loại bỏ các phần tử tron Queue
		int removedNumber = numbers.poll();
		System.out.println("Loại bỏ phần tử: " + removedNumber);

		System.out.println("Cập nhật Queue: " + numbers);
	}
}
