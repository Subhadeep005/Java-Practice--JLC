package OOPS.program;

public class Lab396 {

	public static void main(String[] args) {
		Person pob=null;
		pob=new Student10();
		pob.reading(); //reading method is not a Person class method, it is a newly defined method of Student class.
		pob=new Employee();
		pob.working(); //working method is not a Person class method, it is a newly defined method of Employee class.
	}

}
