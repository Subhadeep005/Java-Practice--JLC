package Java.util.Practice;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab659 {

	public static void main(String[] args) {
		Queue<String> que = new PriorityQueue<String>();
		que.add("Srinivas");
		que.add("Manish");
		que.add("Kumar");
		que.add("Dande");
		que.add("Ranjan");
		System.out.println(que);
		System.out.println("Size : "+que.size());
		System.out.println("Peek : "+que.peek());
		System.out.println("Size : "+que.size());
		System.out.println("Element : "+que.element());
		System.out.println("Size : "+que.size());
		System.out.println("Pool : "+que.poll());
		System.out.println("Size : "+que.size());
	}

}
