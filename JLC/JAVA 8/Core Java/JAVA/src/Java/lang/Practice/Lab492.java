package Java.lang.Practice;

public class Lab492 {

	public static void main(String[] args) {
		String str="JLCINDIA";
		byte barr[]=str.getBytes();
		System.out.println("**byte array**");
		for (int i = 0; i < barr.length; i++) {
			byte b=barr[i];
			System.out.println(i+"\t"+barr[i]+"====>  "+(char)b);
		}
	}

}
