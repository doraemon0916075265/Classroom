package Java201903.chapter07;

import java.io.IOException;

public class Advance1 {
	public void aMethod() throws IOException, InstantiationException {

	}
}
class Advance1Child extends Advance1 {
	// less than parent class method allowed
	public void aMethod() throws InstantiationException {
		// URL u = new URL("http://tw.yahoo.com");
	}
	
/*
	// IOException's subclass allowed
	public void aMethod() throws FileNotFoundException, EOFException {
		// URL u = new URL("http://tw.yahoo.com");
	}
	

	// IOException's superclass not allowed
	public void aMethod() throws Exception {
		// URL u = new URL("http://tw.yahoo.com");
	}
	
	// different exception not allowed
	public void aMethod() throws IllegalAccessException {
		// URL u = new URL("http://tw.yahoo.com");
	}

	// unchecked exceptioin allowed
	public void aMethod() throws RuntimeException {
		// URL u = new URL("http://tw.yahoo.com");
	}
*/
}
