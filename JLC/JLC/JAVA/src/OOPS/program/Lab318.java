package OOPS.program;

public class Lab318 {

	public static void main(String[] args) {
		
		Hello51 h=new Hello51();
		h.show(10);

	}

}

class Hello51{
	void show(int...arr1){
		System.out.println("\nshow(int...)");
	}
	void show(int[]arr1){
		System.out.println("\nshow(int[])");
	}
}