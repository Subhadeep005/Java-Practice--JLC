package Java.lang.Practice;

public class Lab558 {

	public static void main(String[] args) {
		System.out.println("Main() Started");
		int r=new Hello9().show();
		System.out.println("Main() :"+r);
		System.out.println("Main() completed");
	}

}

class Hello9{
	int show(){
		int a=0;
		try{
			System.out.println("try block begins :"+a);
			a=10/4;
			System.out.println("try block end :"+a);
			return a;
		}catch(ArithmeticException e){
			a=20;
			System.out.println("catch block :"+a);
			return a;
		}finally{
			System.out.println("finally block :"+a);
			int arr[]=new int[-1];
		}
	}
}