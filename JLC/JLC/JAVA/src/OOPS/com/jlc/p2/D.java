package OOPS.com.jlc.p2;
import OOPS.com.jlc.p1.A;
public class D extends A{
	A aref=new A();
	//D dref=new D();
	public void showD(){
		System.out.println("Current sub class of A in different Package(Class D)");
		System.out.println("D ---> Show()");
		System.out.println("******Directly******");
		//System.out.println(a);//Private
		//System.out.println(b);//Default
		System.out.println("Protected-->"+c);
		System.out.println("Public-->"+d);
		System.out.println("******this******");
		//System.out.println(this.a);//Private
		//System.out.println(this.b);//Default
		System.out.println("Protected-->"+this.c);
		System.out.println("Public-->"+this.d);
		System.out.println("******super******");
		//System.out.println(super.a);//Private
		//System.out.println(super.b);//Default
		System.out.println("Protected-->"+super.c);
		System.out.println("Public-->"+super.d);
		System.out.println("******Object of current class******");
		D dref=new D();
		//System.out.println(dref.a);//Private
		//System.out.println(dref.b);//Default
		System.out.println("Protected-->"+dref.c);
		System.out.println("Public-->"+dref.d);
		System.out.println("******Object of super class A******");
		//System.out.println(aref.a);//Private
		//System.out.println(aref.b);//Default
		//System.out.println(aref.c);//Protected
		System.out.println("Public-->"+aref.d);
	}
}
