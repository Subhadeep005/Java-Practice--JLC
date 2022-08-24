package OOPS.program;

abstract class Person6{
	public abstract void sleeping();
}

public class Lab442 {

	public static void main(String[] args) {
		Person6 stu=new Person6(){
			public void sleeping() {
				System.out.println("Student --> sleeping()");
			}
		};
		stu.sleeping();
	}
}
