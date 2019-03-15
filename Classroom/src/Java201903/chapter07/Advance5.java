package Java201903.chapter07;

class StaticTest {
	public        String data1 = "non-static";
	public static String data2 = "static";
	public StaticTest(String data1) {
		this.data1 = data1;
	}
	public void method1() {
		System.out.println("data1=" + data1);
		System.out.println("data2=" + data2);
	}
	public static void method2() {
		// System.out.println("data1="+ data1);
		System.out.println("data2=" + data2);
	}
}

public class Advance5 {
	public static void main(String[] ags) {
		StaticTest.method2();	// static method, don't need an object

		StaticTest st1 = new StaticTest("st1");
		StaticTest st2 = new StaticTest("st2");
		
		st1.method1();
		st2.method1();
		System.out.println("--------------------");

		st1.data1 = "changed";
		st1.data2 = "changed";

		st1.method1();
		st2.method1();
	}
}
