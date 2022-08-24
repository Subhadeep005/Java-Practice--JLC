package OOPS.program;

public class Lab300 {

	public static void main(String[] args) {
		
		Hello33 h=new Hello33();
		byte b=20;
		h.add(10,b);
		h.add(b,b);

	}

}
class Hello33{
	void add(int a, byte b){
		System.out.println("add(int,byte)");
		//System.out.println(a+b);
	}
}