package OOPS.program;

public class Lab305 {

	public static void main(String[] args) {
		Hello38 h=new Hello38();
		h.show("JLC");
		h.show(h);
		//h.show(null); //----Ambiguous.
	}

}
class Hello38{
	void show(String str){
		System.out.println("show(String)");
		//System.out.println(str);
	}
	void show(Hello38 str){
		System.out.println("show(Hello38)");
		//System.out.println(str);
	}
	
}