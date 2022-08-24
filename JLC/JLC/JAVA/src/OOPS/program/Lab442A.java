package OOPS.program;

abstract class Hello83{
	public abstract void show();
	public abstract void display();
}

public class Lab442A {

	public static void main(String[] args) {
		new Hello83(){
			public void show() {
				System.out.println("show() in Anonymous");
			}
			public void display() {
				System.out.println("display() in Anonymous");
			}
			void m1(){
				System.out.println("New m1() in Anonymous");
			}
		}.m1();
	}
}
