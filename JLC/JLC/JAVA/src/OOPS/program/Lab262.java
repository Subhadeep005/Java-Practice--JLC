package OOPS.program;

public class Lab262 {

	public static void main(String[] args) {
		
		Student2 stu1=new Student2(10,"Subha");
		stu1.show();
		Student2 stu2=new Student2(20,"Srinivas");
		stu2.show();
	}

}
class Student2{
	int sid;
	String sname;
	Student2(int id, String sn){
		sid=id;
		sname=sn;
		
	}
void show(){
	System.out.println(sid+"\t"+sname);
}
}