package OOPS.program;

public class Lab405 {

	public static void main(String[] args) {
		Person1 pob=new CurrentStudent();
		pob.sleeping();
		pob.walking();
		//System.out.println(Person1.a);
		//System.out.println(pob.b);
		
	}

}
abstract class Person1{
	/*static int a=99;
	int b=88;
	Person1() {
		System.out.println("constructor");
	}
	{
		System.out.println("Block");
	}*/
	abstract void sleeping();
	abstract void walking();
}
 abstract class Student11 extends Person1{
	void sleeping(){
		System.out.println("Student --> sleeping()");
	}
}
 class CurrentStudent extends Student11{
	 void walking(){
		 System.out.println("currentStudent --> walking()");
	 }
 }