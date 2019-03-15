package Java201903.chapter02;

public class Control3 {
	public static void main(String[] args) {


		for (int i = 0; i < 5; i++) {
			if (i == 2) {
//				break;
//				continue;
			}
			System.out.println("i=" + i);
		}


// break out of infinite loop
		int counter = 0;
		while (counter != 5) {
			System.out.println("counter=" + counter);
			counter = counter + 2;
			if (counter > 10)
				break;
		}
		
	}
}
