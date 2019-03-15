package Java201903.chapter03;

public class Basic1 {
	public static void main(String[] args) {

		// Cat with a custom constructor
		Cat2 cat2 = new Cat2(2, 3.5, "momo");
		System.out.println("age=" + cat2.age);
		System.out.println("weight=" + cat2.weight);
		System.out.println("name=" + cat2.name);

		// default constructor
		Cat1 cat1 = new Cat1();
		
/*
		// no default constructor now
		Cat2 c = new Cat2();
*/
	}
}
