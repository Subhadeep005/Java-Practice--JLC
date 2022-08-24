package OOPS.program;

public class Lab270 {

	public static void main(String[] args) {
		Student7 stu1=new Student7(88,"Srinivas");
		stu1.show();
		Student7 stu2=new Student7(99,"Dande");
		stu2.show();
	}

}
class Student7{
	int sid;
	String sname;
	Student7(int sid, String sname){
		System.out.println("Student 2-Arg Constructor");
		this.sid=sid;
		this.sname=sname;
	}
	void show(){
		System.out.println(sid+"\t"+sname);
	}
	}