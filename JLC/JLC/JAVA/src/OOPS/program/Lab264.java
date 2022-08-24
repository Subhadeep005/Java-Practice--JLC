package OOPS.program;

public class Lab264 {

	public static void main(String[] args) {
		
		Student4 stu=new Student4();
		stu.Student4(77,"SD"); //Constructor only use with new operator not reference variable.
		stu.show();
	}

}
class Student4{
	int sid;
	String sname;
	Student4(int id, String sn){
		System.out.println("Student 2-Arg Constructor");
		sid=id;
		sname=sn;
		}
	Student4(){
		System.out.println("Student Default Constructor");
	}
void show(){
	System.out.println(sid+"\t"+sname);
}
}