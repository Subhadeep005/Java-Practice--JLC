package OOPS.program;

public class Lab398 {

	public static void main(String[] args) {
		A36 aobj=new B34();
		System.out.println(aobj.x); //Because method overriding is there but variable overriding concept is not there.
	}

}
class A36{
	int x=10;
}
class B34 extends A36{
	String x="JLC";
}