package Java201903.chapter01;

public class Start4 {
	public static void main(String[] args) {

		// % (mod)
		int operand1 = 10;
		int operand2 = 3;

		int operand3 = -10;
		int operand4 = -3;

		System.out.println("+%+=>" + (operand1 % operand2));
		System.out.println("+%-=>" + (operand1 % operand4));
		System.out.println("-%+=>" + (operand3 % operand2));
		System.out.println("-%-=>" + (operand3 % operand4));

		int i = 1;
		int j = 2;
		int k = i + j;
		
		byte p = 1;
		byte q = 2;
//		byte r = p + q;
		
		double data = 5 / 3;
		System.out.println("data =" + data);
		
		//overflowing
		int x = 100000;
		int y = 100000;
		long z = x * y;
		System.out.println("z=" + z);

		//automatic promotion
		byte data1 = 0;
//		data1 = data1 + 27;
		data1 = (byte) (data1 + 27);
		data1 += 27;
	}
}
