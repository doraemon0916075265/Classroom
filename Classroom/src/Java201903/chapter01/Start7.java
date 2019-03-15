package Java201903.chapter01;

//logical operator
public class Start7 {
	public static void main(String[] args) {

		// logical operator !, |, &, ^
		System.out.println("!true=" + (!true));
		System.out.println("!false=" + (!false));
		System.out.println("-----------------------");

		System.out.println("true|true=" + (true | true));
		System.out.println("true|false=" + (true | false));
		System.out.println("false|true=" + (false | true));
		System.out.println("false|false=" + (false | false));
		System.out.println("-----------------------");

		System.out.println("true&true=" + (true & true));
		System.out.println("true&false=" + (true & false));
		System.out.println("false&true=" + (false & true));
		System.out.println("false&false=" + (false & false));
		System.out.println("-----------------------");

		System.out.println("true^true=" + (true ^ true));
		System.out.println("true^false=" + (true ^ false));
		System.out.println("false^true=" + (false ^ true));
		System.out.println("false^false=" + (false ^ false));
		System.out.println("-----------------------");

		// short-circuit logical operator &&, ||
		System.out.println("true&&true=" + (true && true));
		System.out.println("true&&false=" + (true && false));
		System.out.println("false&&true=" + (false && true));
		System.out.println("false&&false=" + (false && false));
		System.out.println("-----------------------");

		System.out.println("true||true=" + (true || true));
		System.out.println("true||false=" + (true || false));
		System.out.println("false||true=" + (false || true));
		System.out.println("false||false=" + (false || false));
		System.out.println("-----------------------");

		// short circut for ||
		int p = 1;
		int q = 2;
		int r = 3;
		int s = 4;

		System.out.println("s=" + s);
		boolean data = p < q | r < s++;
		System.out.println("s=" + s);

	}
}
