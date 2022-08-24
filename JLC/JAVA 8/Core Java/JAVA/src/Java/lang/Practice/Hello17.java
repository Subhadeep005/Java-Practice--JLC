package Java.lang.Practice;

import java.io.*;

public class Hello17 {
	void show() throws IOException{} //Checked Exception
}
class Hai8 extends Hello17{
	@Override
	void show() throws FileNotFoundException{} //Sub Class of IOExceptions
}