package OOPS.program;

public class Lab261 {

	public static void main(String[] args) {
		
		Student1 stu=new Student1();
		 //stu.show();
		stu.sid=99;
		stu.sname="subha";
		stu.show();

	}

}

class Student1{
	int sid;
	String sname;
	
	Student1(){
		System.out.println("student Default Constructor");
		//System.out.println(sid+"\t"+sname);
	}
void show(){
	System.out.println(sid+"\t"+sname);
}
}