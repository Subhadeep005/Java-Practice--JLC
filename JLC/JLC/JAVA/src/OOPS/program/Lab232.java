package OOPS.program;

public class Lab232 {

	public static void main(String[] args) {
		
		Test1 t=new Test1();
		System.out.println(t.a);
		t.a=99;
		System.out.println(t.a);
	}

}
 class Test1{
	 static int a;
 }