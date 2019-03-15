package Java201903.chapter01;

public class Start3 {
	public static void main(String[] args) {
		
		// implicit cast
		byte data1 = 100;
		int data2 = data1;
		long data3 = data2;
		
		float data4 = 10.0F;
		double data5 = data4;
		
		float data6 = data3;

		System.out.println("------------------------");
		
		// explicit cast
		byte data7 = (byte) data2;
		int data8 = (int) data3;
		int data9 = (int) data5;

		System.out.println("------------------------");

		char ch = 'C';
		int data10 = ch;
		short data11 = (short) ch;

	}
}
