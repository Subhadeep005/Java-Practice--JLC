package OOPS.program;

public class Lab294 {

	public static void main(String[] args) {
		
		Hello27 h=new Hello27();
		byte b=12;
		h.show(b);
		h.show((byte)12);

	}

}
class Hello27{
	void show(byte x){
		System.out.println("show(byte)");
		//System.out.println(x);
	}
}