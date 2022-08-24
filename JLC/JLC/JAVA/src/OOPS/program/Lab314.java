package OOPS.program;

public class Lab314 {

	public static void main(String[] args) {
		
		Hello47 h=new Hello47();
		h.show();

	}

}

class Hello47{
	void show(int a,int...arr){
		System.out.println("\nshow(int,int...)");
	}
}