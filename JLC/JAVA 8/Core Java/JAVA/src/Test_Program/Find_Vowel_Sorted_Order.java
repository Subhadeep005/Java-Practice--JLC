package Test_Program;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Find_Vowel_Sorted_Order {

	public static void main(String[] args) {
		System.out.println("Enter the sentance : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		TreeSet<Character> ch = new TreeSet<>();
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || 
					arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
				ch.add(arr[i]);
			}
		}
		//System.out.println(ch);
		Iterator it = ch.iterator();
		while(it.hasNext())
		System.out.print(it.next()+" ");
	}

}
