package OOPS.program;

public class Lab263 {

	public static void main(String[] args) {

		Student3 stu1=new Student3(99,"Sri","sri@jlc",99999);
		stu1.show();
		Student3 stu2=new Student3(88,"vas","vas@jlc");
		stu2.show();
		Student3 stu3=new Student3(77,"SD");
		stu3.show();
		Student3 stu4=new Student3(77);
		stu4.show();
		Student3 stu5=new Student3();
		stu5.show();
	}

}
class Student3{
	int sid;
	String sname;
	String email;
	long phone;
	Student3(int id, String sn,String em, long ph){
		System.out.println("Student 4-Arg Constructor");
		sid=id;
		sname=sn;
		email=em;
		phone=ph;
		
	}
	Student3(int id, String sn,String em){
		System.out.println("Student 3-Arg Constructor");
		sid=id;
		sname=sn;
		email=em;
	}
	Student3(int id, String sn){
		System.out.println("Student 2-Arg Constructor");
		sid=id;
		sname=sn;
	}
	Student3(int id){
		System.out.println("Student 1-Arg Constructor");
		sid=id;
	}
	Student3(){
		System.out.println("Student Default Constructor");
	}
void show(){
	System.out.println(sid+"\t"+sname+"\t"+email+"\t"+phone);
}
}