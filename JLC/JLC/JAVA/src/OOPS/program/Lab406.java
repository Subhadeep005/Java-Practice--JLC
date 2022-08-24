package OOPS.program;

public class Lab406 {

	public static void main(String[] args) {
		Person2 pob=new CurrentStudent1();
		pob.sleeping();
	}

}
abstract class Person2{
	abstract void sleeping();
}
 abstract class Student12 extends Person2{
	void sleeping(){
		System.out.println("Student --> sleeping()");
	}
}
 class CurrentStudent1 extends Student12{}