package Java201903.chapter07;

class StaticBlock {
	static {
		System.out.print("A");
	}
	public StaticBlock() {
		System.out.print("B");
	}
	static {
		System.out.print("C");
	}
}

public class Advance6 {
	static {
		System.out.print("D");
	}
	public static void main(String[] args) {
		System.out.print("E");
		StaticBlock t = new StaticBlock();
		System.out.print("F");
	}
	static {
		System.out.print("G");
	}
}
