package OOPS.program;

public class Lab227 {

	public static void main(String[] args) {
		Hello1 h1=new Hello1();
		Hello1 h2=new Hello1();
		System.out.println(h1.a+"\t"+h2.a);
		h1.a=99;
		System.out.println(h1.a+"\t"+h2.a);

	}

}

class Hello1{
	 int a;
}