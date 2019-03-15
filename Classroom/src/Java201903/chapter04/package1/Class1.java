package Java201903.chapter04.package1;

public class Class1 {
	public int i = 1;
	private int j = 2;
	int k = 3;
	public void publicMethod() {
		System.out.println("public");
	}
	private void privateMethod() {
		System.out.println("private");
	}
	void defaultMethod() {
		System.out.println("default");
	}
	public void method1() {
	    Class1 obj = new Class1();
	    
	    System.out.println("obj.i="+ obj.i);
	    obj.publicMethod();

	    System.out.println("obj.j="+ obj.j);
	    obj.privateMethod();

	    System.out.println("obj.k="+ obj.k);
	    obj.defaultMethod();
	}
	public void method2() {
	    System.out.println("this.i="+ this.i);
	    this.publicMethod();

	    System.out.println("this.j="+ this.j);
	    this.privateMethod();

	    System.out.println("this.k="+ this.k);
	    this.defaultMethod();
	}
}
