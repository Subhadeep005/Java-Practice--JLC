package OOPS.program;

public class Lab299 {

	public static void main(String[] args) {
		
		Hello32 h=new Hello32();
		String a=h.add("JLC",99);
		System.out.println(a);
		String b=h.add(99,"JLC");
		System.out.println(b);
	}

}
class Hello32{
	String add(String a,int b){
		System.out.println("add(String,int)");
		return a+b;
	}
	String add(int a,String b){
		System.out.println("add(int,String)");
		return a+b;
	}
}