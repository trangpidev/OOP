package fi_le_sincejava8;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// b3: sd lambda expression
		Movie2 action2 = (s) -> System.out.println(s);
		action2.detail("detail_lambda expression : Action movie");

		// b5: sd method reference
		Movie2 action3 = System.out::println;
		action3.detail("detail_method reference : Action movie is the best");

	}

}
