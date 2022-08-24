package Java.lang.Practice;

import java.util.ArrayList;

public class Lab586 {

	public static void main(String[] args) {
		Hello34 h1=new Hello34();
		MyThread11 th1=new MyThread11(h1);
		MyThread11 th2=new MyThread11(h1);
		th1.start();       th2.start();
	}

}

class MyThread11 extends Thread{
	Hello34 h=null;
	MyThread11(Hello34 h){
		this.h=h;
	}
	public void run(){
		h.show();
	}
}

class Hello34{
	synchronized void show(){
		ArrayList al=new ArrayList();
		Thread th=Thread.currentThread();
		for(int i=1; i<=5; i++){
			System.out.println(th.getName()+" - SHOW :"+i+"\t"+this);
			try{
				wait(1000);
				//al.wait(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}