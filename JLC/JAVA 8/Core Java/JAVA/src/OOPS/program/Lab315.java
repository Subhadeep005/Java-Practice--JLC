package OOPS.program;

public class Lab315 {

	public static void main(String[] args) {
		
		Hello48 h=new Hello48();
		h.show(10);
		h.show(10,20);
		h.show(10,20,30);

	}

}

class Hello48{
	void show(int a,int...arr){
		System.out.println("\nshow(int,int...)");
	}
}