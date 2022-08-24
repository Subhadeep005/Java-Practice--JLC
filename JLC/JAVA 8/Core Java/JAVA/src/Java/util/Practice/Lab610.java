package Java.util.Practice;

import java.util.Enumeration;
import java.util.Vector;

public class Lab610 {

	public static void main(String[] args) {
		Vector v= new Vector();
		Enumeration enu = v.elements();
		System.out.println(enu.hasMoreElements());
		System.out.println("Main Completed");
	}

}
