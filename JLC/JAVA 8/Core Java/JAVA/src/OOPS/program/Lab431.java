package OOPS.program;

interface Inter14{}
class A39 implements Inter14{}
class B37 extends A39{}
class C9 extends A39{}

public class Lab431 {

	public static void main(String[] args) {
		Inter14 arr[]=new Inter14[3];
		arr[0]=new A39();
		arr[1]=new B37();
		arr[2]=new C9();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
