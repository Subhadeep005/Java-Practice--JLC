package Java.util.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab665 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas"); list.add("Dande"); list.add("Abhi"); list.add("Kumar"); list.add("Nivas");
		System.out.println("list : "+list);
		System.out.println("\nREVERSE");
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("\nROTATE(2)");
		Collections.rotate(list, 2);
		System.out.println(list);
		System.out.println("\nROTATE(-3)");
		Collections.rotate(list, -3);
		System.out.println(list);
		System.out.println("\nSHUFFLE");
		for(int i=0; i<5; i++){
			Collections.shuffle(list);
			System.out.println(list);
		}
	}

}
