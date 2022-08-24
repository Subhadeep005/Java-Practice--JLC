package OOPS.program;

class Hello39{
	long factorial(int n){
		if(n==0 || n==1)
			return 1;
		else{
			return n*factorial(n-1);
		}
	}
}

public class Lab306 {

	public static void main(String[] args) {
		
		Hello39 h=new Hello39();
		int n=4;
		long fac=h.factorial(n);
		System.out.println("Factorial of "+n+" is="+fac);
	}

}
