package OOPS.program;

public class Lab271 {

	public static void main(String[] args) {
		
		Hello8 h=new Hello8(99);
		h.show();
	}

}

class Hello8{
	int a;
	Hello8(){
		System.out.println("Hello DC");
	}
	Hello8(int a){
		this();
		System.out.println("Hello 1-arg Constructor");
		this.a=a;
	}
	void show(){
System.out.println(a);		
	}
}