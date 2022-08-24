package OOPS.program;

public class Lab303 {

	public static void main(String[] args) {
		Hello36 h=new Hello36();
		byte b=20;
		h.add(b,b);

	}

}
class Hello36{
	
	void add(byte a, int b){
		System.out.println("add(byte,int)");
		//System.out.println(a+b);
	}
	
	void add(int a, byte b){
		System.out.println("add(int,byte)");
		//System.out.println(a+b);
	}
}