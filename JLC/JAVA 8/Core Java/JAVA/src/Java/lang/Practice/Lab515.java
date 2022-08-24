package Java.lang.Practice;

public class Lab515 {

	public static void main(String[] args) {
		Boolean b1=true;
		Boolean b2=true;
		System.out.println(b1==b2);
		boolean b=true;
		Boolean b3=new Boolean(b);
		Boolean b4=new Boolean(b);
		System.out.println(b3==b4);
		
		Boolean b5=true;
		Boolean b6=false;
		System.out.println(b5.hashCode());
		System.out.println(b6.hashCode());
	}

}
