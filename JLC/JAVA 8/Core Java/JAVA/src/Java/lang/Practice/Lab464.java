package Java.lang.Practice;

public class Lab464 {

	public static void main(String[] args) {
		String st1="JLC99"; //NF (without new).
		final String st2="JLC"; //F (Without new).
		final int ab=99;
		String st3=st2+ab; //F + F=Without new.(JLC99)
		String st4="JLC"+99; //F + F=Without new.(JLC99)
		//String st5="JLCINDIA"+99; //F + F=Without new.(JLCINDIA99)
		System.out.println(st1+"\t"+st3+"\t"+st4);
		System.out.println(st1==st3);//t
		System.out.println(st1==st4);//t
		//System.out.println(st4==st5);//f
	}

}
