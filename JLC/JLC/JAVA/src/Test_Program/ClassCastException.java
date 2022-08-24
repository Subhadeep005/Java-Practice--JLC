package Test_Program;

import java.util.Arrays;

class A1{}
class B1 extends A1{}
class D extends B1{}
class C extends A1{}

public class ClassCastException {

	public static void main(String[] args) {
		
		A1 aob=new A1();
		B1 bob=(B1)aob; //ClassCastException
		C cob=(C)aob; //ClassCastException
		
		A1 aob1=new B1();
		B1 bob1=(B1)aob1;
		C cob1=(C)aob1; //ClassCastException
		
		A1 aob2=new C();
		B1 bob2=(B1)aob2; //ClassCastException
		C cob2=(C)aob2;
		
		A1 aref=new D();
		D dref=(D)aref;
		B1 bref=(B1)aref;
		C cref=(C)aref; //ClassCastException
	}

}