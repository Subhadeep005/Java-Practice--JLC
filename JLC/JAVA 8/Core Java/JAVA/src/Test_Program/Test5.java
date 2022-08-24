package Test_Program;

public class Test5 {
	public static void main(String[] args) {
	Test5 s=new sub();
	s.show();
	s.display();
	}
	public static void display(){
		System.out.println("Display in Test");
	}
	public static void show(){
		System.out.println("Show in test");
	}

}
class sub extends Test5{

	//@Override
	public static void show(){
		System.out.println("Show in sub");
	}
}