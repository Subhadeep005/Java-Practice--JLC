package Java.lang.Practice;

public class Lab504A {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("JLC, Java Lerning");
		//sb.ensureCapacity(69);
		
		//The parameter (68) > current capacity and next capacity then 
		//the StringBuilder will get the parameter value the capacity of StringBuilder.
		
		//sb.ensureCapacity(30);
		
		//The parameter (30) < current capacity and next capacity then 
		//the StringBuilder will will be with the old capacity value.
		
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
	}

}
