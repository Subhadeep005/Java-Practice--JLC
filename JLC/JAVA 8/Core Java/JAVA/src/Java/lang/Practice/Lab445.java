package Java.lang.Practice;

public class Lab445 {

	public static void main(String[] args) {
		System.out.println("\n***with Employee***");
		Employee emp1=new Employee(99, 31903290);
		Employee emp2=new Employee(99, 31903290);
		Employee emp3=new Employee(88, 65799999);
		Employee emp4=emp1;
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
		System.out.println("**************");
		System.out.println(emp1==emp2);
		System.out.println(emp1==emp3);
		System.out.println(emp1==emp4);
		System.out.println(emp3==emp4);
	}

}
class Employee{
	int eid;
	long phone;
	Employee(int eid,long phone){
		this.eid=eid;
		this.phone=phone;
	}
	@Override
	public int hashCode() {
		return (int)(phone | eid);
	}
}
