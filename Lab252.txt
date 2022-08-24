class Lab252 {

	public static void main(String[] args) {
		System.out.println("Main :"+Test18.a);

	}

}
class Test18{
	
	static int a;
	
	static{
		static int b;
		System.out.println(a);
		System.out.println(b);
	}
}