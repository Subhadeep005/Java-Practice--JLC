package OOPS.program;

public class Lab265 {

	public static void main(String[] args) {
		Student5 stu=new Student5();
		//stu.Student5(77,"SD");
		stu.show();
		Student5 st1=new Student5(88,"MK");
		st1.show();
	}

}
class Student5{
	int sid;
	String sname;
	Student5(int id, String sn){
		System.out.println("Student 2-Arg Constructor");
		sid=id;
		sname=sn;
		}
	Student5(){
		System.out.println("Student Default Constructor");
	}
void show(){
	System.out.println(sid+"\t"+sname);
}
}