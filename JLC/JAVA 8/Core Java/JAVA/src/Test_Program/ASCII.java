package Test_Program;
public class ASCII {

	public static void main(String[] args) {
		System.out.println("ASCII value of Uppercase Alphabet");
		for(char ch='A';ch<='Z';ch++)
			System.out.println(ch+"-->"+(int)ch);
		System.out.println("ASCII value of Lowercase Alphabet");
		for(char ch='a';ch<='z';ch++)
			System.out.println(ch+"-->"+(int)ch);
	}

}
