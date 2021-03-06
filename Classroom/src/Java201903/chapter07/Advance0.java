package Java201903.chapter07;

class Dummy {
	
}
class DummyKid extends Dummy {
	
}
public class Advance0 {
	public void aMethod() {
		System.out.println("aMethod() in Father");
	}
	public Dummy newMethod() {
		return new Dummy();
	}
}
class Advance0Child extends Advance0 {
	// normal override
	public void aMethod() {
		System.out.println("aMethod() in Child");
	}

	// different name allowed, but not override
	public void bMethod() {
		System.out.println("bMethod() in Child");
	}

	// different argument list allowed, but not override
	public void aMethod(int i) {
		System.out.println("aMethod(int) in Child");
	}
/*
	// access modifier weaker not allowed
	protected void aMethod() {
		System.out.println("aMethod() in Child");
	}

	// different return type not allowed
	public int aMethod() {
		System.out.println("aMethod(int) in Child");
		return 1;
	}

	// subclass return type allowed
	public DummyKid newMethod() {
		return new DummyKid();
	}
*/
}
