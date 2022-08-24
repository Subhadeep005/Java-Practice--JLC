package Test_Program;

import java.util.HashMap;
import java.util.Map;

public class First {

	public static void main(String[] args) {
		Map<Second, String> m = new HashMap<Second, String>();
		Second t1 = new Second("A");
		Second t2 = new Second("A");
		Second t3 = new Second("A");
		m.put(t1, "AB");
		m.put(t2, "DF");
		m.put(t3, "EF");
		System.out.println(m.size());
	}

}

class Second{
	String str;
	public Second(String s) {
		str=s;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("eqls");
		return ((Second)obj).equals(this.str);
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return (8);
	}
}