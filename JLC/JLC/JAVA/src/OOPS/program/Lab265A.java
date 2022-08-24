package OOPS.program;

public class Lab265A {

	public static void main(String[] args) {
		new Student9(77,"SD"); 
		}

	}
	class Student9{
		int sid;
		String sname;
		Student9(int id, String sn){
			System.out.println("Student 2-Arg Constructor");
			sid=id;
			sname=sn;
			System.out.println(sid+"\t"+sname);
			}
		Student9(){
			System.out.println("Student Default Constructor");
		}
	void show(){
		System.out.println(sid+"\t"+sname);
	}
	}