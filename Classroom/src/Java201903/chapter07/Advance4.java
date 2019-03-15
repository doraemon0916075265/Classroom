package Java201903.chapter07;

class GrandFather extends Object {
	public GrandFather() {
		System.out.println("Creating GrandFather()");
	}
	public GrandFather(int i) {
		System.out.println("Creating GrandFather(int)");
	}
}
class Father extends GrandFather {
	public Father() {
		System.out.println("Creating Father()");
	}
	public Father(double d) {
		System.out.println("Creating Father(double)");
	}
}
class Son extends Father {
	public Son(String s) {
		// 1. constructor not inherited, no this(int), this(double) here
		// this(10);
		// this(10.0);
		System.out.println("Creating Son(String)");
	}
	public Son(char c) {
		this("AAA");
/*
		// super must be the first line
		super(10.0);
		System.out.println("Creating Son(char)");
*/
	}
}

public class Advance4 {
	public static void main(String[] args) {
		Son s = new Son("test");
	}
}
