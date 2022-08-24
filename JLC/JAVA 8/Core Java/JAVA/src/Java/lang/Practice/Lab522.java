package Java.lang.Practice;

public class Lab522 {

	public static void main(String[] args) {
		Object obj=123;
		Number num=123L; //AutoBoxing
		Object obj1=num; //Dynamic dispatch / Type casting (UP Casting) (AutoBoxing and type casting support in java).
		System.out.println(obj);
		System.out.println(num);
		System.out.println(obj1);
		
		/*Long val=123;
		Integer in=new Integer(123);
		Long val=in;*/ //(No Inheritance relation between Long and Integer).
		
	}

}
