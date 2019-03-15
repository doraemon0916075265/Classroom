package Java201903.chapter04;

public class Expression4 {
	public static void main(String[] args) {

		// local variable must initialized before use
		int data1;
		// System.out.println("data1="+data1); //must initialize before use

		// local variable scope
		{
			int data2 = 10;
			System.out.println("inside block, data2=" + data2);
		}
		// System.out.println("after block, data2="+ data2); //no data2 here
		System.out.println("-----------------------");

		// local variable can't have the same name
		int data3 = 100;
		{
			// int data3 = 10; //illegal
		}

		// inner scope => outter scope
		int data4 = 100;
		{
			int data5 = 10;
			System.out.println("inside block, data5=" + data5 + ", data4=" + data4);
		}
		System.out.println("outside block, data4=" + data4);

		// shadowing
		Shadow obj = new Shadow();
		obj.aMethod();

	}
}

// shadowing
class Shadow {
	public int field = 100;

	public void aMethod() {
		int field = 5;
		System.out.println(field);
	}
}
