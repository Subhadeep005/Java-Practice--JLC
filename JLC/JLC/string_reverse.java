import java.util.Scanner;
class test {
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter Your String:");
    String input = sc.nextLine();
    char array[]= input.toCharArray();
for (int i=array.length-1;i>=0;i--)
            System.out.print(array[i]);
}
}