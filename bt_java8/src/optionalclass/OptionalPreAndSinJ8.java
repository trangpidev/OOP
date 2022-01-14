package optionalclass;

import java.util.List;
import java.util.Optional;

class People {
	String name;
	List<People> peopleList = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class OptionalPreAndSinJ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p = new People();
		if (p.peopleList != null) {
			System.out.println(p.peopleList.get(0).getName());
		} else {
			System.out.println("1. List is null! ");
		}
		Optional<People> op = Optional.of(p);
		op.ifPresent(s -> System.out.println("2. Null " + s.getName()));
	}

}