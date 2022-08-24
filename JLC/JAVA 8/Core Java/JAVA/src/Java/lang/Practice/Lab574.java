package Java.lang.Practice;

public class Lab574 {

	public static void main(String[] args) {
		MyThread th1=new MyThread();
		MyThread th2=new MyThread();
		ThreadGroup tg=th1.getThreadGroup();
		ThreadGroup tg1=th1.getThreadGroup();
		System.out.println("MyThread th1 :"+tg+"\t\t"+th1.getPriority()+"\nMyThread th2 :"+tg1+"\t\t"+th2.getPriority());
		th1.start();  th2.start();
		Thread th=Thread.currentThread();
		ThreadGroup tg2=th.getThreadGroup();
		System.out.println("Main th :"+tg2+"\t\t"+th.getPriority());
		for(int i=100;i<=110;i++){
			System.out.println(th.getName()+"--value is :"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		Thread t =Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println(t.getName()+"--value is :"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		ThreadGroup tg=t.getThreadGroup();
		System.out.println("Mythread :"+tg+"\t\t"+t.getPriority());
	}
}
