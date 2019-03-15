package Java201903.chapter07;

public class Advance9 {
	public static void main(String[] args) {
//		Advance9Class a = new Advance9Class();
	}
}

abstract class Advance9Class {
	private int field = 0;
	public void setField(int field) {
		this.field = field;
	}
	public int getField() {
		return field;
	}

//	public abstract void aMethod();

	//no implementation allowed
//	public abstract void bMethod() {}

	//abstract method can not have private, final, static modifiers
//	private abstract void cMethod();
//	public final abstract void dMethod();
//	public static abstract void eMethod();

}
