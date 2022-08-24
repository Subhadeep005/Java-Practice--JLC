package Java.lang.Practice;

public class Hello28 {
	//INVALID before Java 7 but VALID from Java 7:
	void show() throws CloneNotSupportedException{ //sub type
		try{
			this.clone();
		}catch(Exception e){ //super type
			throw e;
		}
	}
}