package Java201903.chapter07.package1;

public class Father {
	public int p = 1;
	protected int q = 1;
	int r = 1;
	private int s = 1;

	public void publicMethod() {
		System.out.println("publicMethod()");
	}
	protected void protectedMethod() {
		System.out.println("protectedMethod()");
	}
	void defaultMethod() {
		System.out.println("defaultMethod()");
	}
	private void privateMethod() {
		System.out.println("privateMethod()");
	}
	public void method1() {
		Father obj = new Father();
	    System.out.println("public    , p="+ obj.p);
	    obj.publicMethod();

	    System.out.println("protected , q="+ obj.q);
	    obj.protectedMethod();

	    System.out.println("default   , r="+ obj.r);
	    obj.defaultMethod();

	    System.out.println("private   , s="+ obj.s);
	    obj.privateMethod();
	}
	public void method2() {
	    System.out.println("public    , p="+ this.p);
	    this.publicMethod();

	    System.out.println("protected , q="+ this.q);
	    this.protectedMethod();
	    
	    System.out.println("default   , r="+ this.r);
	    this.defaultMethod();

	    System.out.println("private   , s="+ this.s);
	    this.privateMethod();
	}
}
