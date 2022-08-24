package OOPS.program;

interface Inter15{}
class A40 implements Inter15{}
class B38 extends A40{}
class C10 extends A40{}

public class Lab432 {

	public static void main(String[] args) {
		Inter15 arr[]=null;
		arr=new B38[3];
		arr[0]=new A40(); //super type Object
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
