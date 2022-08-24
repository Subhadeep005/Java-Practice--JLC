package Java.lang.Practice;

public class Lab447 {

	public static void main(String[] args) {
		System.out.println("***Default Implementation***");
		student3 st1=new student3(99,"Sri");
		System.out.println(st1);
		System.out.println("***Custom Implementation***");
		String cname=st1.getClass().getName();
		int hc=st1.hashCode();
		String hx=Integer.toHexString(hc);
		String msg=cname+"@"+hx;
		System.out.println(msg);
	}

}

class student3{
	int sid;
	String name;
	student3(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
}