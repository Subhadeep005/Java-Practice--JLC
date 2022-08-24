package Java.lang.Practice;

public class Lab448 {

	public static void main(String[] args) {
		student4 st1=new student4(99,"Sri");
		student4 st2=new student4(88,"Nivas");
		System.out.println(st1);
		System.out.println(st2);
	}

}

class student4{
	int sid;
	String name;
	student4(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	@Override
	public String toString() {
	return sid +" \t "+ name;
	}
}