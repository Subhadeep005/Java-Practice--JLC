import java.util.Scanner;
class test { 
	   public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter any Integer:");
	int a=sc.nextInt();
	      switch(a){

		case 1:System.out.println("Input  is 1");
		break;
		case 2:System.out.println("Input  is 2");
		break;
		case 3: System.out.println("Input  is 3");
		break;

		case 4:System.out.println("Input  is 4");
		break;
		case 5:System.out.println("Input  is 5");
		break;
				
		default:System.out.println("Default");
break;
		}	   
}
}