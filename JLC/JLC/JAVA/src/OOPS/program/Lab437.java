package OOPS.program;

class Hello82{
	{
		System.out.println("I.B Hello");
		class Inner{
			Inner(){
				System.out.println("D.C Inner in I.B");
			}
		}
		Inner inrob=new Inner();
	}
	static{
		System.out.println("S.B Hello");
		class Inner{
			Inner(){
				System.out.println("D.C Inner in S.B");
			}
		}
		Inner inrob=new Inner();
	}
	Hello82(){
		System.out.println("D.C Hello");
		class Inner{
			Inner(){
				System.out.println("D.C Inner in D.C Hello");
		}
		}
		Inner inrob=new Inner();
	}
	void m1(){
		System.out.println("m1() --> Hello");
		class Inner{
			Inner(){
				System.out.println("D.C Inner in m1()");
		}
		}
		Inner inrob=new Inner();
	}
}

public class Lab437 {

	public static void main(String[] args) {
		System.out.println("Hello Guys!");
		Hello82 hello=new Hello82();
		hello.m1();
	}

}
