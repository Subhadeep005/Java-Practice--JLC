package Java.util.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab619 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri"); list.add("Nivas"); list.add("Dande");
		list.add("Java"); list.add("JSP"); list.add("JDBC");
		ListIterator lit=list.listIterator();
		System.out.println("FORWORD ORDER");
		while(lit.hasNext()){
			int indx=lit.nextIndex();
		Object obj=lit.next();
		System.out.println(indx+"\t"+obj);
		}
		System.out.println("REVERSE ORDER");
		while(lit.hasPrevious()){
			int indx=lit.previousIndex();
		Object obj=lit.previous();
		System.out.println(indx+"\t"+obj);
		}
	}
}
