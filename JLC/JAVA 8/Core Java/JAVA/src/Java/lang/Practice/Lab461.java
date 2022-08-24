package Java.lang.Practice;

public class Lab461 {

	public static void main(String[] args) {
		String st1="JLC";  //Non Final (without new).
		String st2="INDIA"; //Non Final (without new).
		String st3=st1+st2; //Non Final +Non Final=with new.
		String st4=st1+"INDIA"; //Non Final +Final=with new.
		String st5="JLC"+st2; //Final +Non Final=with new.

		System.out.println(st3+"\t"+st4+"\t"+st5);
		System.out.println(st3==st4);//false
		System.out.println(st3==st5);//false
		System.out.println(st4==st5);//false
	}

}
