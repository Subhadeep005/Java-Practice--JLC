package Fundamentals;

public class Lab96 {

	public static void main(String[] args) {
		
		byte b1=12;
		byte b2=23;
		//byte b3=b1+b2; //test.java:5: error: incompatible types: possible lossy conversion from int to byte
		//byte b4=(byte)b1+(byte)b2; //Lab96.java:8: error: incompatible types: possible lossy conversion from int to byte byte b4=(byte)b1+(byte)b2;
		byte b5=(byte)(b1+b2);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b5);
	}

}
