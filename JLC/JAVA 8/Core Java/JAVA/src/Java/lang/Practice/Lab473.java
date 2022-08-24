package Java.lang.Practice;

public class Lab473 {

	public static void main(String[] args) {
		Student7 stu=new Student7();
		String st1=String.valueOf(stu);
		System.out.println(st1);
		//System.out.println(stu);
		Employee2 emp=new Employee2();
		String st2= String.valueOf(emp);
		System.out.println(st2);
		//System.out.println(emp);
	}
}
class Student7{}
class Employee2{
	int eid;
	@Override
	public String toString(){
		return "Eid:"+eid;
	}
}
