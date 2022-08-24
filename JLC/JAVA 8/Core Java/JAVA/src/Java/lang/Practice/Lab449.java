package Java.lang.Practice;

public class Lab449 {

	public static void main(String[] args) {
		int a=22;
		int b=22;
		String st1=new String("Sri");
		String st2=new String("Sri");
		String st3=new String("Manish");
		
		System.out.println("Using == op");
		System.out.println(a==b);//compare between content(because primitive data types)
		System.out.println(st1==st2);//compare between addresses.(because reference data types)
		System.out.println(st1==st3);
		System.out.println("using equals()");
		System.out.println(st1.equals(st2));//overriden equals method in string class. compare between content.
		System.out.println(st2.equals(st3));
	}

}
