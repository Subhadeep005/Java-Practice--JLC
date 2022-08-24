package Java.lang.Practice;

import java.io.*;

public class Hello19 {
	void show() throws IOException{} //Checked Exception
}
class Hai10 extends Hello19{
	@Override
	void show() throws ClassNotFoundException{} //(Checked)Non sub-Class of IOExceptions
}