package OOPS.program;

public class Lab292 {

	public static void main(String[] args) {
		Hello25 h=new Hello25();
		System.out.println(h.isDigit('A'));
		System.out.println(h.isDigit('8'));
	}

}
class Hello25{
		boolean isDigit(char ch){
		System.out.println("isDigit():"+ch);
		if(ch>=48 && ch<=57)
		return true;
		else
			return false;
	
	}
}