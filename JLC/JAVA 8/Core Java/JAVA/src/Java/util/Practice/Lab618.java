package Java.util.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab618 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri"); list.add("Nivas"); list.add("Dande");
		list.add("Java"); list.add("JSP"); list.add("JDBC");
		ListIterator lit=list.listIterator();
		System.out.println(list);
		while(lit.hasNext()){
		Object obj=lit.next();
		System.out.println(obj);
		if(obj.equals("Nivas")) lit.remove();
		else if(obj.equals("Java")) lit.set("Core Java");
		else if(obj.equals("JSP")) lit.add("Servlets");
	}
		System.out.println(list);
	}
}
