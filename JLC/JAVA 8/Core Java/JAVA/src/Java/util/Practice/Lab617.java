package Java.util.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab617 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri"); list.add("Nivas"); list.add("Dande");
		list.add("Java"); list.add("JSP"); list.add("JDBC");
		ListIterator lit=list.listIterator();
		while(lit.hasNext()){
		Object obj=lit.next();
		System.out.println(obj);
	}
	}
}
