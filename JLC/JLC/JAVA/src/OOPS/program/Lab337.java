package OOPS.program;

public class Lab337 {

	public static void main(String[] args) {
		Hello60 h=new Hello60();
	}

}

class Hai10{
	{
		System.out.println("Hai ->I.B.");
	}
	static{
		System.out.println("Hai ->S.B.");
	}
}
class Hello60 extends Hai10{
	{
		System.out.println("Hello ->I.B.");
	}
	static{
		System.out.println("Hello ->S.B.");
	}
}