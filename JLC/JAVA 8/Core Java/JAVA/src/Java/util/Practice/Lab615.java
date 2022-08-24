package Java.util.Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab615 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri"); list.add("Nivas"); list.add("Dande"); list.add(99);
		Iterator it=list.iterator();
		int size=list.size();
		//list.remove("Sri"); //we cannot modify the  elements using collection object while accessing the data using iterator.
		for(int i=0;i<size;i++)
		System.out.println(it.next());
		it.remove();
		System.out.println("Main Completed");
	}

}
