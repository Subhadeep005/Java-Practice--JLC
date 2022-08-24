package Java.lang.Practice;

public class Lab540 {

	public static void main(String[] args) {
		Hello7 h=Hello7.getHello();
		System.out.println(h);
		System.out.println(Hello6.getHello());
		System.out.println(Hello6.getHello());
		Hello7 h2=(Hello7)h.clone();
		System.out.println(h2);
	}

}

class Hello7{
	private static Hello7 INS=new Hello7();
	private Hello7(){};
	public static Hello7 getHello(){
		return INS;
	}
	protected Object clone() {
		return this;
	}
}