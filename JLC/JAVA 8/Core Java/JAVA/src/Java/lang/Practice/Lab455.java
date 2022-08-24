package Java.lang.Practice;

class Hai3{
	public void finalize(){
		System.out.println("Hai --> finalize() ");
	}
}

class Hello3{
	void show(){
		System.out.println("show()");
	}
	void m1(){
		System.out.println("m1() --> start");
		Hai3 hai1=new Hai3();
		Hai3 hai2=new Hai3();
		Hai3 hai3=new Hai3();
	}
	public void finalize(){
		System.out.println("Hello --> finalize() ");
	}
}

public class Lab455 {

	public static void main(String[] args) {
		new Hello3().show();
		Hello3 h1=new Hello3();
		h1=null;
		Hello3 h2=new Hello3();
		Hello3 h3=new Hello3();
		h2=h3;
		new Hello3().m1();
		//System.runFinalization();
		System.gc();
	}

}
