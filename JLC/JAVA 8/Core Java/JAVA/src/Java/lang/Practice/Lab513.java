package Java.lang.Practice;

public class Lab513 {

	public static void main(String[] args) {
		System.out.println("Wrapper Object to String");
		Integer in=new Integer(1234);
		String s1=in.toString();
		System.out.println(s1);
		Boolean b1=new Boolean("JLC");
		String s2=b1.toString();
		System.out.println(s2);
		Character ch=new Character('A');
		String s3=ch.toString();
		System.out.println(s3);
	}

}
