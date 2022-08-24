package Java.lang.Practice;

import java.io.*;

public class Hello24 {
	void show() throws ArrayIndexOutOfBoundsException{} //Unchecked Exception
}
class Hai15 extends Hello24{
	@Override
	void show() throws ClassNotFoundException{} //Checked Exception
}