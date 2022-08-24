package Java.lang.Practice;

public class Lab583 {

	public static void main(String[] args) {
		Hello31 h1=new Hello31();      Hello31 h2=new Hello31();
		MyThread8 th1=new MyThread8(h1);
		MyThread8 th2=new MyThread8(h1);
		//MyThread8 th2=new MyThread8(h2);
		th1.start();       th2.start();
	}

}

class MyThread8 extends Thread{
	Hello31 h=null;
	MyThread8(Hello31 h){
		this.h=h;
	}
	public void run(){
		h.show();
	}
}

class Hello31{
	synchronized static void show(){
		Thread th=Thread.currentThread();
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