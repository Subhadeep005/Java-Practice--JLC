package Java.lang.Practice;

public class Lab579 {

	public static void main(String[] args) throws InterruptedException {
		MyThread5 t=new MyThread5();
		System.out.println(t);
		Thread th=new Thread(t);
		System.out.println(th);
		System.out.println(th.getState());
		th.start();
		Thread.sleep(500);
		System.out.println(th.getState());
		Thread.sleep(5000);
		System.out.println(th.getState());
	}

}

class MyThread5 extends Thread{
	@Override
	public void run() {
		Thread th=Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println(th.getName()+"-- value is :"+i+"\t"+th.getState());
		try{
			Thread.sleep(500);
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	}
}