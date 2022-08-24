package OOPS.com.jlc.p1;

public class C {
	A aref=new A();
	public void showC(){
	System.out.println("Non-sub class of A in same Package(Class C)");
	System.out.println("C ---> Show()");
	System.out.println("******Object of A class******");
	//System.out.println(aref.a);//Private
	System.out.println("Default-->"+aref.b);
	System.out.println("Protected-->"+aref.c);
	System.out.println("Public-->"+aref.d);
	}
}
