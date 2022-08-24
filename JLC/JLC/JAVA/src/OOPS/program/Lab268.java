package OOPS.program;

public class Lab268 {

	public static void main(String[] args) {
		Hello7 h=new Hello7();
		h.show();
		//System.out.println(h.b);
		//System.out.println(h.a);
	}

}

class Hello7{
	int a=10;
	static int b=20;
	Hello7 h1=null;
	void show(){
		String a="JLC";
		String b="SD";
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(Hello7.b);
		System.out.println(new Hello7().b);
		System.out.println(h1.b);
	}
}