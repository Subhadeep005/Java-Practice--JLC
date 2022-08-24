package Java.lang.Practice;

public class Lab593 {

	public static void main(String[] args) {
		Runnable r=new Runnable(){
			public void run(){
				Thread th=Thread.currentThread();
				for(int i=0;i<=10;i++){
					System.out.println(th.getName()+"\t"+i);
					try {
						th.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start(); t2.start();
	}

}
