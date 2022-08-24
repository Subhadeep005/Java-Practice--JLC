package Java.lang.Practice;

public class Lab450 {

	public static void main(String[] args) {
		
		student5 st1=new student5(99,"Sri");
		student5 st2=new student5(99,"Sri");
		student5 st3=new student5(88,"Nivas");
		student5 st4=st1;
		
		System.out.println("Using == op");
		System.out.println(st1==st2);//compare between addresses.(because reference data types)
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		System.out.println(st2==st3);
		
		System.out.println("using equals()");
		System.out.println(st1.equals(st2));//compare between addresses.(because it is a Object class equals method.)
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));

	}

}
class student5{
	int sid;
	String name;
	student5(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
}
