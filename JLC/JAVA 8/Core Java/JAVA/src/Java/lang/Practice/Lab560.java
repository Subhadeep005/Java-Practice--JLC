package Java.lang.Practice;

public class Lab560 {

	public static void main(String[] args) {
		System.out.println("Main() Started");
		new Hello11().show("0");
		System.out.println("Main() completed");
	}

}

class Hello11{
	void show(String str){
		System.out.println("show() called");
		try{
			System.out.println("try block started");
			int a=Integer.parseInt(str);
			int b=10/a;
			System.out.println("try block completed :"+b);
			/*return 0;
			System.out.println("try block end");*/
		}catch(ArithmeticException e){
			System.out.println("catch block");
			/*return 0;
			System.out.println("catch block end");*/
			System.exit(0);
		}finally{
			System.out.println("finally block");
		}
	}
}