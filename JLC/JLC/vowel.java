import java.util.Scanner;
class vowel{
int a;
vowel v1 =new vowel();
public static void main(String args[]){

System.out.print(a);
int v=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");

String str=sc.nextLine();
char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
		char ch = arr[i];
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'|| 
		ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
		v++;
		else
		System.out.print(ch);
		}
System.out.println("\nNo of vowel:"+v);
}
}