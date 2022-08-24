package Java.util.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab668 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas"); list.add("Dande"); list.add("Abhi"); list.add("Kumar"); list.add("Nivas");
		List synList = Collections.synchronizedList(list);
		System.out.println("synch \t "+synList);
		System.out.println("list \t "+list);
		List unModi = Collections.unmodifiableList(list);
		System.out.println("un modi\t" +unModi);
		System.out.println("\n**MODIFYNING LIST**");
		list.add("Manish");
		System.out.println("list \t "+list);
		System.out.println("un modi\t "+unModi);
		//unModi.add("JLCINDIA");  //java.lang.UnsupportedOperationException
	}

}
