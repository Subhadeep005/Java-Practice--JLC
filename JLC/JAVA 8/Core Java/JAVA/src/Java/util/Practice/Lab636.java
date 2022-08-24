package Java.util.Practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab636 {

	public static void main(String[] args) {
		TreeSet tset = new TreeSet(new SidComparator());
		tset.add(new Student4(88, "Manish"));
		tset.add(new Student4(22, "Nivas"));
		tset.add(new Student4(99, "Rahul"));
		tset.add(new Student4(77, "Abhi"));
		tset.add(new Student4(100, "Subha"));
		Iterator it = tset.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}

class Student4{
	int sid; String name;

	public Student4(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
	@Override
	public String toString() {
		return sid+"\t"+name;
	}
}
class SidComparator implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		/*System.out.println("Compare");
		System.out.println(ob1+"\t\t"+ob2);*/
		if(ob1 instanceof Student4 && ob2 instanceof Student4){
			Student4 s1 = (Student4)ob1;
			Student4 s2 = (Student4)ob2;
			return s1.sid-s2.sid;
		}
		return 0;
	}
	
}