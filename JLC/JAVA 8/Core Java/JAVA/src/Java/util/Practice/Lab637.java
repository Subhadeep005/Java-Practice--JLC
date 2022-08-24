package Java.util.Practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab637 {

	public static void main(String[] args) {
		TreeSet tset = new TreeSet(new NameComparator());
		tset.add(new Student5(88, "Manish"));
		tset.add(new Student5(22, "Nivas"));
		tset.add(new Student5(99, "Rahul"));
		tset.add(new Student5(77, "Abhi"));
		tset.add(new Student5(100, "Subha"));
		Iterator it = tset.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}

class Student5{
	int sid; String name;

	public Student5(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
	@Override
	public String toString() {
		return sid+"\t"+name;
	}
}
class NameComparator implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		/*System.out.println("Compare");
		System.out.println(ob1+"\t\t"+ob2);*/
		if(ob1 instanceof Student5 && ob2 instanceof Student5){
			Student5 s1 = (Student5)ob1;
			Student5 s2 = (Student5)ob2;
			return s1.name.compareTo(s2.name);
		}
		return 0;
	}

}
