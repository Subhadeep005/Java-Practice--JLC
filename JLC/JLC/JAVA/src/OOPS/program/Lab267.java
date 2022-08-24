package OOPS.program;

public class Lab267 {

	public static void main(String[] args) {
		Hello6 h=new Hello6();
		h.show();
		System.out.println(h);
	}

}

class Hello6{
	int a=10;
	void show(){
		String a="JLC";
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this);
	}
}