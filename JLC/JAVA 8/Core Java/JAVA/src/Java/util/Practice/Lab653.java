package Java.util.Practice;

import java.util.ArrayList;
import java.util.List;

public class Lab653 {

	public static void main(String[] args) {
		ArrayList<Integer> inList = new ArrayList<Integer>();
		inList.add(1234);
		inList.add(4567);
		inList.add(8910);
		showElement(inList);
		ArrayList<Float> fList = new ArrayList<Float>();
		fList.add(123.456F);
		fList.add(456.34F);
		fList.add(789.456F);
		fList.add(123.432F);
		showElement(fList);
		ArrayList<String> stList = new ArrayList<String>();
		//showElement(stList);
	}
static void showElement(List<? extends Number> list){
	for(Number num : list){
		System.out.println(num +",");
	}
	System.out.println("\n");
}
}
