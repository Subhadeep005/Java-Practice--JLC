package OOPS.program;

public class Lab280 {

	public static void main(String[] args) {
		
		Operation.showRemainder(10,4);
		Operation.showRemainder(10,0);
	}

}
class Operation{
	static void showRemainder(int a, int b){
		System.out.println(a%b);
	}
}