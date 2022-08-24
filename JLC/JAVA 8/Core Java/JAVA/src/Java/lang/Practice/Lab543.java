package Java.lang.Practice;

public class Lab543 {

	public static void main(String[] args) {
		Student10 st=new Student10(99,"Srinivs",65799999);
		System.out.println(st);
		System.out.println(st.getSid());
		/*Student10 st1=new Student10(100,"Srinivs",65799999);
		System.out.println(st1);
		System.out.println(st1.getSid());*/
	}

}

final class Student10{
	private final int sid;
	private final String name;
	private final long phone;
	public Student10(int sid, String name, long phone){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
	}
	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public long getPhone() {
		return phone;
	}
	public String toString() {
		return "sid=" + sid + ", name=" + name + ", phone=" + phone ;
	}
}