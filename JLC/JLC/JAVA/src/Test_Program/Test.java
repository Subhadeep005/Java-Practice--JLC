package Test_Program;

public class Test {
	public static void display(){
		System.out.println("Display in Test");
	}
	public static void show(){
		System.out.println("Show in test");
	}
	public static void main(String[] args) {
	Test s=new sub();
	s.show();
	s.display();
	}

}
class sub extends Test{

	//@Override
	public static void show(){
		System.out.println("Show in sub");
	}
}