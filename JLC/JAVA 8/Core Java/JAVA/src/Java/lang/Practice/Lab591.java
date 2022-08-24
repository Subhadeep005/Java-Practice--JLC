package Java.lang.Practice;

public class Lab591 {

	public static void main(String[] args) {
		Thread th1=new Thread();
		MyThread13 th2=new MyThread13();
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
class MyThread13 extends Thread{
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