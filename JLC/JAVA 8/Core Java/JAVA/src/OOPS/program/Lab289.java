package OOPS.program;

public class Lab289 {

	public static void main(String[] args) {
		Hello22 h=new Hello22();
		System.out.println(h.show(10));
	}

}
class Hello22{
		long show(int x){
		System.out.println("show()");
		return x+1;
	
	}
}