package Java.util.Practice;

import java.util.TreeSet;

public class Lab635 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Student3(99, "Sri"));
	}

}
class Student3{
	int sid; String name;

	public Student3(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
	@Override
	public String toString() {
		return sid+"\t"+name;
	}
}