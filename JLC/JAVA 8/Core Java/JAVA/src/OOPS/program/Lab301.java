package OOPS.program;

public class Lab301 {

	public static void main(String[] args) {
		Hello34 h=new Hello34();
		byte b=20;
		h.add(b,10);
		h.add(b,b);

	}

}
class Hello34{
	void add(byte a, int b){
		System.out.println("add(byte,int)");
		//System.out.println(a+b);
	}
}