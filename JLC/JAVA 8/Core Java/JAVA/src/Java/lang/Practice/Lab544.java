package Java.lang.Practice;

public class Lab544 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		String data=args[0];
		int x=Integer.parseInt(data);
		int res=10/x;
		System.out.println("Result is :"+res);
		System.out.println("Main End");
	}

}

/*Execute Lab544 As a Command Line Argument:
	Case 1: java Lab544
	Case 2: java Lab544 JLC
	Case 3: java Lab544 0
	Case 4: java Lab544 3*/