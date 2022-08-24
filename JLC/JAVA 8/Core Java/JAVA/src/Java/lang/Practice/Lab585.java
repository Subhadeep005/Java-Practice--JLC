package Java.lang.Practice;

public class Lab585 {

	public static void main(String[] args) {
		Hello33 h1=new Hello33();
		MyThread10 th1=new MyThread10(h1);
		MyThread10 th2=new MyThread10(h1);
		th1.start();       th2.start();
	}

}

class MyThread10 extends Thread{
	Hello33 h=null;
	MyThread10(Hello33 h){
		this.h=h;
	}
	public void run(){
		h.show();
	}
}

class Hello33{
	synchronized void show(){
		Thread th=Thread.currentThread();
		for(int i=1; i<=5; i++){
			System.out.println(th.getName()+" - SHOW :"+i+"\t"+this);
			try{
				wait(1000);
				//Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}