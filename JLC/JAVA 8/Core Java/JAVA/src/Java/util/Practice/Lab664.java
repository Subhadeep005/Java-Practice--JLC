package Java.util.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab664 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas"); list.add("Dande"); list.add("Nivas"); list.add("Kumar");  list.add("Nivas");
		System.out.println("list : "+list);
		System.out.println("\nREPLACEING NIVAS WITH JLC");
		Collections.replaceAll(list, "Nivas", "JLC");
		System.out.println(list);
		Object mx = Collections.max(list);
		System.out.println("\nMAX OBJ : "+mx);
		Object mn = Collections.min(list);
		System.out.println("\nMIN OBJ : "+mn);
		System.out.println("\nREPLACING ALL WITH JLC");
		Collections.fill(list, "JLC");
		System.out.println(list);
	}

}
