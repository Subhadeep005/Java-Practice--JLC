package OOPS.program;

public class Lab393 {

	public static void main(String[] args) {
		Person pob=null;
		pob=new Student10(); //Dynamic Dispatch(Upcasting)
		pob.eating();
		pob=new Employee(); //Dynamic Dispatch(Upcasting)
		pob.eating();
	}

}
