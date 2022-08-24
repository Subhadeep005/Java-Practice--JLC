package OOPS.com.jlc.p2;
import OOPS.com.jlc.p1.Hello;
class xyz extends Hello{}
class Hai extends Hello{
	void show(){
		System.out.println("Hai --> show()");
		Hello h=new Hello();
		System.out.println(h.ab);
		xyz ref=new xyz();//other sub class
		System.out.println(ref.ab);
	}
}
public class Lab371 {

	public static void main(String[] args) {
		Hai hai=new Hai();
		hai.show();
	}

}
