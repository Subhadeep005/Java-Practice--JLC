package Java.lang.Practice;

public class Lab539 {

	public static void main(String[] args) {
		Hello6 h=Hello6.getHello();
		System.out.println(h);
		System.out.println(Hello6.getHello());
		System.out.println(Hello6.getHello());
	}

}

class Hello6{
	private static Hello6 INS=null;
	private Hello6(){}
	public static Hello6 getHello(){
	if(INS==null){
		INS=new Hello6();
	}
	return INS;
	}
}