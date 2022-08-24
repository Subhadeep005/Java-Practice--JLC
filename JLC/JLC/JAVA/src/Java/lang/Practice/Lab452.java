package Java.lang.Practice;

class Hai{
	int x;
	Hai(int x){
		this.x=x;
	}
}
class Hello implements Cloneable{
	int y;
	Hai hai;
	Hello(int y, Hai hai){
		this.y=y;
		this.hai=hai;
	}
	void show(){
		System.out.println("Hello ->y :"+y);
		System.out.println("Hai ->x :"+hai.x);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Lab452 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Hai hai=new Hai(10);
		Hello h1=new Hello(20,hai);
		Hello h2=(Hello) h1.clone();
		h1.show();
		h2.show();
		System.out.println("******************");
		System.out.println("h1==h2 ->"+(h1==h2));//Both addresses are different.
		System.out.println("h1.hai==h2.hai ->"+(h1.hai==h2.hai));//Both are contain the same address of Hai class.
		System.out.println("h1.y==h2.y ->"+(h1.y==h2.y));//compare the content of the variable. 
		System.out.println("h1.hai.x==h2.hai.x ->"+(h1.hai.x==h2.hai.x));//compare the content of the variable x of Hai class. 
		System.out.println("*******************");
		h2.y=30;
		h1.show();
		h2.show();
		System.out.println("********************");
		h2.hai.x=111;
		h1.show();
		h2.show();
		}
}
