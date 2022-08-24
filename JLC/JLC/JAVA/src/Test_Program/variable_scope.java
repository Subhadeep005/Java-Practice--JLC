package Test_Program;

public class variable_scope {

	public static void main(String[] args) {
		h h1=new h();
		System.out.println(h1.b);
		System.out.println(h1.st);
		h1.show();
	
	}

}
class h{
int b;//Instance Variable.
static int st;//Static Variable.
void show(){
int show=10;//Local Variable.
System.out.println(show);
}
}
