package Java201903.chapter04;

class TestClass {
	private String name;
	public void setName(String name) {
		name = name;
	}
	public void show() {
		System.out.println("name=" + name);
	}
}

public class Expression3 {
	public static void main(String[] ags) {
		TestClass t = new TestClass();
		t.setName("Michael");
		t.show();
	}
}
