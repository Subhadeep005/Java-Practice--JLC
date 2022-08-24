package OOPS.program;

public class Lab228 {

	public static void main(String[] args) {
		
		new Hello2().a=99;
		//Hello2 h=new Hello2();
		//h.a=100;
		//System.out.println(h.a);
		System.out.println(new Hello2().a);
	}

}
class Hello2{
	int a;
}