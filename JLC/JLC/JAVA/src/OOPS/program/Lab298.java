package OOPS.program;

public class Lab298 {

	public static void main(String[] args) {
		
		Hello31 h=new Hello31();
		int a=h.add(10,20);
		System.out.println(a);
		String b=h.add("JLC",99);
		System.out.println(b);
	}

}
class Hello31{
	int add(int a,int b){
		System.out.println("add(int,int)");
		return a+b;
	}
	String add(String a,int b){
		System.out.println("add(String,int)");
		return a+b;
	}
}