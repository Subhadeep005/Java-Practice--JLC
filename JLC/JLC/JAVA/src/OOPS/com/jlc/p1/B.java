package OOPS.com.jlc.p1;
public class B extends A{
	A aref=new A();
	//B bref=new B();
	public void showB(){
		System.out.println("Current sub class of A in same Package(Class B)");
		System.out.println("B ---> Show()");
		System.out.println("******Directly******");
		//System.out.println(a); //Private
		System.out.println("Default-->"+b);
		System.out.println("Protected-->"+c);
		System.out.println("Public-->"+d);
		System.out.println("******this******");
		//System.out.println(this.a);//Private
		System.out.println("Default-->"+this.b);
		System.out.println("Protected-->"+this.c);
		System.out.println("Public-->"+this.d);
		System.out.println("******super******");
		//System.out.println(super.a);//Private
		System.out.println("Default-->"+super.b);
		System.out.println("Protected-->"+super.c);
		System.out.println("Public-->"+super.d);
		System.out.println("******Object of current class******");
		B bref=new B();
		//System.out.println(bref.a);//Private
		System.out.println("Default-->"+bref.b);
		System.out.println("Protected-->"+bref.c);
		System.out.println("Public-->"+bref.d);
		System.out.println("******Object of super class A******");
		//System.out.println(aref.a);//Private
		System.out.println("Default-->"+aref.b);
		System.out.println("Protected-->"+aref.c);
		System.out.println("Public-->"+aref.d);
		
	}
}
