package OOPS.program;

public class Lab397 {

	public static void main(String[] args) {
		Person pob=null;
		pob=new Student10();
		Student2 stu=(Student2)pob; //Downcasting
		stu.reading();
		pob=new Employee();
		Employee emp=(Employee)pob; //Downcasting
		emp.working();
	}

}
