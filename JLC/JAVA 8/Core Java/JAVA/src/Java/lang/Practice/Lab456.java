package Java.lang.Practice;

public class Lab456 {

	public static void main(String[] args) {
		Employee1 emps[]=new Employee1[500];
		for (int i = 0; i < emps.length; i++) {
			//new Employee1("JLC-"+(i+1));
			emps[i]=new Employee1("JLC-"+(i+1));
		}
	}

}

class Employee1{
	String eid;
	double add[]=new double[123456];
	Employee1(String eid) {
		this.eid=eid;
		System.out.println("\nObject created with id:"+eid);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("FINALIZE -->"+eid);
	}
}