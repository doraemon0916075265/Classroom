package Java201903.chapter04;

class Dummy {
	public int attr = 0;
}
class Argument {
	public void prim(int i) {
		i = 1000;
		System.out.println("A=" + i);
	}
	public void ref(Dummy d) {
		d.attr = 1000;
		System.out.println("A=" + d.attr);
	}
}

public class Expression1 {
	public static void main(String[] ags) {
		Argument at = new Argument();

		// primitive arguement
		int i = 100;
		at.prim(i);
		System.out.println("B=" + i);
		System.out.println("-------------------------------------");

		// reference arguement
		Dummy d = new Dummy();
		d.attr = 100;
		at.ref(d);
		System.out.println("B=" + d.attr);
		System.out.println("-------------------------------------");
	}
}
