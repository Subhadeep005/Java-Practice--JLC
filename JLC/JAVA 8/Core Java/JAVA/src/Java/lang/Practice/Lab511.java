package Java.lang.Practice;

public class Lab511 {

	public static void main(String[] args) {
		System.out.println("Wrapper Object to Primitive");
		Character cref=new Character('A');
		char ch=cref.charValue();
		System.out.println(ch);
		Boolean b1=new Boolean(false);
		boolean bol=b1.booleanValue();
		System.out.println(bol);
		Float f1=new Float(300.3434);
		byte by1=f1.byteValue();
		System.out.println(by1);
		short sh=f1.shortValue();
		System.out.println(sh);
		int in=f1.intValue();
		System.out.println(in);
		long val=f1.longValue();
		System.out.println(val);
		float fval=f1.floatValue();
		System.out.println(fval);
		double d1=f1.doubleValue();
		System.out.println(d1);
	}

}
