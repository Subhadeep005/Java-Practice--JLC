package Java.lang.Practice;

public class Lab575 {

	public static void main(String[] args) {
		MyThread1 th=new MyThread1();
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
		t1.start();  t2.start();
		Thread t=Thread.currentThread();
		for(int i=100;i<=110;i++){
			System.out.println(t.getName()+"--value is :"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class MyThread1 implements Runnable {
	@Override
	public void run() {
		Thread th =Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println(th.getName()+"--value is :"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
}
