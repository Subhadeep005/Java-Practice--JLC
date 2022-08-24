package Java.lang.Practice;

public class Lab459 {

	public static void main(String[] args) {
		String st1="JLC";
		String st2=new String("JLC");
		String st3=st2.intern();
		System.out.println(st1==st2);//f
		System.out.println(st1==st3);//t
		System.out.println(st2==st3);//f
		
		//System.out.println(st1.hashCode());
		//System.out.println(st3.hashCode());
		
		System.out.println();
		String st4="OK";
		//System.out.println(st4.hashCode());
		String st5="OK".intern();
		//System.out.println(st5.hashCode());
		System.out.println(st4==st5);
	}

}
