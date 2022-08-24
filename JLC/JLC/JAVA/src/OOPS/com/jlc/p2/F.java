package OOPS.com.jlc.p2;

import OOPS.com.jlc.p1.A;

public class F extends A{
D dref=new D();
public void showF(){
	System.out.println("Sub class of A but using other sub class of A i.e, D in different Package(Class F)");
	System.out.println("F ---> Show()");
	System.out.println("******Object of D class******");
	//System.out.println(aref.a);//Private
	//System.out.println(aref.b);//Default
	//System.out.println(aref.c);//Protected
	System.out.println("Public-->"+dref.d);
	}
}
