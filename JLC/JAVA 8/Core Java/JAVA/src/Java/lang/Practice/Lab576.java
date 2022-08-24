package Java.lang.Practice;

public class Lab576 {

	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("WE");
		MyThread2 th1=new MyThread2(tg, "JLC-Thread");
		MyThread2 th2=new MyThread2();
		th1.start(); th2.start();
	}
}

class MyThread2 extends Thread{
	public MyThread2(ThreadGroup tg, String name) {
		super(tg,name);
}
	public MyThread2() {}
	
	public void run(){
		ThreadGroup tg=getThreadGroup();
		int pri=getPriority();
		for(int i=1; i<=5; i++){
			System.out.println(i+"\t"+getName()+"\t"+tg.getName()+"\t"+pri);
		}
	}
}