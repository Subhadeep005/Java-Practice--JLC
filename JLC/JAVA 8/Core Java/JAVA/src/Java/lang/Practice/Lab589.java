package Java.lang.Practice;

public class Lab589 {

	public static void main(String[] args) {
		Service s=new Service();
		s.run();
		for(char ch='A'; ch<='J';ch++){
			System.out.println("main Running :"+ch);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}

class Service extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<=10;i++){
			System.out.println("Service Running :"+i);
			if(i==5){
				int x=10/0;
			}
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}