package OOPS.program;

abstract class Person3{
	public abstract void sleeping();
}
class Student13 extends Person3{
	public void sleeping() {
		System.out.println("Student --> sleeping()");
	}
}

public class Lab439 {

	public static void main(String[] args) {
		Person3 p=new Student13();
		p.sleeping();
	}

}
