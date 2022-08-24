package Test_Program;

public class Test4 {
	public static void main(String  args[]) {
		int arr[]=new int[2];
		Class cls=arr.getClass();
		System.out.println(cls.getSuperclass().getName());
	}}
