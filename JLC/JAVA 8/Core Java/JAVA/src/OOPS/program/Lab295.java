package OOPS.program;

public class Lab295 {

	public static void main(String[] args) {
		Hello28 h=new Hello28();
		h.show('A');
		h.show((char)65);

	}

}
class Hello28{
	void show(char x){
		System.out.println("show(char)");
		System.out.println(x);
	}
}