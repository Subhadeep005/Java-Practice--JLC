import java.util.Scanner;
class test{
public static void main(String[] args) {
	System.out.println("Enter a string:");
	Scanner sc =new Scanner(System.in);
	String str=sc.nextLine();
	char arr[]=str.toCharArray();
	System.out.println("Enter the particuler character which you want to find:");
	Scanner sc1 =new Scanner(System.in);
	char ch=sc1.next().charAt(0);	
	System.out.print("Your searched character '"+ch+"' is position:"+(str.indexOf(ch)+1));
}
}