package OOPS.program;

public interface Inter13 {
	int AB=90;
}
class Hello81{
	String AB="JLC";
}
class Hai21 extends Hello81 implements Inter13{
	void show(){
		System.out.println(super.AB);
		System.out.println(Inter13.AB);
	}
}
