package Java.lang.Practice;

public class Lab584 {

	public static void main(String[] args) {
		Hello32 h1=new Hello32();      Hello32 h2=new Hello32();
		MyThread9 th1=new MyThread9(h1);
		MyThread9 th2=new MyThread9(h1);
		//MyThread9 th2=new MyThread9(h2);
		th1.start();       th2.start();
	}

}

class MyThread9 extends Thread{
	Hello32 h=null;
	MyThread9(Hello32 h){
		this.h=h;
	}
	public void run(){
		h.show();
	}
}

class Hello32{
	static void show(){
		Thread th=Thread.currentThread();
		synchronized (Hello32.class) {
		for(int i=1; i<=5; i++){
			System.out.println(th.getName()+" - SHOW :"+i);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		}
	}
}