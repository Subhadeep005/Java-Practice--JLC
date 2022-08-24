package OOPS.program;

public class Lab269 {

	public static void main(String[] args) {
		Student6 stu1=new Student6(88,"Srinivas");
		stu1.show();
		Student6 stu2=new Student6(99,"Dande");
		stu2.show();
	}

}
class Student6{
	int sid;
	String sname;
	Student6(int sid, String sname){
		System.out.println("Student 2-Arg Constructor");
		sid=sid;
		sname=sname;
	}
	void show(){
		System.out.println(sid+"\t"+sname);
	}
	}