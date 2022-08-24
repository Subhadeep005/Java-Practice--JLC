package Java.lang.Practice;

public class Lab543A {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("JLC");
		/*System.out.println(sb);
		System.out.println("sb="+sb.hashCode());*/
		Hello1 h1=new Hello1(10,20,sb);
		Hello1 temp=h1;
		System.out.println(h1);
		sb.append("INDIA");
		System.out.println(h1);
		/*System.out.println(sb);
		System.out.println("sb="+sb.hashCode());*/
		System.out.println(h1==temp);
		StringBuilder sb2=h1.getVal();
		/*System.out.println(sb2);
		System.out.println("sb2="+sb2.hashCode());*/
		sb2.append(99);
		/*System.out.println(sb2);
		System.out.println("sb2="+sb2.hashCode());*/
		System.out.println(h1);
	}

}
final class Hello1{
	private final int x;
	private final int y;
	private StringBuilder val;
	Hello1(int x,int y,StringBuilder val){
		this.x=x;
		this.y=y;
		//this.val=val;
		this.val=new StringBuilder(val);
		//System.out.println("Hello="+this.val.hashCode());
	}
	public String toString() {
		return "x=" + x + ", y=" + y + ", val=" + val ;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public StringBuilder getVal() {
		//return val;
		StringBuilder val2=new StringBuilder(val);
		//System.out.println("getVal="+val2.hashCode());
		return val2;
	}
}