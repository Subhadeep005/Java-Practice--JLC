package OOPS.program;

public class Lab296 {

	public static void main(String[] args) {
		
		Hello29 h=new Hello29();
		int a=h.add(10,20);
		System.out.println(a);
		h.add(10,30);
	}

}
class Hello29{
	int add(int a,int b){
		System.out.println("add(int,int)");
		return a+b;
	}
	void add(int a,int b){
		System.out.println("add(int,int)");
	}
}