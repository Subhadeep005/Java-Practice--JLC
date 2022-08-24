package Java.lang.Practice;

public class Lab578 {

	public static void main(String[] args) {
		MyThread4 t1=new MyThread4();
		t1.setPriority(10);
		//t1.setPriority(0);
		//t1.setPriority(11);
		System.out.println(t1);
	}

}

class MyThread4 extends Thread{}