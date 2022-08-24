package Java.lang.Practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab594 {

	public static void main(String[] args) {
		MyThread15 th=new MyThread15();
		ExecutorService ser=Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++){
			ser.execute(th);
		}
	}
}

class MyThread15 implements Runnable{
	public void run(){
		Thread th=Thread.currentThread();
		for(int i=0; i<5;i++){
			System.out.println(th.getName()+"\t----->"+i);
			try {
				th.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(th.getName()+" task Completed**");
		}
	}
}