package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(-100, 27, -18, 36, 54, 40, -54, -36, 37, 98, 92, 63, -36);
		System.out.println("Cho chuỗi số k : " + list);
		System.out.println("--------------------");

		// preJava8
		System.out.println("1. PreJava8 :  ");
		Set<Integer> set = new HashSet<Integer>(list);
		List<Integer> list1 = new ArrayList<Integer>(set);
		List<Integer> list2 = new ArrayList<>();
		int sum1 = 0;
		for (Integer integer : list1) {
			if (integer % 18 == 0) {
				list2.add(integer);
				sum1 += integer;
			}
		}
		System.out.println("a) Chuỗi số k trùng lặp : " + list1);
		System.out.println("b) Chuỗi số k trùng lặp, chẵn và chia hết cho 9 là : " + list2);
		System.out.println("=> => Tổng các số chẵn = " + sum1);
		System.out.println("--------------------");

		// sinceJava8
		System.out.println("2. SinceJava8 : Chuỗi số chẵn, không trùng lặp và chia hết cho 9 là : ");
		list.stream().distinct().sorted().filter(num -> num % 18 == 0).forEach(System.out::println);
		int sum2 = list.stream().distinct().filter(num -> num % 18 == 0).reduce(0, Integer::sum);
		System.out.println("=> => Tổng các số chẵn = " + sum2);
	}

}
