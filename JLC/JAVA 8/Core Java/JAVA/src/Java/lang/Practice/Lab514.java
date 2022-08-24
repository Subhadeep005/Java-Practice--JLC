package Java.lang.Practice;

public class Lab514 {

	public static void main(String[] args) {
		Byte by1=123; //AutoBoxing
		Byte by2=123;
		System.out.println(by1==by2);
		byte b=123;
		Byte b1=new Byte(b); //Boxing
		Byte b2=new Byte(b);
		System.out.println(b1==b2);
		
		Byte b3=new Byte(b);
		Byte by3=b3.byteValue(); //UnBoxing
		Byte by4=b3; //AutoUnBoxing
		Byte by5=b3;
		System.out.println(by3==by4);
		System.out.println(by4==by5);
	}

}
