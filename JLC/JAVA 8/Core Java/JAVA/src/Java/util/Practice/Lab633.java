package Java.util.Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab633 {

	public static void main(String[] args) {
		System.out.println("** STUDENT INFO **");
		TreeSet set = new TreeSet();
		set.add(new Student2(87, "Sri"));
		set.add(new Student2(99, "Dande"));
		set.add(new Student2(12, "SD"));
		set.add(new Student2(45, "Nivas"));
		//System.out.println(set);
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
class Student2 implements Comparable{
	int sid; String name;

	public Student2(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Student2){
			Student2 st = (Student2)obj;
			return this.sid-st.sid;
		}
		return 0;
	}
	@Override
	public String toString() {
		return sid +"\t"+ name;
	}
}