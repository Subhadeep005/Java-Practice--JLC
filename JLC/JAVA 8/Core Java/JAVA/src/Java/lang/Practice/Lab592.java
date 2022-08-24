package Java.lang.Practice;

public class Lab592 {

	public static void main(String[] args) {
		Thread th1=new Thread();
		MyThread14 th2=new MyThread14();
		th2.setDaemon(true);
		th2.start();
		for(char ch='A';ch<='L';ch++){
			System.out.println(th1.getName()+"\t"+ch+"\t"+th1.isDaemon());
			try {
				th1.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
class MyThread14 extends Thread{
	public void run(){
		for(int i=0;i<=20;i++){
			System.out.println(getName()+"\t"+i+"\t"+isDaemon());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}