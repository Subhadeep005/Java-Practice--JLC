package OOPS.program;

public class Lab304 {

	public static void main(String[] args) {
	
		Hello37 h=new Hello37();
		h.show(null); //--->First Preference child class then parent class(Object class).
		h.show("JLC");
		h.show(h);
	}

}
class Hello37{
	void show(String str){
		System.out.println("show(String)");
		//System.out.println(str);
	}
	void show(Object str){
		System.out.println("show(Object)");
		//System.out.println(str);
	}
	/*void show(Hello37 str){
		System.out.println("show(Hello37)");
		//System.out.println(str);
	}*/
	
}
