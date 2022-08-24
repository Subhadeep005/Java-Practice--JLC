package OOPS.program;

public class Lab272 {

	public static void main(String[] args) {
		
		Hello9 h=new Hello9();

	}

}
class Hello9{
	
	Hello9(){
		this(); //Cyclic constructor invocation not allowed.
	}
}
