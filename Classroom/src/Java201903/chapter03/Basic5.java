package Java201903.chapter03;

//import chapter03.package1.Help1;
//import chapter03.package2.Help1;

//import chapter03.package1.*;
//import chapter03.package2.*;

public class Basic5 {
	public static void main(String[] args) {
// fully qualified name
		Java201903.chapter03.package1.Help1 h1 = new Java201903.chapter03.package1.Help1();
		h1.sayHi();

		Java201903.chapter03.package2.Help1 h2 = new Java201903.chapter03.package2.Help1();
		h2.sayHi();
		
/*
		Help1 h1 = new Help1();
		h1.sayHi();

		Help1 h2 = new Help1();
		h2.sayHi();

		chapter03.package1.Help1 h1 = new chapter03.package1.Help1();
		h1.sayHi();

		chapter03.package2.Help1 h2 = new chapter03.package2.Help1();
		h2.sayHi();
*/
	}
}
