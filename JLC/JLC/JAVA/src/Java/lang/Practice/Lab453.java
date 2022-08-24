package Java.lang.Practice;

class Hai2{
	int x;
	Hai2(int x){
		this.x=x;
	}
}
class Hello2 implements Cloneable{
	int y;
	Hai2 hai;
	Hello2(int y, Hai2 hai){
		this.y=y;
		this.hai=hai;
	}
	void show(){
		System.out.println("Hello2 ->y :"+y);
		System.out.println("Hai2 ->x :"+hai.x);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		if(this instanceof Cloneable){
			System.out.println("clone():"+this);
			System.out.println(this.hai.x);
		Hai2 hai=new Hai2(this.hai.x);
		Hello2 h=new Hello2(this.y,hai);
		return h;
		}
		else
			throw new CloneNotSupportedException(getClass().getName());
	}
}

public class Lab453 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Hai2 hai=new Hai2(10);
		Hello2 h1=new Hello2(20,hai);
		Hello2 h2=(Hello2) h1.clone();
		//System.out.println(h1);
		//System.out.println(h2);
		h1.show();
		h2.show();
		System.out.println("**************");
		System.out.println("h1==h2 ->"+(h1==h2));
		System.out.println("h1.hai==h2.hai ->"+(h1.hai==h2.hai));
		System.out.println("h1.y==h2.y ->"+(h1.y==h2.y));
		System.out.println("h1.hai.x==h2.hai.x ->"+(h1.hai.x==h2.hai.x));
		System.out.println("****************");
		h2.y=30;
		h1.show();
		h2.show();
		System.out.println("********************");
		h2.hai.x=111;
		h1.show();
		h2.show();
		}
}
