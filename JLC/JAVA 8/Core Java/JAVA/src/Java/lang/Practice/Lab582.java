package Java.lang.Practice;

public class Lab582 {

	public static void main(String[] args) {
		Hello30 h1=new Hello30();      Hello30 h2=new Hello30();
		MyThread7 th1=new MyThread7(h1);
		MyThread7 th2=new MyThread7(h1);
		//MyThread7 th2=new MyThread7(h2);
		th1.start();       th2.start();
	}

}

class MyThread7 extends Thread{
	Hello30 h=null;
	MyThread7(Hello30 h){
		this.h=h;
	}
	public void run(){
		h.show();
	}
}

class Hello30{
	void show(){
		Thread th=Thread.currentThread();
		synchronized (this) {
		for(int i=1; i<=5; i++){
			System.out.println(th.getName()+" - SHOW :"+i+"\t"+this);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		}
	}
}