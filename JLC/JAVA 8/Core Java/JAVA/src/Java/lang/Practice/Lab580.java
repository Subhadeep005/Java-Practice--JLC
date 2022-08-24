package Java.lang.Practice;

class Account{
	int bal=970;
	public  void withdraw(int amt){
		if(bal >= amt){
			System.out.println(Thread.currentThread().getName()+" is going to withdraw :"+bal);
			try{
				Thread.sleep(1200);
			}catch(Exception e){}
			bal-=amt;
			System.out.println(Thread.currentThread().getName()+" is completed withdraw :"+bal);
		}else{
			System.out.println("No Funds for "+Thread.currentThread().getName());
		}
	}
	public int getBal(){
		return bal;
	}
}

class AccountThread implements Runnable{
	Account acc=null;
	public AccountThread(Account acc) {
		this.acc=acc;
		Thread t1=new Thread(this, "A");
		Thread t2=new Thread(this, "B");
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++){
			acc.withdraw(225);
			if(acc.getBal()<0){
				System.out.println("Amount is Overdrawn......");
			}
		}
	}
}


public class Lab580 {
	public static void main(String[] args) {
		Account acc=new Account();
		new AccountThread(acc);
	}
}
