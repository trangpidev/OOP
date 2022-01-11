package exe_conection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hashset
		Set<String> setString = new HashSet<String>();
		setString.add("B");
		setString.add("A");
		setString.add("C");
		setString.add("E");
		setString.add("D");
		setString.add("A");
		setString.add("E");
		for (String s : setString) {
			System.out.println(s);
		}
		Iterator<String> itr = setString.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		setString.remove("A");
		// Treeset
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("1");
		ts.add("5");
		ts.add("3");
		ts.add("2");
		ts.add("4");
		for (String s : ts) {
			System.out.println(s + "");
		}
	}
}