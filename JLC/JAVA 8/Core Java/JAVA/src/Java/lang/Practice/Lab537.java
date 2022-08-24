package Java.lang.Practice;

public class Lab537 {

	public static void main(String[] args) {
		//Hello4 hello=new Hello4();
		Hello4 h=Hello4.getHello();
		System.out.println(h);
		System.out.println(Hello4.getHello());
		System.out.println(Hello4.getHello());
		//h.clone();
	}

}

class Hello4{
	private static Hello4 INS=new Hello4();
	private Hello4(){};
	public static Hello4 getHello(){
		return INS;
	}
}