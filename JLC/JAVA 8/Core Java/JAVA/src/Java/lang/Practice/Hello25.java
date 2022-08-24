package Java.lang.Practice;

public class Hello25 {
	void show() throws CloneNotSupportedException{
		try{
			this.clone();
		}catch(CloneNotSupportedException e){
			throw e;
		}
	}
}