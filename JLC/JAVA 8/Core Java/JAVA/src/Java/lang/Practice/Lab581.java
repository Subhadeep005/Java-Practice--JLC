package Java.lang.Practice;

public class Lab581 {

	public static void main(String[] args) {
		Hello29 h1=new Hello29();      Hello29 h2=new Hello29();
		MyThread6 th1=new MyThread6(h1);
		MyThread6 th2=new MyThread6(h1);
		//MyThread6 th2=new MyThread6(h2);
		th1.start();    th2.start();
	}

}

class MyThread6 extends Thread{
	Hello29 h=null;
	MyThread6(Hello29 h){
		this.h=h;
	}
	public void run(){
		h.show();
	}
}

class Hello29{
	synchronized void show(){
		Thread th=Thread.currentThread();
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