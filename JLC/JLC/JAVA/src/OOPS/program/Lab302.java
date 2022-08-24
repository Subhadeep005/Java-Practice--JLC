package OOPS.program;

public class Lab302 {

	public static void main(String[] args) {
		Hello35 h=new Hello35();
		byte b=20;
		h.add(10,b);
		h.add(b,10);

	}

}
class Hello35{
	
	void add(int a, byte b){
		System.out.println("add(int,byte)");
		//System.out.println(a+b);
	}
		
	void add(byte a, int b){
		System.out.println("add(byte,int)");
		//System.out.println(a+b);
	}
}