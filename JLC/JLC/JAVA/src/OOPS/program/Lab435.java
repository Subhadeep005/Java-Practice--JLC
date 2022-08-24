package OOPS.program;

class Outer1{
	int a=11;
	class Inner{
		int a=22;
		void show(){
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Inner.this.a);
			//System.out.println(super.a);
			System.out.println(new Outer1().a);
			System.out.println(Outer1.this.a);
		}
	}
}

public class Lab435 {

	public static void main(String[] args) {
		new Outer1().new Inner().show();
	}

}
