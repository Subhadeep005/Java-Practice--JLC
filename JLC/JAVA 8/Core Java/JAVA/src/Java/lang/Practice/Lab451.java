package Java.lang.Practice;

public class Lab451 {

	public static void main(String[] args) {
		student6 st1=new student6(99,"Sri");
		student6 st2=new student6(99,"Sri");
		student6 st3=new student6(88,"Nivas");
		student6 st4=st1;
		
		System.out.println("Using == op");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		System.out.println(st2==st3);
		
		System.out.println("using Overriden equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));

	}

}
class student6{
	int sid;
	String name;
	student6(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof student6){
			student6 st=(student6)obj;
		return this.sid==st.sid && this.name.equals(st.name);//This equals method overriden method of string class not recursive call.
	}
		return false;
	}
}

