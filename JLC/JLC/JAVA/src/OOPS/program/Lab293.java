package OOPS.program;

public class Lab293 {

	public static void main(String[] args) {
		
		Hello26 h=new Hello26();
		System.out.println(h.show(10));

	}

}
class Hello26{
	int show(int x){
		System.out.println("show()");
		return x+1;
	}
}