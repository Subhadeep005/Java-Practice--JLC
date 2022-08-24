package Java.lang.Practice;

public class Lab504 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("JLC");
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.trimToSize();
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
	}

}
