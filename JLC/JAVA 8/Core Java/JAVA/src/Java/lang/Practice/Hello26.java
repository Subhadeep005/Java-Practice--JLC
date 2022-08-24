package Java.lang.Practice;

public class Hello26 {
	void show() throws Exception{ //same type
		try{
			this.clone();
		}catch(Exception e){ //same type
			throw e;
		}
	}
}