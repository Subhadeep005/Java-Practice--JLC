package Java.util.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab667 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new StringBuilder("Srinivas"));
		list.add(new StringBuilder("Dande"));
		list.add(new StringBuilder("Abhi"));
		list.add(new StringBuilder("Kumar"));
		list.add(new StringBuilder("Nivas"));
		System.out.println(list);
		//Collections.sort(list); //java.lang.ClassCastException
		System.out.println("\nSorting StringBuilder");
		Collections.sort(list, new StringBuilderComp());
		System.out.println(list);
	}

}
class StringBuilderComp implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
			return s1.compareTo(s2);
	}
}
