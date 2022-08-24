package Java.lang.Practice;

public class Hello {

	void show(){}
	void display(){}
}
class Hai1 extends Hello{
	@Override
	void show(){}
	@Override
	void display() throws NullPointerException{} //Unchecked Exception
}