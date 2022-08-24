package OOPS.program;

public class Lab311 {

	public static void main(String[] args) {
		
		Hello44 h=new Hello44();
		h.sum(12,23);
		h.sum(12,23,43);
	}

}

class Hello44{
	void sum(int a, int b){
		System.out.println("sum(int,int)");
		System.out.println(a+b);
	}
	void sum(int a, int b, int c){
		System.out.println("sum(int,int,int)");
		System.out.println(a+b+c);
	}
}