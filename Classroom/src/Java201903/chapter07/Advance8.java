package Java201903.chapter07;

class Help {
	public int j = 10;
}
class Advance8Grand {
	public static final int i = 100;
	public final Help h = new Help();
	public final void aMethod() {
		System.out.println("in Advance8Grand");
	}
}
final class Advance8Father extends Advance8Grand {
//	// can't override final method
//	public final void aMethod() {
//		System.out.println("in Advance8Father");
//	}

	public void method() {
		
	}
}

//// no subclass from a final class
//class Advance8Child extends Advance8Father {
//}

public class Advance8 {
	public static void main(String[] args) {
		Advance8Father ff = new Advance8Father();
//		ff.i=1;
//		ff.h=new Help();
		ff.h.j = 100;
	}
}
