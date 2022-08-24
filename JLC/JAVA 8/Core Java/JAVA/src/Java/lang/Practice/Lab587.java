package Java.lang.Practice;

import java.util.ArrayList;

public class Lab587 {

	public static void main(String[] args) {
			Hello35 h1=new Hello35();
			MyThread12 th1=new MyThread12(h1);
			MyThread12 th2=new MyThread12(h1);
			th1.start();       th2.start();
		}

	}

	class MyThread12 extends Thread{
		Hello35 h=null;
		MyThread12(Hello35 h){
			this.h=h;
		}
		public void run(){
			h.show();
		}
	}

	class Hello35{
		void show(){
			ArrayList al=new ArrayList();
			Thread th=Thread.currentThread();
			synchronized (al) {
			for(int i=1; i<=5; i++){
				System.out.println(th.getName()+" - SHOW :"+i+"\t"+this);
				try{
					//wait(1000);
					al.wait(1000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	}