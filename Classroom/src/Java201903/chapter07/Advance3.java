package Java201903.chapter07;

class Advance3Father {
	public int i = 10;
	public void aMethod() {
		System.out.println("aMethod() in Advance3Father");
	}
}

class Advance3Child extends Advance3Father {
	public int i = 100;
	public void aMethod() {
		System.out.println("aMethod() in Advance3Child");
	}
	public void testSuper() {
		System.out.println("super.i=" + super.i);
		System.out.println("this.i=" + this.i);
		super.aMethod();
		this.aMethod();
	}
}
public class Advance3 {
	public static void main(String[] args) {
		Advance3Child c = new Advance3Child();
		c.testSuper();
	}
}
