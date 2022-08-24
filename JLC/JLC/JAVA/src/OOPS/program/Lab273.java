package OOPS.program;

public class Lab273 {

	public static void main(String[] args) {
		Hello10 h=new Hello10();

	}

}
class Hello10{
	
	Hello10(){
		this(10); //Cyclic constructor invocation not allowed.
	}
	Hello10(int a){
		this(); //Cyclic constructor invocation not allowed.
	}
}
