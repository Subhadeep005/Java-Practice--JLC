package Java.util.Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab656A {

	public static void main(String[] args) {
		Student7<Integer,String> st1 = new Student7<Integer, String>();
		st1.sid=999;
		st1.name="RAJU";
		Student7<String,String> st2 = new Student7<String, String>();
		st2.sid="CC-1001";
		st2.name="SRINIVAS";
		Student7<Long,String> st3 = new Student7<Long, String>();
		st3.sid=3147485674852L;
		st3.name="NIVAS";
		Set<Student7> ts = new LinkedHashSet<Student7>();
		ts.add(st1); ts.add(st2); ts.add(st3);
		System.out.println(ts);
	}

}
class Student7<E,S>{
	E sid;
	S name;
	@Override
	public String toString() {
		return sid+"------->"+name;
	}
}
