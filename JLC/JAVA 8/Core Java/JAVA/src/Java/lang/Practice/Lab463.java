package Java.lang.Practice;

public class Lab463 {

	public static void main(String[] args) {
		String st1="JLC99";
		String st2="JLC";
		final int ab=99;
		String st3=st2+ab; //Non Final+Final=With New.
		System.out.println(st1+"\t"+st3);
		System.out.println(st1==st3);//f
	}

}
