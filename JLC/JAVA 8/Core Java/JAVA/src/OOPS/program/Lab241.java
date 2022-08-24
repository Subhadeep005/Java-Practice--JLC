package OOPS.program;

public class Lab241 {

	public static void main(String[] args) {
		
		Test8 t=new Test8();
		System.out.println("Main :"+t.a);
	}

}
class Test8{
	int a;
	{
		a=10;
		System.out.println("Initialized :"+a);
	}
}