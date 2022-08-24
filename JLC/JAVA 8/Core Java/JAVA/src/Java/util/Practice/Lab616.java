package Java.util.Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab616 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri"); list.add("Nivas"); list.add("Dande");
		list.add("Java"); list.add("JSP"); list.add("JDBC");
		Iterator it=list.iterator();
		while(it.hasNext()){
		Object obj=it.next();
		System.out.println(obj);
	}
	}
}
