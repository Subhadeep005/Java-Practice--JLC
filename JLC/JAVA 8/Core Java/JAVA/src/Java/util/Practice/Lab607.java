package Java.util.Practice;

import java.util.ArrayList;
import java.util.List;

public class Lab607 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri"); list.add("Nivas"); list.add("Dande"); //list.add(99);
		System.out.println(list);
		list.set(1,"Java"); //For Replacing
		System.out.println(list);
		Object obj = list.get(2); //For Getting Particular Element
		System.out.println(obj);
		System.out.println(list);
	}

}
