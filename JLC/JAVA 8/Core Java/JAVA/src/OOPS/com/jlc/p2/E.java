package OOPS.com.jlc.p2;
import OOPS.com.jlc.p1.A;

public class E {
	A aref=new A();
	public void showE(){
	System.out.println("Non-sub class of A in different Package(Class E)");
	System.out.println("E ---> Show()");
	System.out.println("******Object of A class******");
	//System.out.println(aref.a);//Private
	//System.out.println(aref.b);//Default
	//System.out.println(aref.c);//Protected
	System.out.println("Public-->"+aref.d);
	}
}
