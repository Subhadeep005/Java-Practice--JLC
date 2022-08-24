package OOPS.program;

public class Lab397 {

	public static void main(String[] args) {
		
		Person pob=null;
		
		pob=new Student10();
		Student10 stu=(Student10)pob; //Downcasting
		stu.reading(); //Newly define Method of Student class.
		stu.eating(); //Method of Person class.
		stu.walking(); //Override method of Person class to Student class
		
		pob=new Employee();
		Employee emp=(Employee)pob; //Downcasting
		emp.working(); //Newly define Method of Employee class.
		emp.eating(); //Method of Person class.
		emp.walking(); //Override method of Person class to Employee class
	}

}
