package Java.lang.Practice;

public class Lab446 {

	public static void main(String[] args) {
		student2 st1=null;
		System.out.println(st1);
		st1=new student2(99,"Sri");
		System.out.println(st1);
		String str=new String("Java Learning Center");
		System.out.println(str); //Overriden in String class.
		Integer ref= new Integer(123); //Overriden in Integer class.
		System.out.println(ref);
	}

}

class student2{
	int sid;
	String name;
	student2(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
}