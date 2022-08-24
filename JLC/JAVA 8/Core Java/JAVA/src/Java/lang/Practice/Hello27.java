package Java.lang.Practice;

public class Hello27 {
	void show() throws Exception{ //super type
		try{
			this.clone();
		}catch(CloneNotSupportedException e){ //sub type
			throw e;
		}
	}
}