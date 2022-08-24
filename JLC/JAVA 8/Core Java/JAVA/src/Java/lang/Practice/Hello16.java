package Java.lang.Practice;

import java.io.IOException;

public class Hello16 {
	void show() throws IOException{} //Checked Exception
}
class Hai7 extends Hello16{
	@Override
	void show() throws NullPointerException{} //Unchecked Exceptions
}