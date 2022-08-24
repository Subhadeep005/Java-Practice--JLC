package Java.lang.Practice;

public class Lab462 {

	public static void main(String[] args) {
		String st1="JLCINDIA"; //Non Final (without new).
		String st2="JLC"+"INDIA"; //Final+Final=without new.
		final String st3="JLC"; //Final (without new).
		final String st4="INDIA"; //Final (without new).
		String st5=st3+st4; //Final +Final=without new.
		
		System.out.println(st1==st2);//t
		System.out.println(st1==st5);//t
		System.out.println(st2==st5);//t
	}

}
