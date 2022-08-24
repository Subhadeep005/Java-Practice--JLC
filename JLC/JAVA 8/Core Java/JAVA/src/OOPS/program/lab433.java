package OOPS.program;

interface Inter16{}
class A41 implements Inter16{}
class B39 extends A41{}
class C11 extends A41{}

public class lab433 {

	public static void main(String[] args) {
		Inter16 arr[]=new B39[3];
		arr[0]=new B39();
		arr[1]=new B39();
		arr[2]=new C11(); //C and B no inheritance relation is there.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
