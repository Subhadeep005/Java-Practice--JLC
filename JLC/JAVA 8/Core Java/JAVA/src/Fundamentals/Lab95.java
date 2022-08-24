package Fundamentals;

public class Lab95 {

	public static void main(String[] args) {
		int a=300;
		//byte b=a; //Lab95.java:5: error: incompatible types: possible lossy conversion from int to byte
		byte b=(byte)a;
		System.out.println(a);
		System.out.println(b);
	}

}
