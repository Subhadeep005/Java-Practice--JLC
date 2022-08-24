package OOPS.program;

public class Lab274 {

	public static void main(String[] args) {
		
		Hello11 h=null;
		//h.show(); // Instance method cannot refer reference variable which contain null.  
		h=new Hello11();
		h.show();
		//Hello11.show(); // Instance method cannot called by class name.
	}

}

class Hello11{
	void show(){
		System.out.println("Instance show()");
	}
}