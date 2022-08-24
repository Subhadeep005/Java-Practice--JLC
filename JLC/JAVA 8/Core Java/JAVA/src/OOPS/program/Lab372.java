package OOPS.program;

public class Lab372 {

	public static void main(String[] args) {
		A16 aobj=new A16(98);
		System.out.println(aobj.getX());
		aobj.setX(123);
		//System.out.println(aobj.getX());
	}

}
class A16{
	private int x;
	A16(int x){
		this.x=x;
	}
	public void setX(int x){
		this.x=x;
	}
	public int getX(){
		return this.x;
	}
}