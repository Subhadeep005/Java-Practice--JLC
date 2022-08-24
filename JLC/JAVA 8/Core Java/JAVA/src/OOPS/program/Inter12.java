package OOPS.program;

public interface Inter12 {
int AB=90;
}
class Hai20 implements Inter12{
	void show(){
		System.out.println(super.AB); //Interface cannot refer by super keyword.
	}
}
