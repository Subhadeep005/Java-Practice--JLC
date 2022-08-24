package OOPS.com.jlc.p1;

public class A {
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	//A aref=new A();
	public void showA(){
		System.out.println("super class A");
		System.out.println("A ---> Show()");
		System.out.println("******Directly******");
		System.out.println("Private-->"+a);
		System.out.println("Default--->"+b);
		System.out.println("Protected-->"+c);
		System.out.println("Public-->"+d);
		System.out.println("******this******");
		System.out.println("Private-->"+this.a);
		System.out.println("Default--->"+this.b);
		System.out.println("Protected-->"+this.c);
		System.out.println("Public-->"+this.d);
		System.out.println("******Object of current class******");
		A aref=new A();
		System.out.println("Private-->"+aref.a);
		System.out.println("Default-->"+aref.b);
		System.out.println("Protected-->"+aref.c);
		System.out.println("Public-->"+aref.d);
		
	}
	}
