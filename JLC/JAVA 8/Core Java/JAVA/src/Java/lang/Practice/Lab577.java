package Java.lang.Practice;

public class Lab577 {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("WE");
		MyThread3 mth=new MyThread3();
		Thread th1=new Thread(tg,mth,"JLC-Thread");
		Thread th2=new Thread(mth);
		th1.start(); th2.start();
	}
}

class MyThread3 implements Runnable{
	public void run(){
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		int pri=th.getPriority();
		for(int i=1; i<=5; i++){
			System.out.println(i+"\t"+th.getName()+"\t"+tg.getName()+"\t"+pri);
		}
	}
}