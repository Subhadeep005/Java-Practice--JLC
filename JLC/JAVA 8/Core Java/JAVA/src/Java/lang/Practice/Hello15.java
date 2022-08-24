package Java.lang.Practice;

import java.io.IOException;

public class Hello15 {
	void show() throws IOException{} //Checked Exception
}
class Hai6 extends Hello15{
	@Override
	void show() throws IOException{} //Checked Exceptions
}