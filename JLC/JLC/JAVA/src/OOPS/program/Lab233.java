package OOPS.program;

public class Lab233 {

	public static void main(String[] args) {
	
		Test2 t1=new Test2();
		//t1.show();
		Test2 t2=new Test2();
		System.out.println(t1.a+"\t"+t2.a);
		t1.a=99;
		System.out.println(t1.a+"\t"+t2.a);
		//t2.show();
	}

}
 
class Test2{
	static int a;
	
	//void show(){
	//System.out.println(a);
	//}
}