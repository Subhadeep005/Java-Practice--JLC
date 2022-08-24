package Test_Program;

public class Aramstrong {

	public static void main(String[] args) {
		System.out.println("\n**** Aramstrong number between 1 to 1000****\n");
		int limit=9999;
		for (int num = 2; num <=limit; num++) {
			int sum=0;
			int num1=num;
			if(num<1000){
			while(num1!=0){
				int digit=num1%10;
				sum=sum+(digit*digit*digit);
				num1=num1/10;
			}
			}
			else{
				while(num1!=0){
					int digit=num1%10;
					sum=sum+(digit*digit*digit*digit);
					num1=num1/10;
			}
			}
			if(sum==num)
				System.out.println("Number is Aramstong number="+num);
		}
	}
}
